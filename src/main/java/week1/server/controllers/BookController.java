package week1.server.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import week1.server.model.Book;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

@RestController
public class BookController {
    @CrossOrigin
    @GetMapping("/books")
    public List<Book> findAll() {
        Book[] books = {new Book("MaddAdam",10),
                new Book("The year of the flood",100),
                new Book("Oryx and Crake",200)};
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(books);
    }
}