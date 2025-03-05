import java.util.ArrayList;

public class RiskyBot extends Bot {
    public RiskyBot(String name, String strategy) {
        super(name, strategy);
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