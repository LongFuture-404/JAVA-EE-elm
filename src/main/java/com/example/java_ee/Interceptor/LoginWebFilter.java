package com.example.java_ee.Interceptor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录静态资源拦截器
 * 可以访问.css login.jsp .js .png
 * 不能访问 .jsp
 */
@WebFilter("/*")
public class LoginWebFilter implements Filter {

    /**
     * 在filter中赋值后在此获取
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse res=(HttpServletResponse)servletResponse;
        String [] sr=new String[]{"/getUserByIdByPass","/login",".css",".js",".png",".jpg","/getUserById","/saveUser"};
        boolean flag=false;
        for(String url_suffix:sr){
            if (req.getRequestURI().endsWith(url_suffix)||req.getRequestURI().contains("Controller")){
                flag=true;
            }
        }
        if(flag){
            filterChain.doFilter(servletRequest,servletResponse);//放行
        }else{
            Object userinfo=req.getSession().getAttribute("user");
            if(userinfo==null){
                res.sendRedirect("http://localhost:8081/login");
//                filterChain.doFilter(servletRequest,servletResponse);
            }
            else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
