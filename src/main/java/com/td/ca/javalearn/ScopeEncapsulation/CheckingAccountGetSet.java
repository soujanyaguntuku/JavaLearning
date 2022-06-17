package com.td.ca.javalearn.ScopeEncapsulation;

public class CheckingAccountGetSet {
  private String name;
  private int balance;
  private String id;

  public CheckingAccountGetSet(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  //Write new methods here:

  public int getBalance(){
    return balance;
  }
  public void setBalance(int newBalance){
    balance = newBalance;
  }
}
