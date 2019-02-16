package com.restaurant.controller;

import com.restaurant.utils.BaseExecution;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class BaseController {

    public BaseController() {
        super();
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseExecution handlerException(Exception e) {
        e.printStackTrace();
        return new BaseExecution(e);
    }
}