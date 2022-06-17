package com.td.ca.javalearn.Arrays;
import java.util.Arrays;

public class NewsfeedStringArgsExample {
  String[] topics;

  public NewsfeedStringArgsExample(String[] initialTopics) {
    topics = initialTopics;
  }

  public static void main(String[] args) {
    NewsfeedStringArgsExample feed;
    if (args[0].equals("Human")) {

      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
      feed = new NewsfeedStringArgsExample(humanTopics);

    } else if(args[0].equals("Robot")) {

      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new NewsfeedStringArgsExample(robotTopics);

    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new NewsfeedStringArgsExample(genericTopics);
    }

    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}
