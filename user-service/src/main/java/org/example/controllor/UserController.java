package org.example.controllor;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("user/{uid}")
    public User getUserById(@PathVariable("uid") int id){
        return userService.getUserById(id);
    }
}
