package com.yc.bookstore.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userSourceid;

    private Date createtime;

    private String shoppingid;

    private String isPay;

    private Double payment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserSourceid() {
        return userSourceid;
    }

    public void setUserSourceid(Integer userSourceid) {
        this.userSourceid = userSourceid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getShoppingid() {
        return shoppingid;
    }

    public void setShoppingid(String shoppingid) {
        this.shoppingid = shoppingid == null ? null : shoppingid.trim();
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay == null ? null : isPay.trim();
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userSourceid=").append(userSourceid);
        sb.append(", createtime=").append(createtime);
        sb.append(", shoppingid=").append(shoppingid);
        sb.append(", isPay=").append(isPay);
        sb.append(", payment=").append(payment);
        sb.append("]");
        return sb.toString();
    }
}