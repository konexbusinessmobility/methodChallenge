package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int highScorePosition =  calculateHighScorePosition(20);
        displayHIghScorePosition("David", highScorePosition);

        highScorePosition =  calculateHighScorePosition(200);
        displayHIghScorePosition("Aimee", highScorePosition);

        highScorePosition =  calculateHighScorePosition(800);
        displayHIghScorePosition("Fizz", highScorePosition);

        highScorePosition =  calculateHighScorePosition(1000);
        displayHIghScorePosition("Larry", highScorePosition);

    }

    public static void displayHIghScorePosition(String playersName, int positionHighScoresTable){
        System.out.println(playersName + " managed to get into position " + positionHighScoresTable
        + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }
}
