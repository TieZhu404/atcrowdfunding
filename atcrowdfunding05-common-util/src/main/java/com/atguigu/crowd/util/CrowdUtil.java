package com.atguigu.crowd.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JSQ
 * @ClassName CrowdUtil.java
 * @Description TODO
 * @createTime 2021年03月10日 21:54:00
 */
public class CrowdUtil {
    public static boolean judgeRequestType(HttpServletRequest httpServletRequest) {
        //1获取请求消息投
        String accepHeader = httpServletRequest.getHeader("Accept");
        String xRequestHeader = httpServletRequest.getHeader("X-Requested-With");

        //2判断当前请求是否为Ajax请求，true：是Ajax请求；false：不是
        return (accepHeader != null && accepHeader.contains("application/json")) ||
                (xRequestHeader != null && xRequestHeader.equals("XMLHttpRequest"));
    }
}
