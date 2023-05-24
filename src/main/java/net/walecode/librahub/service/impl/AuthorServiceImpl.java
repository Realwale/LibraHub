package net.walecode.librahub.service.impl;

import net.walecode.librahub.entity.Author;
import net.walecode.librahub.repository.AuthorRepository;
import net.walecode.librahub.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {


    private AuthorRepository authorRepository;
    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    @Override
    public void createAuthor(Author author) {
        authorRepository.save(author);

    }

    @Override
    public void deleteAuthor(Long id) {

        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.deleteById(author.getId());
    }

    @Override
    public void updateAuthor(Author author) {
        authorRepository.save(author);
    }
}
