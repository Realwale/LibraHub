package net.walecode.librahub.service.impl;

import net.walecode.librahub.entity.Publisher;
import net.walecode.librahub.repository.PublisherRepository;
import net.walecode.librahub.service.PublisherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private PublisherRepository publisherRepository;
    @Override
    public List<Publisher> findAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher findPublisherById(Long id) {
        return publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
    }

    @Override
    public void createPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public void deletePublisher(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        publisherRepository.deleteById(publisher.getId());

    }

    @Override
    public void updatePublisher(Publisher publisher) {
        publisherRepository.save(publisher);

    }
}
