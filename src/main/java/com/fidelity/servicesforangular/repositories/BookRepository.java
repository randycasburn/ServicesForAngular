package com.fidelity.servicesforangular.repositories;

import com.fidelity.servicesforangular.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {
    @Autowired
    Book book;

    private List<Book> books =
            Arrays.asList(new Book("Design Patterns", "Gamma, Helm, Johnson, Vlissides", "covers/9780201633610.jpg", 4),
                    new Book("UML Distilled", "Martin Fowler", "covers/umldist.jpg", 3),
                    new Book("Clean Code", "Robert Martin", "covers/cleancode.jpg", 2),
                    new Book("Cryptonomicon", "Neal Stephenson", "", 1));
    private long bookId = 4;

    BookRepository() {
    }

    public List<Book> getBooks(String title) {
        return books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Book addBook(Book book) {
        book.setBookId(++bookId);
        books.add(book);
        return book;
    }
}
