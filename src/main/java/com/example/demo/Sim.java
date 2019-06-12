package com.example.demo;

public class Sim {

    int age;
    String surname;
    String firstName;

    public Sim(int age, String surname, String firstName) {
        this.age = age;
        this.surname = surname;
        this.firstName = firstName;
    }

    public String toString() {
        return "My name is : " + firstName + " " + surname + ". I'm  " + age + " years old." ;
    }
}
