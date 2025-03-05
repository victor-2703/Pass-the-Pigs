import java.util.ArrayList;

public class Game {
    private ArrayList <Player> players;
    private int winningScore;
    
    public Game() {
        players = new ArrayList <Player> ();
        winningScore = 100;
        players.add(new Human("Human1", "Human"));
        players.add(new Bot("Bot1", "aggressive"));
        for(int i = 0; i < 10; i++) {
            int rollDice = PigDice.roll();
            System.out.println(rollDice);
        }
    }
}