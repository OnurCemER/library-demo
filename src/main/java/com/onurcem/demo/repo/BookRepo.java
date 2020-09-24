package com.onurcem.demo.repo;

import com.onurcem.demo.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookRepo extends JpaRepository<Book,Long> {

    List<Book> findAllByBookNameContaining(String bookName);

    List<Book> findAllByBookSerialNameContaining(String serialName);

    List<Book> findAllByIsbnNumberContaining(String isbnNumber);

}
