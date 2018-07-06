package com.example.demo.utils;

import java.util.UUID;

/**
 * 生成随机字符串的工具类 uuid
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
