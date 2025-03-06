import java.util.ArrayList;
import java.util.Scanner;

public class PassThePigs {
    public static void main(String[] args) {
        boolean gamePlay = true;
        while (gamePlay) {
            System.out.println("Let's play Pass the Pigs!");
            System.out.println("\n" + "Enter Your Name: ");
            Scanner scanner1 = new Scanner(System.in);
            String humanName = scanner1.nextLine();
            int winningScore = 0;
            boolean valid = true;
            
            while (valid) {
                System.out.println("\n" + "Enter the Winning Score (positive number): ");
                Scanner scanner2 = new Scanner(System.in);
                if (scanner2.hasNextInt()) {
                    winningScore = scanner2.nextInt();
                    if (winningScore > 0) {
                        valid = false;
                    }
                    else {
                        System.out.println("Invalid input. Please enter a positive number.");
                    }
                }
                else {
                    System.out.println("Invalid input. Please enter a positive number.");
                    scanner2.next();
                }
            }
            
            ArrayList <Player> players = new ArrayList <Player> ();
            
            players.add(new Human(humanName));
            players.add(new BotPlayer("Generic Bot"));
            players.add(new SchemerBot("Schemer Bot"));
            players.add(new RiskyBot("Risky Bot"));
            players.add(new WimpyBot("Wimpy Bot"));
            
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
                                currentPlayer.pigOut(true);
                                System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ". That's a PIG OUT!");
                                reroll = false;
                            } 
                            else {
                                handScore += rollDice;
                                System.out.println(currentPlayer.getName() + " rolls a " + dice1 + " and a " + dice2 + " for a roll of " + rollDice + ". Handscore is now " + handScore + ".");
                            }
                        }
                    }
                    
                    currentPlayer.addScore(handScore);
                    
                    for(int j = 0; j < players.size(); j++) {
                        Player player = (Player) players.get(j);
                        System.out.print(player.getName() + ": " + player.getScore() + " | ");
                    }
                    System.out.println("");

                    if(currentPlayer.getScore() >= winningScore) {
                        System.out.println("\n" + "Game over! Winner is: " + currentPlayer.getName() + ".");
                        gameover = true;
                        break;
                    }
                    
                    if(!pigOut) {
                        System.out.println(currentPlayer.getName() + " passes.");
                    }
                }
            }
            gamePlay = reGame();
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
    
    private static boolean reGame() {
        System.out.println("\n" + "Do you want to play again? (y/n): ");
        Scanner scanner3 = new Scanner(System.in);
        String input = scanner3.nextLine().toLowerCase();
        if (input.equals("y")) {
            return true;
        }
        else if (input.equals("n")) {
            System.out.println("Thank you for playing!");
            return false;
        }
        else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
            return reGame();
        }
    }
}