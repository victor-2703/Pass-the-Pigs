import java.util.ArrayList;
import java.util.Scanner;

public class Human extends Player {
    private static Scanner scanner = new Scanner(System.in);

    public Human(String name, String strategy) {
        super(name, strategy);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        System.out.println(getName() + ", your total score: " + myScore + ", current hand score: " + handScore);
        System.out.print("Do you want to roll again? (y/n): ");
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("y")) {
            return true;
        }
        else {
            return false;
        }
    }
}