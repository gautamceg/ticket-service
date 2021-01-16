package com.gautam.codechallenge.loader;

import com.gautam.codechallenge.model.GENDER;
import com.gautam.codechallenge.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLoader {

    public List<Person> loadEmpData(){

        Person p1 = new Person("Sai", GENDER.MALE, 1000, "Hyderabad", 32);
        Person p2 = new Person("Srinu", GENDER.MALE, 90000, "Hyderabad", 30);
        Person p3 = new Person("Rakshita", GENDER.FEMALE, 50000, "Hyderabad", 31);
        Person p4 = new Person("Reena", GENDER.FEMALE, 40000, "Hyderabad", 45);

        Person p5 = new Person("vishnu", GENDER.MALE, 20000, "Bangalore", 50);
        Person p6 = new Person("ram", GENDER.MALE, 20000, "Bangalore", 25);

        Person p7 = new Person("Selvam", GENDER.MALE, 195000, "Chennai", 40);

        final List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        return personList;
    }
}
