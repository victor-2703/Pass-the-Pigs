import java.util.ArrayList;

public class RiskyBot extends Player {
    private static String strategy = "Risky";
    
    public RiskyBot(String name) {
        super(name);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        return true;
    }
}