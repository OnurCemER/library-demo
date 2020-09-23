package com.onurcem.demo.repo;

import com.onurcem.demo.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {

    Book findByBookName(String bookName);
    Book findByBookSerialName(String serialName);
    Book findByIsbnNumber(String isbnNumber);
    //BookDto findByAuthor(Book);
}
