package controller;

import entity.Order;
import entity.User;
import org.springframework.util.DigestUtils;
import service.LoginService;
import service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ShowBookServlet extends ViewBaseServlet {
    private LoginService loginService = new LoginServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 主页
        if (req.getParameter("method").equals("indexHTML")) {
            HttpSession session = req.getSession();
            session.setAttribute("username", null);
            processTemplate("index", req, resp);
        }
        // 登录
        if (req.getParameter("method").equals("loginHTML")) {
            processTemplate("pages/user/login", req, resp);
        }
        // 登录成功 比对密码
        if (req.getParameter("method").equals("loginsuccessHTML")) {
            String username = req.getParameter("username");
            req.setAttribute("huiyuan", username);
            this.LoginComparison(req, resp);
        }
        // 注册
        if (req.getParameter("method").equals("registerHTML")) {
            processTemplate("pages/user/regist", req, resp);
        }
        // 注册成功
        if (req.getParameter("method").equals("regist_successHTML")) {
            this.registerPuts(req, resp);
            processTemplate("pages/user/regist_success", req, resp);
        }
        // 购物车
        if (req.getParameter("method").equals("cartHTML")) {
            processTemplate("pages/cart/cart", req, resp);
        }
        // 结算界面
        if (req.getParameter("method").equals("checkoutHTMLHTML")) {
            processTemplate("pages/cart/checkout", req, resp);
        }
        // 我的订单界面
        if (req.getParameter("method").equals("orderHTML")) {
            processTemplate("pages/order/order", req, resp);
        }
        // 后台管理系统
        if (req.getParameter("method").equals("book_managerHTML")) {
            processTemplate("pages/manager/book_manager", req, resp);
        }
        // 比对用户名是否存在
        if (req.getParameter("method").equals("findByNameServlet")) {
            this.findByNameServlet(req, resp);
        }

    }
    // 注册放进数据库里
    protected void registerPuts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        User user = new User(username, DigestUtils.md5DigestAsHex((password).getBytes()),email);
        loginService.registerPut(user);
//        processTemplate("pages/user/login", req, resp);
    }
    // 登录比对密码
    protected void LoginComparison(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Integer login = loginService.findLogin(username, DigestUtils.md5DigestAsHex((password).getBytes()));
        if (login == 0) {
            System.out.println("密码错误");
            req.setAttribute("ps", login);
            processTemplate("pages/user/login", req, resp);
        }else {
            req.setAttribute("ps", login);
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            processTemplate("pages/user/login_success", req, resp);
        }
    }
    // 通过姓名查询信息
    protected void findByNameServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);
        Integer byName = loginService.findByName(username);
        System.out.println(byName);
        if (byName == 1){
            resp.getWriter().write("" + byName);
        }
    }
}
