package com.cli.person;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.UUID;

public class UserAccessDataFromFile implements PersonDAO{

    private static Person[] users;

    private static String[] user;

    int count = 0;

    Scanner sc = new Scanner(new File("src/com/cli/users.csv"));



    public UserAccessDataFromFile() throws FileNotFoundException {
        user = new String[4];
        users = new Person[4];
        sc.useDelimiter(",");
        while(sc.hasNext()){
            user[count++] = sc.nextLine();
        }
        count = 0;


        for (String user: user){
            String[] splitString = user.split(", ");
            Person person = new Person(splitString[1], splitString[0]);
            users[count] = person;
            count++;
        }


    }



    @Override
    public Person[] getUser() {
        return users;
    }
}
