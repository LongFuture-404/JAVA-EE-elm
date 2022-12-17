package com.example.java_ee.entity;

import java.math.BigDecimal;

public class Orders {
    private Integer orderId;
    private String userId;
    private Integer businessId;
    private String date;
    private BigDecimal orderTotal;
    private Integer daId;
    private Integer orderState;

    public Orders() {
    }

    public Orders(Integer orderId, String userId, Integer businessId, String date, BigDecimal orderTotal, Integer daId, Integer orderState) {
        this.orderId = orderId;
        this.userId = userId;
        this.businessId = businessId;
        this.date = date;
        this.orderTotal = orderTotal;
        this.daId = daId;
        this.orderState = orderState;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getDaId() {
        return daId;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userId='" + userId + '\'' +
                ", businessId=" + businessId +
                ", date=" + date +
                ", orderTotal=" + orderTotal +
                ", daId=" + daId +
                ", orderState=" + orderState +
                '}';
    }
}
