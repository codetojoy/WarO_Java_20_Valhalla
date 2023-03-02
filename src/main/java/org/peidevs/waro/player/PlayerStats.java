package org.peidevs.waro.player;

public primitive class PlayerStats {
    private int total;
    private int numGamesWon; 
    private int numRoundsWon;

    public PlayerStats() {
        this(0, 0, 0);
    }
    
    public PlayerStats(int total, int numGamesWon, int numRoundsWon) {
        this.total = total;
        this.numGamesWon = numGamesWon;
        this.numRoundsWon = numRoundsWon;    
    }

    public int total() { return total; }
    public int numGamesWon() { return numGamesWon; }
    public int numRoundsWon() { return numRoundsWon; }

    public String toString() {
        return " total: " + total + " # games: " + numGamesWon + " # rounds: " + numRoundsWon;
    }
    
    public PlayerStats winsGame() {
        var newPlayerStats = new PlayerStats(this.total, this.numGamesWon + 1, this.numRoundsWon);
        return newPlayerStats;
    }

    public PlayerStats winsRound(int prizeCard) {
        var newPlayerStats = new PlayerStats(this.total + prizeCard, this.numGamesWon, this.numRoundsWon + 1);
        return newPlayerStats;
    }
    
    public PlayerStats reset() {
        var newPlayerStats = new PlayerStats(0, this.numGamesWon, 0);
        return newPlayerStats;
    }
}
