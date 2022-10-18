package service.impl;

import dao.LoginDao;
import dao.impl.LoginDaoImpl;
import entity.User;
import service.LoginService;

public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao = new LoginDaoImpl();

    // 登录比对
    @Override
    public Integer findLogin(String account, String password) {
        return loginDao.findLogin(account, password);
    }

    @Override
    public Integer registerPut(User user) {
        return loginDao.registerPut(user);
    }

    @Override
    public Integer findByName(String account) {
        return loginDao.findByName(account);
    }
}
