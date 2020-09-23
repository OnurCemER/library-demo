package com.onurcem.demo.repo;

import com.onurcem.demo.Entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
