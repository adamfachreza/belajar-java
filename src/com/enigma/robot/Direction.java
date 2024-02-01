package com.enigma.robot;

public enum Direction {
    NORTH,EAST,SOUTH,WEST;

    // ordinal urutan index di enum [NORT =0 ,EAST = 1,SOUTH = 2,WEST = 3]
    public Direction turnRight(){
        return Direction.values()[(this.ordinal()+1)%4];

    }
    public Direction turnLeft(){
        return Direction.values()[(this.ordinal()+3)%4];
    }

    }
