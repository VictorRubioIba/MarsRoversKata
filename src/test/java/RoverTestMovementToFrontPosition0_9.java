import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTestMovementToFrontPosition0_9 {
    @Test
    @DisplayName("Test for check the result when de position is 9 y direction is north")
    public void testMovementToFrontWhenDirectionIsNorth(){
        Direction direction = new Direction(CardinalDirection.NORTH.getDirection());
        Rover rover = new Rover(2,9,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 2);
        assertEquals(rover.getPositionY(), 0);

    }
    @Test
    @DisplayName("Test for check the result when de position is 0 y direction is sourth")
    public void testMovementToFrontWhenDirectionIsSourth(){
        Direction direction = new Direction(CardinalDirection.SOUTH.getDirection());
        Rover rover = new Rover(2,0,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 2);
        assertEquals(rover.getPositionY(), 9);

    }
    @Test
    @DisplayName("Test for check the result when de position is 9 y direction is east")
    public void testMovementToFrontWhenDirectionIsEast(){
        Direction direction = new Direction(CardinalDirection.EAST.getDirection());
        Rover rover = new Rover(9,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 0);
        assertEquals(rover.getPositionY(), 2);

    }
    @Test
    @DisplayName("Test for check the result when de position is 0 y direction is west")
    public void testMovementToFrontWhenDirectionIsWest(){
        Direction direction = new Direction(CardinalDirection.WEST.getDirection());
        Rover rover = new Rover(0,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 9);
        assertEquals(rover.getPositionY(), 2);

    }
}
