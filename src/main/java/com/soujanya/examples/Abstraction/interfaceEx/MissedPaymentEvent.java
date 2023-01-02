package com.soujanya.examples.Abstraction.interfaceEx;

import java.sql.Timestamp;

public class MissedPaymentEvent implements Event{
  private final int id;
  private final Long timeStamp;

  public MissedPaymentEvent(int id) {
    this.id = id;
    this.timeStamp = new Timestamp(System.currentTimeMillis()).getTime();
  }

  @Override
  public Long getTimeStamp() {
    return this.timeStamp;
  }

  @Override
  public void processMessage() {
    System.out.println("Customer"+this.id+" missed the payment");

  }
}
