package com.alsarraa.projects.googleBooksApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/books")
public class GoogleBooksController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GoogleBooksService googleBooksService;

    private final String googleBooksApiUrl = "https://books.googleapis.com/books/v1/";
    private String api_key = "AIzaSyDZ1XQdU8lRvYjmrYVqFQO2MH1WAKpMhE4"; // Put your Api Key


    // first, will check the book name in db if exist then the method findByBookName in GoogleBooksService will return it as List
    // and return response HTTP 200 OK
    // If not exist will return Null then it will call google books api if its found the book name will call method save to save it in the db
    // as block json {bookName + isbn} then return it as List with response HTTP 200 OK
    // If not found it will show response HTTP 404 NOT FOUND

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<GoogleBooks> searchBookByName(@PathVariable("name") String bookName) {

        GoogleBooks resultDB = googleBooksService.findByBookName(bookName);

        if (resultDB != null) return new ResponseEntity<>(resultDB, HttpStatus.OK);

        bookName = bookName.replaceAll(" ", "%20");

        String url = googleBooksApiUrl + "/volumes?q=" + bookName + "&maxResults=1" + "&key=" + api_key;

        RestTemplate restTemplate = new RestTemplate();

        Library resultApi = restTemplate.getForObject(url, Library.class);

        if (resultApi != null) {

            return new ResponseEntity(googleBooksService.save(resultApi), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}