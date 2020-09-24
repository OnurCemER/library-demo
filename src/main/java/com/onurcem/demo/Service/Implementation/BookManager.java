package com.onurcem.demo.Service.Implementation;

import com.onurcem.demo.DTO.AuthorDto;
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
    public BookDto save(BookDto bookDto) {
        Book book = modelMapper.map(bookDto,Book.class);
        book = bookRepo.save(book);
        return bookDto;
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
    public BookDto getByBookName(String bookName) {
        Book b = bookRepo.findByBookName(bookName);
        return modelMapper.map(b, BookDto.class);
    }

    @Override
    public BookDto getBySerialName(String serialName) {
        return modelMapper.map(bookRepo.findByBookSerialName(serialName), BookDto.class);
    }

    @Override
    public BookDto getByIsbnNo(String isbnNo) {
        return modelMapper.map(bookRepo.findByIsbnNumber(isbnNo), BookDto.class);
    }

    @Override
    public BookDto getByAuthorName(String authorName) {
        return null;
    }

    @Override
    public Author getAuthor(Long id){
        return authorRepo.getOne(id);
    }
}
