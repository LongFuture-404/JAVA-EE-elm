package com.example.java_ee.entity;

public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private String businessId;
    private Integer foodPrice;
    public Food() {
    }

    public Food(String foodName, String foodExplain, String foodImg, String businessId, Integer foodPrice) {
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.businessId = businessId;
        this.foodPrice = foodPrice;
    }

    public Food(Integer foodId, String foodName, String foodExplain, String foodImg, String businessId, Integer foodPrice) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.businessId = businessId;
        this.foodPrice = foodPrice;
    }

    public Food(String foodName, String foodExplain, String foodImg, String businessId) {
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.businessId = businessId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodImg='" + foodImg + '\'' +
                ", businessId='" + businessId + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
