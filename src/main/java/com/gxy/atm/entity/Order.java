package com.gxy.atm.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userId;

    private Integer showTimeId;

    private String totalPrice;

    private String orderNo;

    private String seatCode;

    private Byte status;

    private String tradeNo;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShowTimeId() {
        return showTimeId;
    }

    public void setShowTimeId(Integer showTimeId) {
        this.showTimeId = showTimeId;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(String seatCode) {
        this.seatCode = seatCode == null ? null : seatCode.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", showTimeId=" + showTimeId +
                ", totalPrice='" + totalPrice + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", seatCode='" + seatCode + '\'' +
                ", status=" + status +
                ", tradeNo='" + tradeNo + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}