package com.fidelity.servicesforangular.endpoints;


import com.fidelity.servicesforangular.models.Book;
import com.fidelity.servicesforangular.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookRepository repo;

    @GetMapping
    public List<Book> queryBooksByTitle(@RequestParam(defaultValue = "") String title ) {
        return repo.getBooks(title);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repo.addBook(book);
    }

}
