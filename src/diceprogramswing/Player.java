package diceprogramswing;

public class Player {
    
    private String playerName;
    private boolean hasWon;
    private Dice[] playerDice = new Dice[2];

    Player(){
        playerName = "";
        hasWon = false;
        
        for (int i = 0; i < playerDice.length; i++) {
           playerDice[i] = new Dice(); 
        }
        
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Dice getPlayerDice(int diceNumber) {
        return playerDice[diceNumber];
    }
    
}
