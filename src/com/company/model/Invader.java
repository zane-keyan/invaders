package com.company.model;

public class Invader {

    //declare fields
    private int hitPoints;
    private Position position;

    public Invader(int hitPoints , Position position){
        this.hitPoints = hitPoints;
        this.position = position;
    }

    // variables getters and setters
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
