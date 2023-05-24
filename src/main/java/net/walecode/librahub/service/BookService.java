package net.walecode.librahub.service;

import net.walecode.librahub.entity.Author;
import net.walecode.librahub.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(Long id);

    void createBook(Book book);

    void deleteBook(Long id);

    void updateBook(Book book);
}
