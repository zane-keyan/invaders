package com.company.model;

public enum Direction {

    // init fields
    NORTH,
    EAST,
    SOUTH,
    WEST;

    // direction values
    private static Direction[] direction_values = values();

    // get next direction to the right of current direction
    public Direction turnRight(){
        return direction_values[(ordinal()+1) % direction_values.length];
    }

    // get next direction to the left of current direction
    public Direction turnLeft(){
        return ordinal()== 0 ? direction_values[3] :direction_values[(ordinal()-1) % direction_values.length];
    }
}
