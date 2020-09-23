package com.onurcem.demo.Service;

import com.onurcem.demo.DTO.BookDto;

import java.util.List;

public interface IBookService {

    BookDto save(BookDto bookDto);

    BookDto update(Long id, BookDto bookDto);

    Boolean delete(Long id);

    List<BookDto> getAll();

    BookDto getByBookName(String bookName);

    BookDto getBySerialName(String serialName);

    BookDto getByIsbnNo(String isbnNo);

    BookDto getByAuthorName(String authorName);
}
