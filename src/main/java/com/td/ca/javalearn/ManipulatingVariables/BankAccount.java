package com.td.ca.javalearn.ManipulatingVariables;

public class BankAccount {

  // Review of manipulating variables

  public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 250;

    double  updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance / 3;
    System.out.println(amountForEachFriend);

    boolean canPurchaseTicket = amountForEachFriend >= 250;
    System.out.println(canPurchaseTicket);
    System.out.println("I gave each friend " +amountForEachFriend + "...");
  }
}
