import java.util.ArrayList;

public class WimpyBot extends Player {
    private static String strategy = "Wimpy";
    private int turn = 0;
    
    public WimpyBot(String name) {
        super(name);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        if(turn == 0) {
            turn++;
            return true;
        }
        else {
            turn = 0;
            return false;
        }
    }
    
    public void pigOut(boolean zero) {
        if(zero) {
            turn = 0;
        }
    }
}