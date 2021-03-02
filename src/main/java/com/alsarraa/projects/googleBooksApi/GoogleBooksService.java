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
        if (googleBooksRepository.findByBookName(book) != null)  {
            return googleBooksRepository.findByBookName(book);
        }
        return null;
    }

    public GoogleBooks save(Library book) {

        GoogleBooks googleBooks = new GoogleBooks();
        googleBooks.setBookName(book.getItems().get(0).getVolumeInfo().getTitle());
        googleBooks.setIsbn(book.getItems().get(0).getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier());

        return googleBooksRepository.insert(googleBooks);
    }
}
