package com.gautam.codechallenge.model;


public class Person {

    private String name;
    private GENDER gender;
    private double salary;
    private String location;
    private int age;

    public Person(String name, GENDER gender, double salary, String location, int age) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.location = location;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
