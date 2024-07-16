package org.example.service.impl;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.Book;
import org.example.mapper.BookMapper;
import org.example.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceimpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
