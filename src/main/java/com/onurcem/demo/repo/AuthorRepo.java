package com.onurcem.demo.repo;

import com.onurcem.demo.DTO.AuthorDto;
import com.onurcem.demo.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {

    AuthorDto findAuthorByBooks(String bookName);
}
