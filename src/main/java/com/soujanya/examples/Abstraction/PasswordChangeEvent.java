package com.soujanya.examples.Abstraction;

import java.sql.Timestamp;

public class PasswordChangeEvent extends Event {

  public PasswordChangeEvent(int id) {
  super(id);
  }
  @Override
  public void processMessage() {
    System.out.println("Customer"+id+" changed the password");
  }
}
