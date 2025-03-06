import java.util.ArrayList;

public class SchemerBot extends Player {
    private static String strategy = "Schemer";
    
    public SchemerBot(String name) {
        super(name);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList <Integer> otherScores, int winningScore) {
        int need = winningScore - myScore;
        if (handScore >= need) {
            return false;
        }
        
        int oppMaxScore = otherScores.get(0);
        int difference = myScore - oppMaxScore;
        
        double circuitBreaker;
        if (difference < -(winningScore * 0.3)) {
            circuitBreaker = (winningScore * 0.3);
        }
        else if (difference < 0) {
            circuitBreaker = (winningScore * 0.2);
        }
        else if (difference < (winningScore * 0.2)) {
            circuitBreaker = (winningScore * 0.15);
        }
        else {
            circuitBreaker = (winningScore * 0.1);
        }

        if (oppMaxScore >= (winningScore * 0.9) && difference < 0) {
            circuitBreaker = circuitBreaker + (winningScore * 0.05);
        }
        
        if (myScore >= (winningScore * 0.8)) {
            circuitBreaker = Math.min(circuitBreaker, (winningScore * 0.08));
        }
        
        if (handScore < circuitBreaker) {
            return true;
        }
        return false;
    }
}