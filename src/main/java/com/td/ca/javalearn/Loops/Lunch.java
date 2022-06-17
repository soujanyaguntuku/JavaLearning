package com.td.ca.javalearn.Loops;
import java.util.ArrayList;

public class Lunch {

  //Removing Elements During Traversal

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
      // Add your code below
      for(int i=0;i<lunchBox.size(); i++){
        if(lunchBox.get(i).equals("ant")){
          lunchBox.remove(i);
          i--;
        }
      }
      return lunchBox;
    }


    public static void main(String[] args) {
      ArrayList<String> lunchContainer = new ArrayList<String>();
      lunchContainer.add("apple");
      lunchContainer.add("ant");
      lunchContainer.add("ant");
      lunchContainer.add("sandwich");
      lunchContainer.add("ant");
      lunchContainer = removeAnts(lunchContainer);
      System.out.println(lunchContainer);

    }

}
