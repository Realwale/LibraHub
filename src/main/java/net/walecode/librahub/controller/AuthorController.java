package net.walecode.librahub.controller;


import net.walecode.librahub.service.AuthorService;
import net.walecode.librahub.service.BookService;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private AuthorService authorService;

    private BookService bookService;
}
