package com.example.car.model;

public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void registCar(CarDTO carInfo) {
        Car car = new Car(
          carInfo.getBrand(),
          carInfo.getKind(),
          carInfo.getOwners(),
          carInfo.getPrice(),
          carInfo.getOption(),
          carInfo.getCountry(),
          carInfo.getColor(),
          new CarDate(
                        carInfo.getReleased(),
                        carInfo.getEnrollDate()
                )
        );
        carRepository.save(car);
    }
}
