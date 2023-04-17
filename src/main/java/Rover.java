public class Rover {

    private int positionX;
    private int positionY;
    private Direction direct ;


    public Rover(int positionX, int positionY, Direction  direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direct= direction;
    }
    

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getDirection() {
        return direct.direction;
    }

    public void setDirection(String command) {
        direct.changeDirection(command);
    }

    public void movementToFront(){
        if (direct.direction.equals(CardinalDirection.NORTH.getDirection())) {
            moveToNorth();
        } if (direct.direction.equals(CardinalDirection.SOUTH.getDirection())) {
            moveToSouth();
        } else if (direct.direction.equals(CardinalDirection.WEST.getDirection())) {
            moveToWest();
        } else if (direct.direction.equals(CardinalDirection.EAST.getDirection())) {
            moveToEast();
        }
    }

    private void moveToEast() {
        positionX += 1;
        if (positionX == 10) {
            positionX = 0;
        }
    }

    private void moveToWest() {
        positionX -= 1;
        if (positionX == -1) {
            positionX = 9;
        }
    }

    private void moveToSouth() {
        positionY -= 1;
        if (positionY == -1) {
            positionY = 9;
        }
    }

    private void moveToNorth() {
        positionY += 1;
        if (positionY == 10) {
            positionY = 0;
        }
    }


}
