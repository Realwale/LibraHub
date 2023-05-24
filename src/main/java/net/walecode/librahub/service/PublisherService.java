package net.walecode.librahub.service;


import net.walecode.librahub.entity.Author;
import net.walecode.librahub.entity.Publisher;

import java.util.List;

public interface PublisherService {


    List<Publisher> findAllPublisher();

    Publisher findPublisherById(Long id);

    void createPublisher(Publisher publisher);

    void deletePublisher(Long id);

    void updatePublisher(Publisher publisher);
}
