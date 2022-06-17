package com.td.ca.javalearn.ScopeEncapsulation;

public class ScopeExample {

  public static void main(String[] args){

    int[] myArray = {1, 2, 3, 4};
    int sum = 0;
    for(int i = 0; i < myArray.length; i++){
     // int sum = 0;
      sum += myArray[i];
    }

    System.out.println(sum);
  }

}
