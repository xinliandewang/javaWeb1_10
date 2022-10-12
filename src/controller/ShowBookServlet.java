package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;
import java.io.IOException;

public class ShowBookServlet extends ViewBaseServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("method").equals("indexHTML")) {
            processTemplate("index", req, resp);
        }
        if (req.getParameter("method").equals("loginHTML")) {
            processTemplate("pages/user/login", req, resp);
        }
        if (req.getParameter("method").equals("registerHTML")) {
            processTemplate("pages/user/regist", req, resp);
        }
        if (req.getParameter("method").equals("regist_successHTML")) {
            processTemplate("pages/user/regist_success", req, resp);
        }
        if (req.getParameter("method").equals("cartHTMLHTML")) {
            processTemplate("pages/cart/cart", req, resp);
        }
        if (req.getParameter("method").equals("checkoutHTMLHTML")) {
            processTemplate("pages/cart/checkout", req, resp);
        }
    }
}
