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

    BookDto getById(Long id);

    Author getAuthor(Long id);

    BookDto getByBookName(String bookName);

    BookDto getBySerialName(String serialName);

    BookDto getByIsbnNo(String isbnNo);

    BookDto getByAuthorName(String authorName);
}
