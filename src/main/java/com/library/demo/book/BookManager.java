package com.library.demo.book;

import com.library.demo.book.module.Book;
import org.springframework.http.ResponseEntity;

public interface BookManager {
    ResponseEntity<Book> create(Book book);
    Book find(String id);
    Book update(Book book);
    void deleted(String id);

}
