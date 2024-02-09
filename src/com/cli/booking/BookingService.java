package com.cli.booking;

import com.cli.person.Person;
import com.cli.person.PersonArrayDataAccessService;

public class BookingService {

    PersonArrayDataAccessService users = new PersonArrayDataAccessService();
    BookingDAO bookedCars = new BookingDAO();

    public boolean bookCar(Booking book){
        // check user exist
        for (Person user: users.getUser()){
            if (!book.getUser().getuId().equals(user.getuId())){
                System.out.println("There is no exist user by this id");
                return false;
            }
        }

        // Check if this car booked or not
       if (bookedCars.selectBooked()[0] == null){

       }else{
           for (Booking car : bookedCars.selectBooked()){
               if (!book.getCar().getRegNumber().equals(book.getCar().getRegNumber())){
                   System.out.println("This car is took by another person sorry!");
                   return false;
               }
           }
       }

        bookedCars.saveBooking(book);

        return true;
    }

    public Booking[] selectAllBooking(){
        return bookedCars.selectBooked();
    }
    public Person[] selectUserBooked(){
        return bookedCars.selectUserBooked();
    }

}
