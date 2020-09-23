package com.onurcem.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "publisher_name")
    private String publisherName;

    @JoinColumn(name = "books_publisher")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Book> publishedBooks;

    public Publisher() {
    }

    public Publisher(String publisherName, List<Book> publishedBooks) {
        this.publisherName = publisherName;
        this.publishedBooks = publishedBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }
}
