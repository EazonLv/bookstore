package com.yc.bookstore.entity;

public class Orderitem {
    private Integer id;

    private Integer bookSourceid;

    private Integer orderSourceid;

    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookSourceid() {
        return bookSourceid;
    }

    public void setBookSourceid(Integer bookSourceid) {
        this.bookSourceid = bookSourceid;
    }

    public Integer getOrderSourceid() {
        return orderSourceid;
    }

    public void setOrderSourceid(Integer orderSourceid) {
        this.orderSourceid = orderSourceid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookSourceid=").append(bookSourceid);
        sb.append(", orderSourceid=").append(orderSourceid);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}