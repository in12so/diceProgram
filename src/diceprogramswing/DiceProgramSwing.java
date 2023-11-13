package diceprogramswing;

public class DiceProgramSwing {

    public static void main(String[] args) {
        
        Dice.setNumberOfFaces(6);
        
        Player[] thePlayers = new Player[2];
        
        for (int i = 0; i < thePlayers.length; i++) {
            thePlayers[i] = new Player();
        }
            //
        thePlayers[0].setPlayerName("Magnus");
        thePlayers[1].setPlayerName("Freda");
        
        int counter = 0;
        do{
            System.out.println(thePlayers[0].getPlayerName() + " rolled a " + thePlayers[0].getPlayerDice(0).rollDice() + " and a " + thePlayers[0].getPlayerDice(1).rollDice());
            System.out.println(thePlayers[1].getPlayerName() + " rolled a " + thePlayers[1].getPlayerDice(0).rollDice() + " and a " + thePlayers[1].getPlayerDice(1).rollDice());
            if (thePlayers[0].getPlayerDice(0).getCurrentShownFace() == thePlayers[0].getPlayerDice(1).getCurrentShownFace()){
                thePlayers[0].setHasWon(true);
            } 
            
            if (thePlayers[1].getPlayerDice(0).getCurrentShownFace() == thePlayers[1].getPlayerDice(1).getCurrentShownFace()){
                thePlayers[1].setHasWon(true);
            }
            counter ++;
        } while ((thePlayers[0].getPlayerDice(0).getCurrentShownFace() != thePlayers[0].getPlayerDice(1).getCurrentShownFace()) 
                && (thePlayers[1].getPlayerDice(0).getCurrentShownFace() != thePlayers[1].getPlayerDice(1).getCurrentShownFace()));
        
        System.out.println("Match in " + counter + " attempts");
        
        if (thePlayers[0].isHasWon() && thePlayers[1].isHasWon())
            System.out.println("It was a draw!");
        else if (thePlayers[0].isHasWon())
            System.out.println(thePlayers[0].getPlayerName() + " has won!!");
        else if (thePlayers[1].isHasWon())
            System.out.println(thePlayers[1].getPlayerName() + " has won!!");
    }
    
}
