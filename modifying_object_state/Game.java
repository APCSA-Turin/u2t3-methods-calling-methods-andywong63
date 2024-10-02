package modifying_object_state;

public class Game {
    // Instance variables
    String gameName;
    int players;
    int score;

    // Constructor
    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        this.score = 0;
    }

    // Getters
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }


    // Add new player to game
    public void addPlayer() {
        players++;
    }

    // Increase the current total score
    public void increaseScore(int increase) {
        score += increase;
    }

    // Get average score per player
    public double averageScorePerPlayer() {
        return (double) score / players;
    }

    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }

    
    // New methods
    // Remove a player from game
    public void removePlayer() {
        players--;
    }
    // Add multiple players to game
    public void addPlayers(int players) {
        this.players += players;
    }
}