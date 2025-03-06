import java.util.ArrayList;
import java.util.Scanner;

public class Human extends Player {
    private static Scanner scanner = new Scanner(System.in);
    private static String strategy;
    private int turn = 0;
    
    public Human(String name) {
        super(name);
        strategy = "Human";
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        System.out.println(getName() + ", your total score: " + myScore + ", current hand score: " + handScore);
        if(turn == 0) {
            System.out.print("Do you want to roll? (y/n): ");
        }
        else {
            System.out.print("Do you want to roll again? (y/n): ");
        }
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("y")) {
            turn++;
            return true;
        }
        else if (input.equals("n")) {
            turn = 0;
            return false;
        }
        else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
            return wantsToRoll(myScore, handScore, otherScores, winningScore);
        }
    }
    
    public void pigOut(boolean zero) {
        if(zero) {
            turn = 0;
        }
    }
}