package model;

public class GameController {
    
    public void createTable(int rows, int cols){
        Table table = new Table(rows, cols);
    }

    public int trowDice(int playerNum){
        Player player = new Player(playerNum);
        return player.trowDice();
    }

}
