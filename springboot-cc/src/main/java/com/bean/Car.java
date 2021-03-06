package com.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: cs
 * @Date: 2021/2/9 12:02 下午
 * @Desc:
 * 只有容器中的组件，才有拥有SpringBoot提供的强大功能
 */
@Component // 注册到容器中
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
