package com.soujanya.examples.polymorphism;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

  public OddArrayList(Integer... integers){
    super(Arrays.asList(integers).stream()
        .filter(OddArrayList::isOdd).
        collect(Collectors.toList()));
  }

  @Override
  public void add(int index, Integer element){
    if(isOdd(element)){
      super.add(index, element);
    }
  }

  @Override
  public boolean add(Integer integer) {
    if(isOdd(integer)){
      return super.add(integer);
    }
   else
     return false;
  }

  private static boolean isOdd(Integer element){
    return Math.abs(element) % 2 == 1;
  }
}
