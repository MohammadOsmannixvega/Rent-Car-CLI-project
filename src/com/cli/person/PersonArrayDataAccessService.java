package com.cli.person;

public class PersonArrayDataAccessService implements PersonDAO {
    private static Person[] persons;
    private static int countSave;

    static {
        persons = new Person[Person.numberOfPerson];
        countSave = 0;
    }

    public static void savePerson(Person person){
        if (countSave > 10){
            System.out.println("You can not save to much car");
            return;
        }else{
            persons[countSave++] = person;
        }
    }

    public Person[] getUser(){
        return persons;
    }
}
