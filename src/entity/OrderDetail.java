package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单明细表
 */
public class OrderDetail {
    private Integer itemId; //
    private Integer bookId; // 图书编号
    private String bookName; // 图书名称
    private Integer bookCount; // 图书数量
    private BigDecimal amount; // 金额
    private Integer orderId; // 订单编号
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    private String comment; // 备注

    public OrderDetail() {
    }

    public OrderDetail(Integer itemId, Integer bookId, String bookName, Integer bookCount, BigDecimal amount,
                       Integer orderId, Date createTime, Date updateTime, String comment) {
        this.itemId = itemId;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.amount = amount;
        this.orderId = orderId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "itemId=" + itemId +
                ", bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", amount=" + amount +
                ", orderId=" + orderId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
}
