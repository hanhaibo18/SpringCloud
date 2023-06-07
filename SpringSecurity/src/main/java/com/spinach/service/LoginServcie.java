package com.spinach.service;


import com.spinach.entity.ResponseResult;
import com.spinach.entity.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
