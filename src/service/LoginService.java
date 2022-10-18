package service;

import entity.User;

public interface LoginService {
    Integer findLogin(String account , String password);
    Integer registerPut(User user);
    Integer findByName(String account);
}
