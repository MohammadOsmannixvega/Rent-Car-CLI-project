package com.cli.booking;

import com.cli.car.Car;
import com.cli.person.Person;

import java.time.LocalDateTime;
import java.util.Objects;



public class Booking {

    public static int count;
    private String bookingId;
    private Car car;
    private Person user;
    private LocalDateTime rentDate;
    private boolean isCanceled;

    public Booking() {
        count++;
    }

    public Booking(String bookingId, Car car, Person user) {
        this.bookingId = bookingId;
        this.car = car;
        this.user = user;
        this.rentDate = LocalDateTime.now();
        this.isCanceled = false;
        count++;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ",car=" + car +
                ",user=" + user +
                ",rentDate=" + rentDate +
                ",isCanceled=" + isCanceled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return isCanceled == booking.isCanceled && Objects.equals(bookingId, booking.bookingId) && Objects.equals(car, booking.car) && Objects.equals(user, booking.user) && Objects.equals(rentDate, booking.rentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, car, user, rentDate, isCanceled);
    }
}
