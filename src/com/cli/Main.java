package com.cli;

import com.cli.booking.Booking;
import com.cli.booking.BookingService;
import com.cli.car.Brand;
import com.cli.car.Car;
import com.cli.car.CarService;
import com.cli.person.Gender;
import com.cli.person.Person;
import com.cli.person.PersonService;
import com.cli.person.UserAccessDataFromFile;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scan = new Scanner(System.in);
//
//        Car bmw = new Car("1234", Brand.BMW, true, new BigDecimal("50000"));
//        Car tesla = new Car("7456", Brand.TESLA, true, new BigDecimal(30000));
//        Car ford = new Car("4555", Brand.FORD, false, new BigDecimal(10000));
//        Car ferrari = new Car("2346", Brand.FERRARI, false, new BigDecimal(60000));
//
//        Person mohammad = new Person("Mohammad", "Osman", new BigDecimal(100000), 25, "0430ca6a-918b-4aac-bca4-549df9fe2c6c", Gender.MALE);
//        Person jamila = new Person("Jamila", "Hussain", new BigDecimal(1000), 32, "0430ca6a-918b-4aac-bca4-549df9fe2c6c", Gender.FEMALE);
//        Person rawan = new Person("Rawan", "Osman", new BigDecimal(100000), 29, "0430ca6a-918b-4aac-bca4-549df9fe2c6c", Gender.FEMALE);
//        Person ali = new Person("Ali", "Ibrahim", new BigDecimal(10000), 25, "0430ca6a-918b-4aac-bca4-549df9fe2c6c", Gender.MALE);
//
//        CarService carService = new CarService();
//        PersonService personService = new PersonService();
//        BookingService bookingService = new BookingService();
//
//        try {
//            carService.registerCar(bmw);
//            carService.registerCar(tesla);
//            carService.registerCar(ford);
//            carService.registerCar(ferrari);
//            personService.registerPerson(mohammad);
//            personService.registerPerson(jamila);
//            personService.registerPerson(rawan);
//            personService.registerPerson(ali);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        boolean wantContinue = true;
//
//        while(wantContinue){
//            System.out.println("" +
//                    "1\uFE0F⃣ - Book Car\n" +
//                    "2\uFE0F⃣ - View All User Booked Cars\n" +
//                    "3\uFE0F⃣ - View All Bookings\n" +
//                    "4\uFE0F⃣ - View Available Cars\n" +
//                    "5\uFE0F⃣ - View Available Electric Cars\n" +
//                    "6\uFE0F⃣ - View all users\n" +
//                    "7\uFE0F⃣ - Exit"
//            );
//            System.out.println();
//            System.out.println();
//            int serviceWant = scan.nextInt();
//
//            if(serviceWant == 7){
//                wantContinue = false;
//            }
//            if(serviceWant > 7 ){
//                System.out.println("Sorry, we don not have this service please try others. Thanks! ❌");
//            }
//            if (serviceWant == 6) {
//                System.out.println(Arrays.toString(personService.listOfPerson()).replaceAll(", ", "\n"));
//            }
//
//            if (serviceWant == 5){
//                System.out.println(Arrays.toString(carService.listOfElectricCars()).replaceAll(", ", "\n"));
//            }
//
//            if (serviceWant == 4){
//                System.out.println(Arrays.toString(carService.listOfCars()).replaceAll(", ", "\n"));
//            }
//
//            if (serviceWant == 3){
//                if (bookingService.selectAllBooking()[0] == null ){
//                    System.out.println("❌ there is no booked car, we hope you booking one! ❤❤");
//                }else{
//                    System.out.println(Arrays.toString(bookingService.selectAllBooking()));
//                }
//            }
//
//            if (serviceWant == 2) {
//                System.out.println(Arrays.toString(personService.listOfPerson()).replaceAll(", ", "\n"));
//                System.out.println("▶ select user id");
//                String userId = scan.next();
//                if (bookingService.selectUserBooked()[0] == null){
//                    System.out.println("❌ user" + userId);
//                }
//                for (Person users : bookingService.selectUserBooked()) {
//                    if (users == null) {
//                    }else if(users.getuId().equals(userId)){
//                        System.out.println("Yes he did!");
//                    }else{
//                        System.out.println("❌ user" + userId);
//                    }
//
//                }
//            }
//
//            if (serviceWant == 1){
//                System.out.println(Arrays.toString(carService.listOfCars()).replaceAll(", ", "\n"));
//                System.out.println("▶ select car reg number: ");
//                String regNum = scan.next();
//                System.out.println(Arrays.toString(personService.listOfPerson()).replaceAll(", ", "\n"));
//                String userId = scan.next();
//                UUID uuid = randomUUID();
//                String bookingId = uuid.toString();
//                Person userWant = null;
//                Car car = null;
//
//                for (Person user: personService.listOfPerson()){
//                    if (user.getuId().equals(userId)){
//                        userWant = user;
//                    }
//                }
//
//                for (Car cars : carService.listOfCars()){
//                    if (cars.getRegNumber().equals(regNum)){
//                        car = cars;
//                    }
//                }
//
//
//                Booking booked = new Booking(bookingId, car, userWant);
//
//                if (bookingService.bookCar(booked)){
//                    System.out.println("🎆 Successfully booked car with reg number " + regNum + " for user " + userWant + "\n Booking ref:" + bookingId);
//                }else{
//                    System.out.println("🚑 Sorry you can't book!");
//                }
//
//            }
//
//
//            System.out.println();
//            System.out.println();
//        }

        UserAccessDataFromFile user = new UserAccessDataFromFile();
        System.out.println(Arrays.toString(user.getUser()).replaceAll(", ", "\n"));

    }
}