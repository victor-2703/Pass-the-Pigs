import java.util.ArrayList;

public class Player {
    private String name;
    private String strategy;
    private int score;
    private int turn = 0;

    public Player(String nm) {
        name = nm;
        strategy = "";
        score = 0;
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
        return false;
    }
    
    public void pigOut(boolean zero) {
        if(zero) {
            turn = 0;
        }
    }
}