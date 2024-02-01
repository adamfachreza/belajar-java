package com.enigma.robot;

public enum EnumPosition {
    RIGHT(1, 0),
    LEFT(-1, 0),
    TOP(0, 1),
    BOTTOM(0, -1);
    private final int x;
    private final int y;

    EnumPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
