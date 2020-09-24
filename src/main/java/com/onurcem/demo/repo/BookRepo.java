package com.onurcem.demo.repo;

import com.onurcem.demo.DTO.BookDto;
import com.onurcem.demo.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Long> {

    List<Book> findAllByBookName(String bookName);

    List<BookDto> findAllByBookSerialName(String serialName);

    List<BookDto> findAllByIsbnNumber(String isbnNumber);

}
