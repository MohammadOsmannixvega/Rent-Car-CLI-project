package com.cli.person;

import java.math.BigDecimal;
import java.util.Objects;

public class Person {

    public static int numberOfPerson;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private int age;
    private String uId;

    private Gender gender;

    static {
        numberOfPerson = 0;
    }

    public Person() {
        numberOfPerson++;
    }

    public Person(String firstName, String lastName, BigDecimal salary, int age, String uId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
        this.uId = uId;
        this.gender = gender;
        numberOfPerson++;
    }

    public Person(String firstName, String lastName, String salary, int age, String uId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = new BigDecimal(salary);
        this.age = age;
        this.uId = uId;
        numberOfPerson++;
    }

    public Person(String firstName, String uId) {
        this.firstName = firstName;
        this.uId = uId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ",lastName='" + lastName + '\'' +
                ",salary=" + salary +
                ",age=" + age +
                ",uId='" + uId + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(salary, person.salary) && Objects.equals(uId, person.uId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, age, uId);
    }


}
