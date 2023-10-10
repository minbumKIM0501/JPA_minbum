package com.example.car.model;

import javax.persistence.EntityManager;

public class CarRepository {

    private EntityManager manager;

    public void save(Car car) {
        manager.persist(car);
    }
}
