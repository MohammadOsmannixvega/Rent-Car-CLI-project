package com.cli.car;

public class CarService {

    private CarDAO carDao= new CarDAO();
    public void registerCar(Car car) throws Exception {
        // is car not null
        if(car == null){
            throw new Exception("Can not register this car");
        }
        // is this valid brand

        try {
            Brand brand = car.getBrand();
            Brand.valueOf(brand.toString());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid car entered!");
            throw new Exception("Can not register this car");
        }

        carDao.saveCar(car);
    }


    public Car[] listOfCars(){
        return carDao.selectAllCars();
    }

    public Car[] listOfElectricCars(){
        return carDao.selectElectricCars();
    }
}
