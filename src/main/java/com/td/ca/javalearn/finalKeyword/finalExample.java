package com.td.ca.javalearn.finalKeyword;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;

public class finalExample {
  private final int name = 10;
   private final Company comapny = new Company();


  public static void main(String args[]){
    new finalExample().print();
  }
  private void print(){
   comapny.address = "kde";
   comapny.name= "wq";
    comapny.address = "kdelfm";
   //comapny = new Company();
   System.out.printf("printing name : %s%n", name);
//   name = 1;
   System.out.printf("printing name : %s%n", name);

 }

}

