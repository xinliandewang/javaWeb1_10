package dao.impl;

import dao.LoginDao;
import entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import untils.JDBCUtils;


public class LoginDaoImpl implements LoginDao {
    // 登录
    @Override
    public Integer findLogin(String account , String password) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "select count(*) from t_user where user_name = ? and user_password = ?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, account, password);
        return integer;
    }
    // 注册
    @Override
    public Integer registerPut(User user) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "insert into t_user (user_name,user_password,email) values (?,?,?) ";
        int regis = jdbcTemplate.update(sql,user.getUserName(),user.getUserPassword(),user.getEmail());
        return regis;
    }

    @Override
    public Integer findByName(String account) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDateSource());
        String sql = "select count(*) from t_user where user_name = ?";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class, account);
        return i;
    }
}
