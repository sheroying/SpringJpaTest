package com.library.demo.book.module;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Setter
@Getter
@Entity
public class Book {
    @Id
    @GeneratedValue
    //@Column(name = "book_id")
    public long id;
    public String name;
    public String author;
    public String type;
    public String library;
    public Long price;
}
