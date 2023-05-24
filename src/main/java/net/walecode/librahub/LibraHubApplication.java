package net.walecode.librahub;

import net.walecode.librahub.entity.Author;
import net.walecode.librahub.entity.Book;
import net.walecode.librahub.entity.Category;
import net.walecode.librahub.entity.Publisher;
import net.walecode.librahub.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraHubApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService){
        return (args) -> {

            Book book1 = new Book("ABC", "BOOK NAME", "MY FIRST BOOK");
            Author author1 = new Author("Test name1", "Test description");
            Category category1 = new Category("Business book");
            Publisher publisher1 = new Publisher("First publisher");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("ABCD", "BOOK NAME2", "MY SECOND BOOK");
            Author author2 = new Author("Test name2", "Test description2");
            Category category2 = new Category("Health book");
            Publisher publisher2 = new Publisher("Second publisher");
            book1.addAuthor(author2);
            book1.addCategory(category2);
            book1.addPublisher(publisher2);
            bookService.createBook(book2);
        };
    }

}
