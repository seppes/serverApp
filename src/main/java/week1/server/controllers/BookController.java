package week1.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import week1.server.model.Book;
import week1.server.repositories.BookRepository;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @CrossOrigin
    @GetMapping("/books")
    public Iterable<Book> findAll() {
        Iterable<Book> books = bookRepository.findAll();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return books;
    }
}