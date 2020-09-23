package com.onurcem.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_subname")
    private String bookSubName;

    @Column(name = "book_serial_name")
    private String bookSerialName;

    @Column(name = "isbn_number")
    private String isbnNumber;

    @Column(name = "book_description")
    private String bookDescription;

    @JoinColumn(name = "authors_books")
    @ManyToOne
    private Author author;

    @JoinColumn(name = "books_publisher")
    @ManyToOne
    private Publisher publisher;

    public Book(String bookName, String bookSubName, String bookSerialName, String isbnNumber, String bookDescription, Author author, Publisher publisher) {
        this.bookName = bookName;
        this.bookSubName = bookSubName;
        this.bookSerialName = bookSerialName;
        this.isbnNumber = isbnNumber;
        this.bookDescription = bookDescription;
        this.author = author;
        this.publisher = publisher;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSubName() {
        return bookSubName;
    }

    public void setBookSubName(String bookSubName) {
        this.bookSubName = bookSubName;
    }

    public String getBookSerialName() {
        return bookSerialName;
    }

    public void setBookSerialName(String bookSerialName) {
        this.bookSerialName = bookSerialName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
