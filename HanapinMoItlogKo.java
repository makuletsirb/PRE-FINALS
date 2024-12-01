import java.util.Scanner;
import java.util.Random;

public class HanapinMoItlogKo implements Game {
    private Player player;
    private Treasure treasure;
    private int movesRemaining;
    private final int gridSize = 5;
    private boolean[][] treasuresFound;

    public HanapinMoItlogKo() {
        this.player = new GamePlayer();
        this.treasure = new GameTreasure();
        this.movesRemaining = 10;
        this.treasuresFound = new boolean[gridSize][gridSize];
        placeTreasures();
    }

    public static void main(String[] args) {
        HanapinMoItlogKo game = new HanapinMoItlogKo();
        game.startGame();
    }

    @Override
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (movesRemaining > 0) {
            System.out.println("You have " + movesRemaining + " moves left.");
            System.out.print("Pili ka ng move mo boss (up, down, left, right): ");
            String move = scanner.nextLine();
            player.move(move);
            checkForTreasure(player.getPositionX(), player.getPositionY());

            if (allTreasuresFound()) {
                System.out.println("Congratulations! Nakita mo itlog ko boss!");
                break;
            }
            movesRemaining--;
        }

        if (movesRemaining == 0) {
            System.out.println("Out kana boss.");
        }
        scanner.close();
    }

    private void placeTreasures() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(gridSize);
            int y = random.nextInt(gridSize);
            treasuresFound[x][y] = true;
        }
    }

    private void checkForTreasure(int x, int y) {
        if (x >= 0 && x < gridSize && y >= 0 && y < gridSize) {
            if (treasuresFound[x][y]) {
                System.out.println("Nakita mo itlog ko sa (" + x + ", " + y + ")!");
                treasuresFound[x][y] = false;
            } else {
                System.out.println("Wala dito itlog ko :)");
            }
        } else {
            System.out.println("Lagpas kana boss!.");
        }
    }

    private boolean allTreasuresFound() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (treasuresFound[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

interface Game {
    void startGame();
}

interface Player {
    void move(String direction);
    int getPositionX();
    int getPositionY();
}

interface Treasure {
    boolean isFound(int x, int y);
}

class GamePlayer implements Player {
    private int positionX;
    private int positionY;

    public GamePlayer() {
        this.positionX = 0;
        this.positionY = 0;
    }

    @Override
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                positionX = Math.max(0, positionX - 1);
                break;
            case "down":
                positionX = Math.min(4, positionX + 1);
                break;
            case "left":
                positionY = Math.max(0, positionY - 1);
                break;
            case "right":
                positionY = Math.min(4, positionY + 1);
                break;
            default:
                System.out.println("Invalid direction! Please enter up, down, left, or right.");
        }
        System.out.println("You moved to (" + positionX + ", " + positionY + ").");
    }

    @Override
    public int getPositionX() {
        return positionX;
    }

    @Override
    public int getPositionY() {
        return positionY;
    }
}

class GameTreasure implements Treasure {
    @Override
    public boolean isFound(int x, int y) {
        return false;
    }
}