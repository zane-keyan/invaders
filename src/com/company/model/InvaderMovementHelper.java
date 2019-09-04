package com.company.model;

public class InvaderMovementHelper {

    /*
    class responsible for controlling Invader movement , changing direction and move validation
     */
    private Board board;
    private Invader invader;

    public InvaderMovementHelper(Board board , Invader invader){
        this.board = board;
        this.invader = invader;
    }


}
