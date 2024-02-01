package com.enigma.robot;

public class Robot {
    private Position position;
    private Direction direction;

    public Robot(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public void move(String commandString){
        EnumCommand command = EnumCommand.valueOf(commandString);
        switch (command) {
            case A:
                forward();
                break;
            case L:
                direction = direction.turnLeft();
                break;
            case R:
                direction = direction.turnRight();
                break;
        }
    }

    private void forward(){
        if (this.direction == Direction.EAST) {
            position = position.getRight();
        }if(this.direction == Direction.NORTH){
            position = position.getTop();
        }if(this.direction == Direction.SOUTH){
            position = position.getBottom();
        }if(this.direction == Direction.WEST){
            position = position.getLeft();
        }
    }

    public void moves(String commands){
        String[] commandsArray = commands.split("");
        for (String command : commandsArray){
            move(command);
            System.out.println(this.toString());
        }
    }


    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
