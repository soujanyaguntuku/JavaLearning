package com.td.ca.javalearn.Loops;

public class Numbers {

  // break and continue
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // Add your code below
      if(i % 5 != 0){
        continue;
      }
      System.out.println(i);

    }
  }

}
