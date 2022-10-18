package dao;

import entity.User;

public interface LoginDao {
    // 登录
    Integer findLogin(String account , String password);
    // 注册
    Integer registerPut(User user);
    // 通过用户名查所有信息
    Integer findByName(String account);
}
