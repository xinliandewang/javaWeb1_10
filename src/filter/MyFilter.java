package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;
        //无论是否登录过,都要放行的资源   登录页  登录校验Controller 和一些静态资源
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);

        //放行主页和静态资源
        if(requestURI.contains("/index.do")|| requestURI.contains("/static/")){
            // 直接放行
            filterChain.doFilter(req,resp);
            // 后续代码不再执行
            return;
        }
        // 登录界面
        if(req.getParameter("method").equals("loginHTML")){
            // 直接放行
            filterChain.doFilter(req,resp);
            System.out.println("登录放行了");
            // 后续代码不再执行
            return;
        }
        // 登录比对密码
        if(req.getParameter("method").equals("loginsuccessHTML")){
            // 直接放行
            filterChain.doFilter(req,resp);
            System.out.println("登录比对密码放行了");
            // 后续代码不再执行
            return;
        }
        // 注册界面
        if(req.getParameter("method").equals("registerHTML")){
            // 直接放行
            filterChain.doFilter(req,resp);
            System.out.println("注册界面放行了");
            // 后续代码不再执行
            return;
        }
        // 注册成功 将密码放在数据库
        if(req.getParameter("method").equals("regist_successHTML")){
            // 直接放行
            filterChain.doFilter(req,resp);
            // 后续代码不再执行
            return;
        }
        // 注册成功后返回主页
        if(req.getParameter("method").equals("indexHTML")){
            // 直接放行
            filterChain.doFilter(req,resp);
            // 后续代码不再执行
            return;
        }
        // axios
        if(req.getParameter("method").equals("findByNameServlet")){
            // 直接放行
            filterChain.doFilter(req,resp);
            // 后续代码不再执行
            return;
        }
        // 需要登录之后才能访问的资源,如果没登录,重定向到登录页面上,提示用户进行登录
        HttpSession session = req.getSession();
        Object username = session.getAttribute("username");
        System.out.println(username);
        if(null != username){// 如果登录过 放行
            filterChain.doFilter(req,resp);
        }else{// 没有登录过,跳转至登录页
            resp.sendRedirect("book?method=loginHTML");
        }


    }
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
