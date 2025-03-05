import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Let's play Pass the Pigs!");
        
        ArrayList <Player> players;
        int winningScore;
        
        players = new ArrayList <Player> ();
        winningScore = 100;
        players.add(new Human("Human1"));
        players.add(new Bot("Bot1", "aggressive"));
        
        for(int i = 0; i < players.size(); i++) {
            Player currentPlayer = (Player) players.get(i);
        }
        
        int handScore = 0;

        boolean reroll = true;
        
        Player player1 = (Player) players.get(1);
        int rollDice = PigDice.roll();
        if(rollDice == 0) {
            handScore = 0;
        } else {
            handScore += rollDice;
        }
        System.out.println("Player 1 rolled a " + rollDice + " and now has a hand score of " + handScore);
    }
}