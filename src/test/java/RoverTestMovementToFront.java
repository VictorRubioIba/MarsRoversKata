import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RoverTestMovementToFront {

    @Test
    @DisplayName("Test for check the position when the direction es north")
    public void testMovementToFrontWhenDirectionIsNorth(){
        Direction direction = new Direction(CardinalDirection.NORTH.getDirection());
        Rover rover = new Rover(2,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 2);
        assertEquals(rover.getPositionY(), 3);

    }
    @Test
    @DisplayName("Test for check the position when the direction es sourth")
    public void testMovementToFrontWhenDirectionIsSourth(){
        Direction direction = new Direction(CardinalDirection.NORTH.getDirection());
        Rover rover = new Rover(2,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 2);
        assertEquals(rover.getPositionY(), 1);

    }
    @Test
    @DisplayName("Test for check the position when the direction es east")
    public void testMovementToFrontWhenDirectionIsEast(){
        Direction direction = new Direction(CardinalDirection.EAST.getDirection());
        Rover rover = new Rover(2,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 3);
        assertEquals(rover.getPositionY(), 2);

    }
    @Test
    @DisplayName("Test for check the position when the direction es west")
    public void testMovementToFrontWhenDirectionIsWest(){
        Direction direction = new Direction(CardinalDirection.WEST.getDirection());
        Rover rover = new Rover(2,2,direction);
        rover.movementToFront();
        assertEquals(rover.getPositionX(), 1);
        assertEquals(rover.getPositionY(), 2);

    }
}
