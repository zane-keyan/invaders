package com.company.model;

public class Position {

    private int xPosition;
    private int yPosition;

    public Position(int xPosition , int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // getters and setters
    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
