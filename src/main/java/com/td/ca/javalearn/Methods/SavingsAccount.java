package com.td.ca.javalearn.Methods;

public class SavingsAccount {

  // review -- methods

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  //Check balance:
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " +balance);
  }

  //Deposit:
  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
    System.out.println("You just deposited " +amountToDeposit);
  }

  //Withdrawing:
  public int withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    System.out.println("You just withdrew "+amountToWithdraw);
    return amountToWithdraw;
  }
  public String toString(){
    return "the current balance is "+balance;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    int afterWithdraw = savings.withdraw(300);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(600);

    //Check balance:
    savings.checkBalance();

    System.out.println(savings);
  }
}
