package com.aurosoft.librarymanagementsystem.controller;


import com.aurosoft.librarymanagementsystem.entity.Book;
import com.aurosoft.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    public String getAllBooks(Model m)
    {
     List<Book> books = bookService.finaAllBooks();
     m.addAttribute("books", books);
     return "index";
    }
}
