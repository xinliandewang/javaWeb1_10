package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;
import java.io.IOException;

public class ShowBookServlet extends ViewBaseServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 主页
        if (req.getParameter("method").equals("indexHTML")) {
            processTemplate("index", req, resp);
        }
        // 登录
        if (req.getParameter("method").equals("loginHTML")) {
            processTemplate("pages/user/login", req, resp);
        }
        // 注册
        if (req.getParameter("method").equals("registerHTML")) {
            processTemplate("pages/user/regist", req, resp);
        }
        // 注册成功
        if (req.getParameter("method").equals("regist_successHTML")) {
            processTemplate("pages/user/regist_success", req, resp);
        }
        // 购物车
        if (req.getParameter("method").equals("cartHTMLHTML")) {
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
    }
}
