import java.util.Scanner;

public class Player {
    private String playerName;
    private String strategyDescription;
    private Scanner scanner;

    public Player(String name) {
        playerName = name;
        scanner = new Scanner(System.in);
    }
}