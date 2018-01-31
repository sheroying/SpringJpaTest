package com.library.demo.book.module;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    Book findById(Long id);
    Book findByName(String name);
}
