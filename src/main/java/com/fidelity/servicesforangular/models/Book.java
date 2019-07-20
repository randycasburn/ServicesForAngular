package com.fidelity.servicesforangular.models;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private String author;
    private String cover;
    private long bookId;

    public Book() {
    }

    public Book(String title, String author, String cover, long bookId) {
        super();
        this.title = title;
        this.author = author;
        this.cover = cover;
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", cover='" + cover + '\'' +
                ", bookId=" + bookId +
                '}';
    }

}
