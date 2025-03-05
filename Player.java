import java.util.ArrayList;

public class Player {
    private String name;
    private String strategy;
    private int score;

    public Player(String nm) {
        name = nm;
        strategy = "";
    }
    
    public Player(String nm, String strat) {
        name = nm;
        strategy = strat;
    }
    
    public String getName() {
        return name;
    }
    
    public String getStrategy() {
        return strategy;
    }
    
    public int getScore() {
        return score;
    }

    public void addScore(int amount) {
        score = score + amount;
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        return true;
    }
}