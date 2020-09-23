package com.onurcem.demo.Service.Implementation;

import com.onurcem.demo.DTO.AuthorDto;
import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Service.IAuthorService;
import com.onurcem.demo.repo.AuthorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthorManager implements IAuthorService {

    private final AuthorRepo authorRepo;
    private final ModelMapper modelMapper;

    public AuthorManager(AuthorRepo authorRepo, ModelMapper modelMapper) {
        this.authorRepo = authorRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto save(AuthorDto authorDto) {
        Author a = modelMapper.map(authorDto, Author.class);
        a = authorRepo.save(a);
        authorDto.setId(a.getId());
        return authorDto;
    }

    @Override
    public Boolean delete(Long id) {
        authorRepo.deleteById(id);
        return true;
    }

    @Override
    public AuthorDto update(Long id, AuthorDto author) {
        Author authorDb = authorRepo.getOne(id);
        authorDb.setAuthorName(author.getName());
        authorDb.setAuthorDescription(author.getDescription());
        authorRepo.save(authorDb);
        return modelMapper.map(authorDb, AuthorDto.class);
    }
}
