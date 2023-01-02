package com.soujanya.examples.javamemoryManagement.exercise;

public class MainClass {
  public static void main(String[] args) {

    BookCollection bc = new BookCollection();
    bc.printAllBooks();
    //get price of book called Tom Jones in EUR
    System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("USD"));
    bc.printAllBooks();

  }
}
