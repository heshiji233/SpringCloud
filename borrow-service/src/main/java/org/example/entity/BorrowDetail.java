package org.example.entity;/*
@author 何世吉
*/

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BorrowDetail {
    User user;
    List<Book> bookList;
}
