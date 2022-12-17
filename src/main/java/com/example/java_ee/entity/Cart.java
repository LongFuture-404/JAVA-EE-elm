package com.example.java_ee.entity;

public class Cart {
    private Integer foodId;
    private Integer businessId;
    private String userId;
    private Integer quantity;

    public Cart() {
    }

    public Cart(Integer foodId, Integer businessId, String userId, Integer quantity) {
        this.foodId = foodId;
        this.businessId = businessId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "foodId='" + foodId + '\'' +
                ", businessId='" + businessId + '\'' +
                ", userId='" + userId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
