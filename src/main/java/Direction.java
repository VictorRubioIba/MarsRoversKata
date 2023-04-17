

public class Direction {

    String direction;

    public Direction( String direction) {
        this.direction = direction;
    }

    public void changeDirection(String command){
        if(direction.equals(CardinalDirection.NORTH.getDirection())){
            northDirection(command);
        }else if(direction.equals(CardinalDirection.EAST.getDirection())){
            eastDirection(command);
        }else if(direction.equals(CardinalDirection.SOUTH.getDirection())){
            sourthDirection(command);
        }else if(direction.equals(CardinalDirection.WEST.getDirection())){
            westDirection(command);
        }
    }

    private void northDirection(String command) {
        if(command.equals(Command.TURNRIGHT.returnCommand())){
            direction=CardinalDirection.EAST.getDirection();
        }else if (command.equals(Command.TURNLEFT.returnCommand())){
            direction=CardinalDirection.WEST.getDirection();
        }
    }
    private void eastDirection(String command) {
        if(command.equals(Command.TURNRIGHT.returnCommand())){
            direction=CardinalDirection.SOUTH.getDirection();
        }else if (command.equals(Command.TURNLEFT.returnCommand())){
            direction=CardinalDirection.NORTH.getDirection();
        }
    }
    private void sourthDirection(String command) {
        if(command.equals(Command.TURNRIGHT.returnCommand())){
            direction=CardinalDirection.WEST.getDirection();
        }else if (command.equals(Command.TURNLEFT.returnCommand())){
            direction=CardinalDirection.EAST.getDirection();
        }
    }
    private void westDirection(String command) {
        if(command.equals(Command.TURNRIGHT.returnCommand())){
            direction=CardinalDirection.NORTH.getDirection();
        }else if (command.equals(Command.TURNLEFT.returnCommand())){
            direction=CardinalDirection.SOUTH.getDirection();
        }
    }

}
