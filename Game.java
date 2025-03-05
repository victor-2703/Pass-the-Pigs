public class Game {
    private Player human;
    private Bot bot;
    private int humanScore;
    private int botScore;
    private int winningScore;

    public Game() {
        human = new Player();
        bot = new Bot();
        humanScore = 0;
        botScore = 0;
        winningScore = 100;
    }
}