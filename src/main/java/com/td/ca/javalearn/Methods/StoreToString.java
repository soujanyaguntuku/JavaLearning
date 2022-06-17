package com.td.ca.javalearn.Methods;

public class StoreToString {
  // instance fields
  String productType;
  double price;

  // constructor method
  public StoreToString(String product, double initialPrice) {
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
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  // toString method
  public String toString(){
    return "This store sells " +productType+ " at a price of " +price+".";
  }
  // main method
  public static void main(String[] args) {
    StoreToString lemonadeStand = new StoreToString("Lemonade", 3.75);
    StoreToString cookieShop = new StoreToString("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }

}
