package com.td.ca.javalearn.Arrays;
import java.util.Arrays;

public class Newsfeed {

// Creating an Array Explicitly
  //Importing Arrays

  //Length

  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  public Newsfeed(){

  }

  // Create getTopics() below:
  public String[] getTopics(){
    String[] topics = { "Opinion", "Tech" ,"Science", "Health"};
    return topics;
  }
  public int getNumTopics(){
    return topics.length;
  }
  public String getTopTopic(){
    return topics[0];
  }

  public void viewTopic(int topicIndex){
    views[topicIndex] += 1;
  }
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();

    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    // Importing arrays
    System.out.println(Arrays.toString(topics));
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());


    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);

    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
  // length of array
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
  }

}
