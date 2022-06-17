package com.td.ca.javalearn.IntroductionToClasses;

public class CookieStore {

// Classes: Multiple Fields-- Exercise

  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor method
  public CookieStore(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // main method
  public static void main(String[] args) {
    CookieStore cookieShop = new CookieStore("cookies", 12, 3.75);
  }
}
