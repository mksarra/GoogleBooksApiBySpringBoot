package com.alsarraa.projects.googleBooksApi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleBooksRepository extends MongoRepository<GoogleBooks, String> {

    GoogleBooks findByBookName(String bookName);
}
