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

}
