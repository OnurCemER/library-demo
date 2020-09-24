package com.onurcem.demo.RestControllers;

import com.onurcem.demo.DTO.AuthorDto;
import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Service.Implementation.AuthorManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("library/author")
public class AuthorController {

    private final AuthorManager authorManager;

    public AuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @PostMapping("/add")
    public void addAuthor(@RequestBody Author author){
         authorManager.save(author);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAuthor(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(authorManager.delete(id));
    }

    @PutMapping("/update")
    public ResponseEntity<AuthorDto> updateAuthor(@RequestBody Long id, AuthorDto authorDto){
        return ResponseEntity.ok(authorManager.update(id, authorDto));
    }
}
