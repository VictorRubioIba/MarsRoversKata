

public class MarsRoverApp {

    Rover rover= new Rover(0,0, new Direction(CardinalDirection.NORTH.getDirection()));

    public void  execute(String command) {

        for (int i=0; i<command.length();i++) {
                if (command.charAt(i) == Command.GOFRONT.returnCommand().charAt(0)) {
                    rover.movementToFront();
                } else {
                    rover.setDirection(String.valueOf(command.charAt(i)));
                }
            }

       new ConsolePrint().printMessagePosition(rover.getPositionY(),rover.getPositionX(), rover.getDirection(), command);

    }


}
