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
        for(int i = 0; i < 10; i++) {
            int rollDice = PigDice.roll();
            System.out.println(rollDice);
        }
        int handScore = 0;
        Player player1 = (Player) players.get(1);
        System.out.println(player1.getName() + " rolled a " + PigDice.roll());
        System.out.println(player1.getName() + " rolled a " + PigDice.roll());
    }
}