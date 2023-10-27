package com.example.car.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Embeddable
public class CarDate {

    @Column(name = "RELEASE")
    private LocalDate release; //출시일
    @Column(name = "ENROLL_DATA")
    private LocalDate enrollDate; // 현재 날짜

    @Column(name = "D_DAY")
    private long dDay;

    protected CarDate() {}

    public CarDate(LocalDate release, LocalDate enrollDate) {
        this.release = release;
        this.enrollDate = enrollDate;
        this.dDay = dDayGet(release, enrollDate);
    }

    private long dDayGet(LocalDate release, LocalDate enrollDate) {

        long dDay = ChronoUnit.DAYS.between(enrollDate,release);

        return dDay;
    }

    public LocalDate getRelease() {
        return release;
    }
    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public Long getdDay() {
        return dDay;
    }

    @Override
    public String toString() {
        return "CarDate{" +
                "release=" + release +
                ", enrollDate=" + enrollDate +
                ", dDay" + dDay +
                '}';
    }
}
