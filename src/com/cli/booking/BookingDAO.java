package com.cli.booking;

import com.cli.car.Car;
import com.cli.car.CarService;
import com.cli.person.Person;

import java.util.Arrays;

public class BookingDAO {
    private Booking[] listOfBookedCar;
    private Person[] listOfPersonBooked;
    private int rentNum;

    {
        CarService carService = new CarService();
        listOfBookedCar = new Booking[Car.numberOfCars];
        listOfPersonBooked = new Person[Car.numberOfCars];
        Arrays.fill(listOfPersonBooked, null);
        rentNum = 0;
    }

    public void saveBooking(Booking book){
        if (rentNum < Booking.count){
            listOfBookedCar[rentNum] = book;
            listOfPersonBooked[rentNum] = book.getUser();
            ++rentNum;
        }else{
            System.out.println("You can't book car");
        }


    }

    public Booking[] selectBooked(){
        return listOfBookedCar;
    }
    public Person[] selectUserBooked(){
        return listOfPersonBooked;
    }
}
