package com.onurcem.demo.DTO;

public class BookDto {

    private Long id;
    private String bookName;
    private String bookSubName;
    private String bookSerialName;
    private String isbnNumber;
    private String bookDescription;

    public BookDto() {
    }

    public BookDto(String bookName, String bookSubName, String bookSerialName, String isbnNumber, String bookDescription) {
        this.bookName = bookName;
        this.bookSubName = bookSubName;
        this.bookSerialName = bookSerialName;
        this.isbnNumber = isbnNumber;
        this.bookDescription = bookDescription;
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
}
