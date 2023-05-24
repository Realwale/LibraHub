package net.walecode.librahub.service;

import net.walecode.librahub.entity.Author;
import net.walecode.librahub.entity.Book;

import java.util.List;

public interface AuthorService {

    List<Author> findAllAuthors();

    Author findAuthorById(Long id);

    void createAuthor(Author author);

    void deleteAuthor(Long id);

    void updateAuthor(Author author);
}
