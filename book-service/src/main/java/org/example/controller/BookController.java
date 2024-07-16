package org.example.controller;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{uid}")
    Book findBookById(@PathVariable("uid") int uid){
        return bookService.getBookById(uid);
    }
}
