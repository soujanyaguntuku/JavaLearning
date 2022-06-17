package com.td.ca.javalearn.Methods;

public class StoreReturnExercise {
// methods -- return -- Exercise

  // instance fields
  String productType;
  double price;

  // constructor method
  public StoreReturnExercise(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + (price * 0.08);
    return totalPrice;
  }
  // main method
  public static void main(String[] args) {
    StoreReturnExercise lemonadeStand = new StoreReturnExercise("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}
