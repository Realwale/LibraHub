package net.walecode.librahub.service.impl;

import net.walecode.librahub.entity.Book;
import net.walecode.librahub.repository.BookRepository;
import net.walecode.librahub.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Long id) {

        return bookRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Book not found"));
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteBook(Long id) {
      Book book =  bookRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Book not found"));

      bookRepository.deleteById(book.getId());
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
