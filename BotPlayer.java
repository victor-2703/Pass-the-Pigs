import java.util.ArrayList;

public class BotPlayer extends Player {
    private static String strategy = "Generic";
    
    public BotPlayer(String name) {
        super(name);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        if(handScore < 20) {
            return true;
        }
        else {
            return false;
        }
    }
}