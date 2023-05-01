package com.aurosoft.librarymanagementsystem.service;

import com.aurosoft.librarymanagementsystem.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {


    List<Book> finaAllBooks();


    Optional<Book> findBookById(Long id);


    Book createBook(Book book);

    Book updateBook(Book book);


    void deleteBook (Long id);



}
