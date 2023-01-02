package com.soujanya.examples.inheritance.extendArrayList;

import java.util.ArrayList;
import java.util.List;

public class ModArrayList<String> extends ArrayList<String> {
  public String getUsingMod(int index){

    //best way to do
//    int validIndex =Math.abs(index) % this.size();
//    return this.get(validIndex);

    // my implementation
    int length = this.size();
    if(index < 0){
      index = -index;
    }
    if(length < index){
      return this.get(Math.floorMod(index, length));
    }
    else
    return this.get(index);
  }

}
