package com.soujanya.examples.Abstraction;



public class MissedPaymentEvent extends Event{


  public MissedPaymentEvent(int id) {
    super(id);
  }

  @Override
  public void processMessage() {
  System.out.println("Customer"+id+" missed the payment");
  }
}
