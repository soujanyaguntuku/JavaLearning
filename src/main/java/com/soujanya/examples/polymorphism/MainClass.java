package com.soujanya.examples.polymorphism;

import java.util.ArrayList;

public class MainClass {

  public static void main(String args[]){
    OddArrayList oddArrayList = new OddArrayList(1, 2, -3, 4, 5, 7, 8, -9, 10);
    System.out.println(oddArrayList.size());

    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(-3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(7);
    arrayList.add(8);
    arrayList.add(-9);
    arrayList.add(10);
    System.out.println(arrayList.size());


  }

}
