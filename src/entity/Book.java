package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 图书表
 */
public class Book {
    private Integer bookId;  // 图书id
    private String name;  // 图书名称
    private BigDecimal price;  // 图书价格
    private String author;  // 图书作者
    private Integer stock;  // 图书库存
    private String imgPath;  // 图片地址
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    private String comment; // 备注

    public Book() {
    }

    public Book(Integer bookId, String name, BigDecimal price, String author, Integer stock, String imgPath,
                Date createTime, Date updateTime, String comment) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.author = author;
        this.stock = stock;
        this.imgPath = imgPath;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.comment = comment;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
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
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", stock=" + stock +
                ", imgPath='" + imgPath + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", comment='" + comment + '\'' +
                '}';
    }
}
