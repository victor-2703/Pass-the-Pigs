public class Player {
    private String name;
    private String strategy;

    public Player(String nm) {
        name = nm;
        strategy = "";
    }
    
    /*public Player(String nm, String strat) {
        name = nm;
        strategy = strat;
    }*/
    
    public String getName() {
        return name;
    }
    
    public String getStrategy() {
        return strategy;
    }
    
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }
}