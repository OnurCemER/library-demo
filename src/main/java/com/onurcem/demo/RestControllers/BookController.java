package com.onurcem.demo.RestControllers;


import com.onurcem.demo.DTO.BookDto;
import com.onurcem.demo.Entity.Book;
import com.onurcem.demo.Service.Implementation.BookManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/book")
public class BookController {
    private final BookManager bookManager;

    public BookController(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @PostMapping("/add")
    public void add(@RequestBody Book book){
        bookManager.save(book);
    }

    @PutMapping("/update")
    public ResponseEntity<BookDto> update(@PathVariable(value = "id", required = true) Long id, @RequestBody BookDto bookDto ){
        return ResponseEntity.ok(bookManager.update(id, bookDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(bookManager.delete(id));
    }

    @GetMapping("/list")
    public ResponseEntity<List<BookDto>> getAll(){
        List<BookDto> data = bookManager.getAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{bookName}")
    public ResponseEntity<BookDto> getByBookName(@PathVariable(value = "bookName", required = true) String bookName){
        return ResponseEntity.ok(bookManager.getByBookName(bookName));
    }

    @GetMapping("/list/{serialName}")
    public ResponseEntity<BookDto> getBySerialName(@PathVariable(value = "serialName", required = true) String serialName){
        return ResponseEntity.ok(bookManager.getByBookName(serialName));
    }

    @GetMapping("/list/{isbnNo}")
    public ResponseEntity<BookDto> getByIsbnNumber(@PathVariable(value = "isbnNo", required = true) String isbnNo){
        return ResponseEntity.ok(bookManager.getByBookName(isbnNo));
    }

    @GetMapping("/list/{authorName}")
    public ResponseEntity<BookDto> getByAuthorName(@PathVariable(value = "authorName", required = true) String authorName){
        return ResponseEntity.ok(bookManager.getByBookName(authorName));
    }
}
