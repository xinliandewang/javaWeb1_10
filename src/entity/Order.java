package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 */
public class Order {
    private Integer orderId; // 订单编号
    private Integer order_count; // 订购数量
    private BigDecimal orderAmount; // 金额
    private Integer userId; // 用户id
    private Integer orderStatus; // 订单状态：0表示未发货，1表示正在配货，2表示已发货
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    private String comment; // 备注

    public Order() {
    }

    public Order(Integer orderId, Integer order_count, BigDecimal orderAmount, Integer userId, Integer orderStatus,
                 Date createTime, Date updateTime, String comment) {
        this.orderId = orderId;
        this.order_count = order_count;
        this.orderAmount = orderAmount;
        this.userId = userId;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.comment = comment;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrder_count() {
        return order_count;
    }

    public void setOrder_count(Integer order_count) {
        this.order_count = order_count;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
        return "Order{" +
                "orderId=" + orderId +
                ", order_count=" + order_count +
                ", orderAmount=" + orderAmount +
                ", userId=" + userId +
                ", orderStatus=" + orderStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", comment='" + comment + '\'' +
                '}';
    }
}
