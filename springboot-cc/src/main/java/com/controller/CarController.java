package com.controller;

import com.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cs
 * @Date: 2021/2/9 12:07 下午
 * @Desc:
 */
@RestController
public class CarController {

    @Autowired
    private Car car;

    @GetMapping("/car")
    public String getCar() {
        System.out.println(car);

        return car.toString();
    }
}
