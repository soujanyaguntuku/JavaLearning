package com.soujanya.examples.Abstraction.interfaceEx;



public class MainClass {
  public static void main(String... args){
    Event event1 = new PasswordChangeEvent(1);
    Event event2 = new MissedPaymentEvent(2);
    Event event3 = new AccountTransferEvent(3);

   Event[] events = {event1, event2, event3};
    for(Event event : events){
      System.out.println(event.getTimeStamp());
      event.processMessage();
      System.out.println();
    }
  }
}
