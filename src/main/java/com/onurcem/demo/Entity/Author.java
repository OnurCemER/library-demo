package com.onurcem.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="author")
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "author_name", length = 50)
    private String authorName;

    @Column(name = "author_description", length = 500)
    private String authorDescription;

    @JoinColumn(name = "authors_books")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Book> books;

    public Author() {
    }

    public Author(String authorName, String authorDescription) {
        this.authorName = authorName;
        this.authorDescription = authorDescription;
    }

    public Author(String authorName, String authorDescription, List<Book> books) {
        this.authorName = authorName;
        this.authorDescription = authorDescription;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
