package com.example.springboot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author xieyunpeng
 * @Date 2024/1/12 10:14
 */
@Slf4j
//@WebFilter
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器初始化");
    }

    @Override
    public void destroy() {
        log.info("过滤器初销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("过滤器工作");
    }
}
