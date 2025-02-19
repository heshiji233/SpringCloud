package org.example.service.impl;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.Book;
import org.example.entity.Borrow;
import org.example.entity.BorrowDetail;
import org.example.entity.User;
import org.example.mapper.BorrowMapper;
import org.example.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceimpl implements BorrowService {

    @Resource
    BorrowMapper borrowMapper;

    @Override
    public BorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrows = borrowMapper.getBorrowsByUid(uid);
        //RestTemplate支持多种方式的远程调用
        RestTemplate template = new RestTemplate();
        //这里通过调用getForObject来请求其他的服务，并将结果自动进行封装
        //获取User的信息
        User user = template.getForObject("http://localhost:8301/user/" + uid, User.class);
        //获取每一本书的详细信息
        List<Book> bookList = borrows.stream()
                .map(borrow -> template.getForObject("http://localhost:8101/book/" + borrow.getBid(), Book.class))
                .collect(Collectors.toList());

        return new BorrowDetail(user, bookList);
    }
}
