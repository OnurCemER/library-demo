package com.onurcem.demo.Service.Implementation;

import com.onurcem.demo.Entity.Publisher;
import com.onurcem.demo.Service.IPublisherManager;
import com.onurcem.demo.repo.PublisherRepo;
import org.springframework.stereotype.Service;

@Service
public class PublisherManager implements IPublisherManager {

    private final PublisherRepo publisherRepo;

    public PublisherManager(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void save(Publisher publisher) {
        publisherRepo.save(publisher);
    }
}
