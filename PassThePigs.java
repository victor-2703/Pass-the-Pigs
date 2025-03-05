import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Let's play Pass the Pigs!");
        
        ArrayList <Player> players;
        int winningScore;
        
        players = new ArrayList <Player> ();
        winningScore = 100;
        players.add(new Human("Human1", "Human"));
        players.add(new Bot("Bot1", "aggressive"));
        
        Player currentPlayer = null;
        for(int i = 0; i < players.size(); i++) {
            currentPlayer = (Player) players.get(i);
            
            int handScore = 0;
            boolean reroll = true;
        
            System.out.println("\n" + currentPlayer.getName() + "'s turn!");
            
            while (reroll) {
                reroll = currentPlayer.wantsToRoll(currentPlayer.getScore(), handScore, getOtherScores(i, players), winningScore);
                if (reroll) {
                    int rollDice = PigDice.roll();
                    String dice1 = PigDice.getDice1();
                    String dice2 = PigDice.getDice2();
                    if(rollDice == 0) {
                        System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ".");
                        handScore = 0;
                        break;
                    } else {
                        handScore += rollDice;
                        System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ".");
                    }
                }
            }
        }
    }
    
    private static ArrayList <Integer> getOtherScores(int currentIndex, ArrayList <Player> players) {
        ArrayList <Integer> result = new ArrayList();
        for (int i = 0; i < players.size(); i++) {
            if (i != currentIndex) {
                Player player = (Player) players.get(i);
                result.add(new Integer(player.getScore()));
            }
        }
        return result;
    }
}