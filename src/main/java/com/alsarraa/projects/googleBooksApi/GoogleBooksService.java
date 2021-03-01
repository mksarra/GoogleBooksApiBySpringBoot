package com.alsarraa.projects.googleBooksApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleBooksService {

    @Autowired
    private GoogleBooksRepository googleBooksRepository;

    // find book by name if exist return it
    // if not return null
    public GoogleBooks findByBookName(String book) {
        if (googleBooksRepository.findById(book) != null)  {
            return googleBooksRepository.findByBookName(book);
        }
        return null;
    }

    public GoogleBooks save(GoogleBooks book) {
        return googleBooksRepository.insert(book);
    }
}
