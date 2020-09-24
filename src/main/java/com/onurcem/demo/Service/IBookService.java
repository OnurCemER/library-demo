package com.onurcem.demo.Service;

import com.onurcem.demo.DTO.BookDto;
import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Entity.Book;

import java.util.List;

public interface IBookService {

    void save(Book book);

    BookDto update(Long id, BookDto bookDto);

    Boolean delete(Long id);

    List<BookDto> getAll();

    //List<Book> findAll();

    BookDto getById(Long id);

    Author getAuthor(Long id);

    List<Book> findAllByBookName(String bookName);

    List<Book> findAllByBookSerialName(String serialName);

    List<Book> findAllByIsbnNumber(String serialName);

}
