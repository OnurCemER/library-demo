package com.onurcem.demo.Service;

import com.onurcem.demo.DTO.AuthorDto;

public interface IAuthorService {

    AuthorDto save(AuthorDto authorDto);

    Boolean delete(Long id);

    AuthorDto update(Long id, AuthorDto author);
}
