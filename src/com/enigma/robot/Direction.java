package com.enigma.robot;

public enum Direction {
    NORTH,EAST,SOUTH,WEST;

    public Direction turnRight(){
        return Direction.values()[(this.ordinal()+1%4)];
    }
    public Direction turnLeft(){
        return Direction.values()[this.ordinal()+3%4];
    }

    }
