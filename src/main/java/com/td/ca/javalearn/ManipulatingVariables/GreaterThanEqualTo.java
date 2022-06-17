package com.td.ca.javalearn.ManipulatingVariables;

public class GreaterThanEqualTo {

  //Greater/Less Than or Equal To

  public static void main(String[] args){
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;

    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;

    boolean isChallengeComplete =   yourWaterIntake >= totalRecommendedAmount;

    System.out.println(isChallengeComplete);
  }

}
