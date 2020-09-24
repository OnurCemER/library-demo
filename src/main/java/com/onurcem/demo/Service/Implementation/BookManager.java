package com.onurcem.demo.Service.Implementation;

import com.onurcem.demo.DTO.BookDto;
import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Entity.Book;
import com.onurcem.demo.Service.IBookService;
import com.onurcem.demo.repo.AuthorRepo;
import com.onurcem.demo.repo.BookRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookManager implements IBookService {

    private final BookRepo bookRepo;
    private final ModelMapper modelMapper;
    private final AuthorRepo authorRepo;

    public BookManager(BookRepo bookRepo, ModelMapper modelMapper, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.modelMapper = modelMapper;
        this.authorRepo = authorRepo;
    }


    @Override
    public void save(Book book) {
        bookRepo.save(book);
    }

    @Override
    public BookDto update(Long id, BookDto bookDto) {
        Book book = bookRepo.getOne(id);
        book.setBookName(bookDto.getBookName());
        book.setBookSerialName(bookDto.getBookSerialName());
        book.setBookDescription(bookDto.getBookDescription());
        book.setBookSubName(bookDto.getBookSubName());
        book.setIsbnNumber(bookDto.getIsbnNumber());
        bookRepo.save(book);
        return modelMapper.map(book,BookDto.class);
    }

    @Override
    public Boolean delete(Long id) {
        bookRepo.deleteById(id);
        return true;
    }

    @Override
    public List<BookDto> getAll() {
        List<Book> data = bookRepo.findAll();
        return Arrays.asList(modelMapper.map(data, BookDto[].class));
    }

    @Override
    public BookDto getById(Long id) {
        return modelMapper.map(bookRepo.getOne(id),BookDto.class);
    }

    @Override
    public List<Book> findAllByBookName(String bookName) {
        if (bookName != null){
            return bookRepo.findAllByBookNameContaining(bookName);
        }
        List<Book> data = bookRepo.findAll();
        return data;
    }

    @Override
    public List<Book> findAllByBookSerialName(String serialName) {
        if (serialName != null){
            return bookRepo.findAllByBookSerialNameContaining(serialName);
        }
        List<Book> data = bookRepo.findAll();
        return data;
    }

    @Override
    public List<Book> findAllByIsbnNumber(String isbnNumber) {
        if (isbnNumber != null){
            return bookRepo.findAllByIsbnNumberContaining(isbnNumber);
        }
        List<Book> data = bookRepo.findAll();
        return data;
    }

    @Override
    public Author getAuthor(Long id){
        return authorRepo.getOne(id);
    }
}
