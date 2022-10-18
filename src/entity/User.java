package entity;

import java.util.Date;

/**
 * 用户表
 */
public class User {
    private Integer userId; // 用户id
    private String userName; // 用户名
    private String userPassword; // 用户密码
    private String email; // 邮箱
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    private String comment; // 备注

    public User() {
    }

    public User(String userName, String userPassword, String email) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
    }

    public User(Integer userId, String userName, String userPassword, String email, Date createTime, Date updateTime,
                String comment) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.comment = comment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", comment='" + comment + '\'' +
                '}';
    }
}
