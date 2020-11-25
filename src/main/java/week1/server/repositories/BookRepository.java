package week1.server.repositories;

import org.springframework.data.repository.CrudRepository;
import week1.server.model.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {
}