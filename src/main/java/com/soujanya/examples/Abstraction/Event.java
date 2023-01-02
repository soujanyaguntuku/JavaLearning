package com.soujanya.examples.Abstraction;

import java.sql.Timestamp;

public abstract class Event implements EventInterface {
  protected final int id;
  protected final Long timeStamp;
  public Event(int id) {
    this.id = id;
    timeStamp = new Timestamp(System.currentTimeMillis()).getTime();
  }
   @Override
   public Long getTimeStamp(){
    return this.timeStamp;
  }
  public abstract void processMessage();
}
