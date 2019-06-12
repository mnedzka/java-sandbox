package Butchers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ButchersInput {

  public static void main(String[] args) {
    String imie;
    String nazwisko;
    int wiek;

    Scanner scan = new Scanner(System.in);
    System.out.println("Give a name for Your Sim:");
    imie = scan.nextLine();
    System.out.println("Podaj nazwisko sima:");
    nazwisko = scan.nextLine();
    System.out.println("Podaj wiek sima:");
    wiek = scan.nextInt();
    ButcherSim sim = new ButcherSim(wiek, nazwisko, imie);
    System.out.println("Hi " + sim.firstName + " " + sim.surname);
    System.out.println(sim.firstName + " what budget do you have?");
    double budget = scan.nextDouble();
    System.out.println("Do you want to eat meat today?(true, false)");
    if (doYouWannaEat(scan)) {
      System.out.println("What do you want for lunch, ribs, chuck steak or tenderloin?");
      scan.nextLine();
      String meat = scan.nextLine();
      System.out.println("How many pieces do you need?");
      int pieces = scan.nextInt();
      Butchers butcher = new Butchers(budget, pieces);
      butcher.setMeat(meat);
      butcher.setTotal();
      System.out.println(butcher.ifCanGetMeat());
    } else {
      System.out.println("Maybe next time...");
    }
  }


  private static boolean doYouWannaEat(Scanner scan) {
    boolean doYouWannaEat;
    try {
      doYouWannaEat = scan.nextBoolean();
    } catch (InputMismatchException e) {
      System.out.println("Please answer: true or false");
      scan.next();
      doYouWannaEat = doYouWannaEat(scan);
    }
    return doYouWannaEat;
  }
}







