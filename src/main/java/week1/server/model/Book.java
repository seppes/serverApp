package week1.server.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private String title;
    private int aantalPaginas;

    public Book(String title, int aantalPaginas) {
        this.title = title;
        this.aantalPaginas = aantalPaginas;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAantalPaginas() {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas) {
        this.aantalPaginas = aantalPaginas;
    }
}
