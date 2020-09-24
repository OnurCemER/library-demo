package com.onurcem.demo.DTO;

public class AuthorDto {
    private Long id;
    private String name;
    private String description;
    private Long bookId;
    private BookDto authorBooks;

    public AuthorDto() {
    }

    public AuthorDto(Long id, String name, String description, Long bookId, BookDto authorBooks) {
        this.id = id;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
