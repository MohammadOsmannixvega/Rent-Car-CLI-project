package com.cli.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    public static int numberOfCars;
    public static int numberOfElectricCars;
    private String regNumber;
    private Brand brand;
    private boolean isElectric;

    private BigDecimal rentalPrice;

    static {
        numberOfCars = 0;
    }
    public Car() {
        ++numberOfCars;
    }

    public Car(String regNumber, Brand brand, boolean isElectric, BigDecimal rentalPrice) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.isElectric = isElectric;
        this.rentalPrice = rentalPrice;
        ++numberOfCars;
        if(isElectric){
            ++numberOfElectricCars;
        }

    }

    public Car(String regNumber, Brand brand, boolean isElectric) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.isElectric = isElectric;
        ++numberOfCars;
        if(isElectric){
            ++numberOfElectricCars;
        }
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public String getRegNumber(){
        return regNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }


    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ",brand=" + brand +
                ",isElectric=" + isElectric +
                ",rentalPrice=" + rentalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric && Objects.equals(regNumber, car.regNumber) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, brand, isElectric);
    }
}
