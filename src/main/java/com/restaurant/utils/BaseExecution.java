package com.restaurant.utils;

/**
 * @author lihaimeng
 * @date 2019/1/13
 *
 * 执行结果返回工具类
 */
public class BaseExecution {
    public static final String OK = "ok";
    public static final String FAILED= "failed";
    // 状态码
    // 200 ok
    // 4xx failed
    public int code;
    // 状态
    public String status;
    // 详情信息
    public Object message;


    public BaseExecution() {
    }

    public BaseExecution(int code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public BaseExecution(int code, String status, Object message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
