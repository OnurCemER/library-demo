package com.onurcem.demo.DTO;

public class AuthorDto {
    private Long id;
    private String Name;
    private String description;
    private Long bookId;
    private BookDto authorBooks;

    public AuthorDto() {
    }

    public AuthorDto(String name, String description, Long bookId, BookDto authorBooks) {
        Name = name;
        this.description = description;
        this.bookId = bookId;
        this.authorBooks = authorBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public BookDto getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(BookDto authorBooks) {
        this.authorBooks = authorBooks;
    }
}