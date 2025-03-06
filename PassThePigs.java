import java.util.ArrayList;

public class PassThePigs {
    public static void main(String[] args) {
        System.out.println("Let's play Pass the Pigs!");
        
        ArrayList <Player> players = new ArrayList <Player> ();
        int winningScore = 30;

        players.add(new Human("Human1"));
        players.add(new BotPlayer("Generic Bot"));
        players.add(new BotPlayer("Bot2"));
        
        Player currentPlayer;
        boolean gameover = false;
        
        while(!gameover) {
            for(int i = 0; i < players.size(); i++) {
                currentPlayer = (Player) players.get(i);
                
                int handScore = 0;
                boolean reroll = true;
                boolean pigOut = false;
                
                System.out.println("\n" + currentPlayer.getName() + "'s turn!");
                
                while(reroll) {
                    reroll = currentPlayer.wantsToRoll(currentPlayer.getScore(), handScore, getOtherScores(i, players), winningScore);
                    if(reroll) {
                        int rollDice = PigDice.roll();
                        String dice1 = PigDice.getDice1();
                        String dice2 = PigDice.getDice2();
                        if(rollDice == 0) {
                            handScore = 0;
                            pigOut = true;
                            System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ". That's a PIG OUT!");
                            reroll = false;
                        } 
                        else {
                            handScore += rollDice;
                            System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ".");
                        }
                    }
                }

                if(currentPlayer.getScore() >= winningScore) {
                    System.out.println("Game over! Winner is: " + currentPlayer.getName() + ".");
                    gameover = true;
                    break;
                }
                
                if(!pigOut) {
                    System.out.println(currentPlayer.getName() + " passes.");
                }
                
                currentPlayer.addScore(handScore);
            }
        }
    }
    
    private static ArrayList <Integer> getOtherScores(int currentIndex, ArrayList <Player> players) {
        ArrayList <Integer> result = new ArrayList <Integer>();
        for (int i = 0; i < players.size(); i++) {
            if (i != currentIndex) {
                Player player = (Player) players.get(i);
                result.add(new Integer(player.getScore()));
            }
        }
        return result;
    }
}