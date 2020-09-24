package com.onurcem.demo.Service;

import com.onurcem.demo.DTO.AuthorDto;
import com.onurcem.demo.Entity.Author;

public interface IAuthorService {

    void save(Author author);

    Boolean delete(Long id);

    AuthorDto update(Long id, AuthorDto author);
}
