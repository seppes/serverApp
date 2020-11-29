package week1.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import week1.server.model.Book;
import week1.server.repositories.BookRepository;

import static java.lang.Thread.sleep;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @CrossOrigin
    @PostMapping("/books")
    public Book create(@RequestBody Book book){
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bookRepository.save(book);
    }

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

//    @CrossOrigin
//    @DeleteMapping(path = "/{id}")
//    public ResponseEntity <Void> deleteBook(@PathVariable Book id)
//    {
//        book.remove(id);
//        return ResponseEntity.noContent().build();
//    }
    @CrossOrigin
    @DeleteMapping("/books")
    public void delete (@RequestBody Book book) {
        bookRepository.deleteById(book.getId());
    }

}