package com.restaurant.entity;

import com.restaurant.utils.BaseExecution;
import org.springframework.web.bind.annotation.RequestParam;

public interface IPerson {
    public BaseExecution register(String account, String password, String name, String telephone);
    public BaseExecution login(String account, String password);

}
