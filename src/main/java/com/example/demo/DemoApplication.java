package com.example.demo;


import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What budget do you have?");
        double budget = scan.nextDouble();
        System.out.println("Do you want to go to cinema for comedy,horror or other?");
        scan.nextLine();
        String movie = scan.nextLine();
        System.out.println("How many tickets do you need?");
        int tickets = scan.nextInt();
        Cinema goToCinema = new Cinema(budget, tickets);
        goToCinema.setMovie(movie);
        goToCinema.setTotal();
        System.out.println(goToCinema.ifCanGoToCinema());
    }
}
