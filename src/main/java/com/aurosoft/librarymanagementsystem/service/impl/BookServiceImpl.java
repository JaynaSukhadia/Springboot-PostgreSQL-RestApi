package com.aurosoft.librarymanagementsystem.service.impl;

import com.aurosoft.librarymanagementsystem.entity.Book;
import com.aurosoft.librarymanagementsystem.repository.BookRepository;
import com.aurosoft.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repo;
    @Override
    public List<Book> finaAllBooks() {
        return repo.findAll() ;
    }

    @Override
    public Optional<Book> findBookById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Book createBook(Book book) {
        return repo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
    return repo.save(book);

    }

    @Override
    public void deleteBook(Long id) {

        repo.deleteById(id);
    }
}
