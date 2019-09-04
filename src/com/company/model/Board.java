package com.company.model;

public class Board {


    public static final int BOARD_WIDTH = 20;
    public static final int BOARD_HEIGHT = 20;
    private InvaderMovementHelper invaderMovementHelper;

    public Board(InvaderMovementHelper invaderMovementHelper){
        this.invaderMovementHelper = invaderMovementHelper;
    }

    // check if move is valid
    public boolean isMoveValid(Position position){
        if(position.getxPosition() < BOARD_WIDTH && position.getyPosition() < BOARD_HEIGHT)
            return true;
        return false;
    }



}
