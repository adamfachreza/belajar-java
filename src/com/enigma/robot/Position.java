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

    public Position getRight(){
        return new Position(this.coordinateX+1, this.coordinateY);
    }    public Position getLeft(){
        return new Position(this.coordinateX-1,this.coordinateY);
    }    public Position getTop(){
        return new Position(this.coordinateX,this.coordinateY+1);
    }    public Position getBottom(){
        return new Position(this.coordinateX,this.coordinateY-1);
    }

    @Override
    public String toString() {
        return "Position{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
