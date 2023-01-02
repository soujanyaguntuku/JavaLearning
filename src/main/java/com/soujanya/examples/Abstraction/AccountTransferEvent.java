package com.soujanya.examples.Abstraction;

import java.sql.Timestamp;

public class AccountTransferEvent extends Event{
  public AccountTransferEvent(int id) {
  super(id);
  }


  @Override
  public void processMessage() {
    System.out.println("Customer"+id+" account is transferred");
  }
}
