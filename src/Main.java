import java.util.Scanner;
public class Main {
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >=1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        else {
            return 4;
        }
    }

    public static void main(String[] args) {
        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("James", result);
        result = calculateHighScorePosition(1000);
        displayHighScorePosition("Paul", result);
        result = calculateHighScorePosition(500);
        displayHighScorePosition("Michael", result);
        result = calculateHighScorePosition(100);
        displayHighScorePosition("Koby", result);
        result = calculateHighScorePosition(25);
        displayHighScorePosition("Tim", result);

    }
}