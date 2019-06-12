package Butchers;

public class Butchers {
  private double total;
  private double budget;
  private int pieces;
  private String meat;

  private final double ribs = 45.5;
  private final double chuckSteak = 32.5;
  private final double tenderloin = 15.5;

  public Butchers(double availableBudget, int piecesOfMeat) {
    budget = availableBudget;
    pieces = piecesOfMeat;
  }

  public void setMeat(String chooseMeat) {
    meat = chooseMeat;
  }

  public void setTotal() {
    switch (meat.toLowerCase()) {
      case "ribs":
        total = ribs * pieces;
        break;
      case "chuck steak":
        total = chuckSteak * pieces;
        break;
      default:
        total = tenderloin * pieces;
    }
  }

  public String ifCanGetMeat() {
    return budget <= total ? "You don't have enough budget" : "You bought " + pieces + " pieces of  " + meat + " with total price " + total + ".";
  }
}
