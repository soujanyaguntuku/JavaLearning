package com.soujanya.examples.polymorphism;

import java.util.ArrayList;
import java.util.Random;

public class AddRandomNumber {

  public static void main(String[] args)
  {
      OddArrayList oddArrayList = new OddArrayList();
      oddArrayList.add(3);
      oddArrayList.add(-5);
      addRandomNumber(oddArrayList);
      System.out.println(oddArrayList);

      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(3);
      arrayList.add(4);
      addRandomNumber(arrayList);
      System.out.println(arrayList);
  }
  private static void addRandomNumber( ArrayList<Integer> list)
  {
    int previousLength = list.size();
    Random random = new Random();
    while(previousLength + 1 != list.size()){
    int num = random.nextInt() % 1000;
    list.add(num);
  }
  }
}
