package com.example.car.model;

import java.time.LocalDate;

public class CarDTO {

    private String brand;// 자동차 브랜드
    private String kind;  //자동차 종류
    private String owners;//소유자
    private int price;  //가격
    private String option; // 자동차 옵션
    private String country; //본사
    private String color; // 색상
    private LocalDate released;
    private LocalDate enrollDate;

    public CarDTO(String brand, String kind, String owners, int price, String option, String country, String color, LocalDate released, LocalDate enrollDate) {
        this.brand = brand;
        this.kind = kind;
        this.owners = owners;
        this.price = price;
        this.option = option;
        this.country = country;
        this.color = color;
        this.released = released;
        this.enrollDate = enrollDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", kind='" + kind + '\'' +
                ", owners='" + owners + '\'' +
                ", price=" + price +
                ", option='" + option + '\'' +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", released=" + released +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
