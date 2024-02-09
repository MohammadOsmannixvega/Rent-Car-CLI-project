package com.cli.person;

public class PersonService {

    private PersonArrayDataAccessService personMemory = new PersonArrayDataAccessService();
    public boolean registerPerson(Person person){
        if(person.getAge() < 16){
            return false;
        }
        personMemory.savePerson(person);
        return true;
    }

    public Person[] listOfPerson(){
        return personMemory.getUser();
    }
}
