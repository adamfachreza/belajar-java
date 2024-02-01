package com.enigma.robot;

public class Position {
    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Position getNextPosition(EnumPosition enumPosition) {
        return new Position(this.coordinateX + enumPosition.getX(), this.coordinateY + enumPosition.getY());
    }

    public Position getRight() {
        return getNextPosition(EnumPosition.RIGHT);
    }

    public Position getLeft() {
        return getNextPosition(EnumPosition.LEFT);
    }

    public Position getTop() {
        return getNextPosition(EnumPosition.TOP);
    }

    public Position getBottom() {
        return getNextPosition(EnumPosition.BOTTOM);
    }

    @Override
    public String toString() {
        return "Position{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
