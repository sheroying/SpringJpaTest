package com.library.demo.book;

import com.library.demo.book.module.Book;
import com.library.demo.book.module.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController implements BookManager {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = ""})
    public ResponseEntity<Book> create(Book book) {
        return null;
    }

    @GetMapping(value = "/{id}")
    public Book find(@PathVariable final Long id) {
        return bookRepository.findById(id);
    }


    public Book update(Book book) {
        return null;
    }

    public void deleted(String id) {

    }
}
