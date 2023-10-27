package com.example.car.model;


import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class CarTests {

    @Autowired
    private CarService carService;

    private static Stream<Arguments> getCarInfo() {
        return Stream.of(
                Arguments.of(
                        "롤스로이스",
                                    "고스트",
                                    "팬텀",
                                    "600000000",
                                    "시아준수",
                                    "은하수",
                                    "영국",
                                    "검정",
                                    LocalDate.now()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getCarInfo")
    void testCarInfo(String brand, String kind, String owners, int price,
                     String option, String country, String color, CarDate carDate, LocalDate released, LocalDate enrollDate) {

        CarDTO carInfo = new CarDTO(brand, kind, owners, price, option, country, color, released, enrollDate);
        Assertions.assertDoesNotThrow(
                () -> carService.registCar(carInfo));
    }


}
