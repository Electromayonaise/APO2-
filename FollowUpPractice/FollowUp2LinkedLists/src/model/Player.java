package model;

import java.util.LinkedList;

public class Player{

    private int playerPosition;
    private int playerNum;

    public Player(int playerNum){
        this.playerNum=  playerNum;
        this.playerPosition = 0;
    }

    public int trowDice(){
        int dice = (int)(Math.random()*6)+1;
        return dice;
    }

    public void movePlayer(int dice){
        playerPosition += dice;
    }

    public int[] viewPlayerPos(){

    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public int getPlayerNum() {
        return playerNum;
    }


}