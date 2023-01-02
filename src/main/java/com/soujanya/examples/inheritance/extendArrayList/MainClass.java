package com.soujanya.examples.inheritance.extendArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
  private static ModArrayList arrayList;

  public static void main(String[] args){
    arrayList.add("abcd");
    arrayList.add("efgh");
    arrayList.add("ijkl");
    arrayList.add("mnop");
    arrayList.add("qrst");
    arrayList.add("wxyz");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the index: ");
    int index = sc.nextInt();
    System.out.println("string value at index is: " +arrayList.getUsingMod(index));

  }

}
