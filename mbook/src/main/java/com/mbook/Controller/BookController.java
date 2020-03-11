package com.mbook.Controller;

import com.mbook.Entity.Book;
import com.mbook.Repository.BookRepository;
import com.mbook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    private BookRepository bookRepository;


    @GetMapping("/books")
    public List<Book> books(){

        List<Book> booksList = bookService.findAll();

        return booksList;
        }

    @GetMapping("/bookss")
    public List<Book> book(){

        List<Book> booksList = bookRepository.findAll();

        return booksList;
    }

    @PostMapping("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public String showFormForAdd(@RequestBody Book book) {
        System.out.println(book.toString());
        bookService.save(book);
        return "book";
    }


}
