package com.example.car.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CarRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Car car) {
        manager.persist(car);
    }
}
