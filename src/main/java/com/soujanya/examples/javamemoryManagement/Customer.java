package com.soujanya.examples.javamemoryManagement;

public class Customer implements CustomerReadOnly {
private String name;
private int age ;

  public void setAge(int age) {
    this.age = age;
  }

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String ToString(){
    return this.name + "is" + this.age + "years old.";
  }
}
