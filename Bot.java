public class Bot extends Player {
    public Bot(String name, String strategy) {
        super(name, strategy);
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}