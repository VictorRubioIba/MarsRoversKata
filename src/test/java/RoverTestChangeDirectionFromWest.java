import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTestChangeDirectionFromWest {

    private String command0 = "M";
    private String command1 = "R";
    private String command2 = "L";

    Rover rover;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Starting unit test");
        Direction direction = new Direction(CardinalDirection.WEST.getDirection());
       this.rover  = new Rover(2,2,direction);
    }

    @Test
    @DisplayName("Test for check the change direction from West to North")
    public void testChangeDirectionFromWestToNorth(){

        rover.setDirection(command1);
        assertEquals(rover.getDirection(), CardinalDirection.NORTH.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from West to South")
    public void testChangeDirectionFromWestToSouth(){

        rover.setDirection(command2);
        assertEquals(rover.getDirection(), CardinalDirection.SOUTH.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from West to West")
    public void testChangeDirectionFromWestToWest(){

        rover.setDirection(command0);
        assertEquals(rover.getDirection(), CardinalDirection.WEST.getDirection());

    }
}
