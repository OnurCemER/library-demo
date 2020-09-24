package com.onurcem.demo.DTO;

import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Entity.Publisher;

public class BookDto {

    private Long id;
    private String bookName;
    private String bookSubName;
    private String bookSerialName;
    private String isbnNumber;
    private String bookDescription;
    private Author author;
    private Publisher publisher;

    public BookDto() {
    }

    public BookDto(String bookName, String bookSubName, String bookSerialName, String isbnNumber, String bookDescription, Author author, Publisher publisher) {
        this.bookName = bookName;
        this.bookSubName = bookSubName;
        this.bookSerialName = bookSerialName;
        this.isbnNumber = isbnNumber;
        this.bookDescription = bookDescription;
        this.author = author;
        this.publisher = publisher;
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
