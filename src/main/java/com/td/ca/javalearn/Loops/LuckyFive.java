package com.td.ca.javalearn.Loops;
// Importing the Random library
import java.util.Random;

public class LuckyFive {

  // while loop

  public static void main(String[] args) {

    // Creating a random number generator
    Random randomGenerator = new Random();

    // Generate a number between 1 and 6 -- ´> nextInt(min+max-1)+1
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while(dieRoll != 5){
      System.out.println(dieRoll);
      dieRoll = randomGenerator.nextInt(6)+1;

    }

  }

}
