package com.example.car.model;


import javax.persistence.*;

@Entity
@Table(name = "TBL_CAR")
public class Car {

    @Id
    @Column(name = "CAR_CODE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carCode;
    @Column(name = "BRAND")
    private String brand; // 자동차 브랜드
    @Column(name = "KIND", length = 5)
    private String kind; //자동차 종류
    @Column(name = "OWNERS")
    private String owners; //소유자
    @Column(name = "PRICE")
    private int price; //가격
    @Column(name = "OPTION")
    private String option;// 자동차 옵션
    @Column(name = "COUNTRY")
    private String country; //본사
    @Column(name = "COLOR")
    private String color; // 색상

    @Embedded
    private CarDate carDate;

    protected Car(String brand, String kind, String owners, int price, String option, String country, String color, CarDate carDate) {}

    public Car(int carCode, String brand, String kind, String owners, int price, String option, String country, String color, CarDate carDate) {
        this.carCode = carCode;
        this.brand = brand;
        this.kind = kind;
        this.owners = owners;
        this.price = price;
        this.option = option;
        this.country = country;
        this.color = color;
        this.carDate = carDate;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
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

    public CarDate getCarDate() {
        return carDate;
    }

    public void setCarDate(CarDate carDate) {
        this.carDate = carDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carCode=" + carCode +
                ", brand='" + brand + '\'' +
                ", kind='" + kind + '\'' +
                ", owners='" + owners + '\'' +
                ", price=" + price +
                ", option='" + option + '\'' +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", carDate=" + carDate +
                '}';
    }
}
