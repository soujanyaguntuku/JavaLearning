package com.soujanya.examples.javamemoryManagement;

public class MainClass {
public static void main(String... args){
  System.out.println("Hello String...");

  Customer john = new Customer("John", 10);
  Customer david = new Customer("David", 21);

  CustomerRecords records = new CustomerRecords();
  records.addCustomer(john);
  records.addCustomer(david);

  //Throws runtime exception
  //records.getRecords().values().clear();

  for(CustomerReadOnly c: records.getRecords().values()){
    System.out.println(c.ToString());
    //c.setAge(10);
  }

  CustomerReadOnly c = records.getCustomer("John");
  System.out.println(c.ToString());
}
}
