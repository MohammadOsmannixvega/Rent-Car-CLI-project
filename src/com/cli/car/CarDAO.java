package com.cli.car;

public class CarDAO {
    private static Car[] cars;
    public static Car[] electricCar;

    private static int countSave;
    private static int countSaveForElectric;

    static{
        cars = new Car[Car.numberOfCars];
        electricCar = new Car[Car.numberOfElectricCars];
        countSave = 0;
    }


    public void saveCar(Car car)  {
        if (countSave < Car.numberOfCars){
            cars[countSave] = car;
            ++countSave;
            if (car.isElectric()){
                electricCar[countSaveForElectric] = car;
                ++countSaveForElectric;
            }
        }else{
            System.out.println("false");
        }
    }

    public Car[] selectAllCars(){
        return cars;
    }

    public Car[] selectElectricCars(){
        return electricCar;
    }



}
