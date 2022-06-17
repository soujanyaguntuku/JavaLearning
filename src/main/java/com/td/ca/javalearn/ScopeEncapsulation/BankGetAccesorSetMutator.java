package com.td.ca.javalearn.ScopeEncapsulation;

public class BankGetAccesorSetMutator {
  private CheckingAccountGetSet accountOne;
  private CheckingAccountGetSet accountTwo;

  public BankGetAccesorSetMutator(){
    accountOne = new CheckingAccountGetSet("Zeus", 100, "1");
    accountTwo = new CheckingAccountGetSet("Hades", 200, "2");
  }

  public static void main(String[] args){
    BankGetAccesorSetMutator bankOfGods = new BankGetAccesorSetMutator();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
  }


}
