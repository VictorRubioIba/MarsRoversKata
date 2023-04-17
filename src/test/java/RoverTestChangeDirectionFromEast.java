import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTestChangeDirectionFromEast {

    private String command0 = "M";
    private String command1 = "R";
    private String command2 = "L";

    Rover rover;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Starting unit test");
        Direction direction = new Direction(CardinalDirection.EAST.getDirection());
       this.rover  = new Rover(2,2,direction);
    }

    @Test
    @DisplayName("Test for check the change direction from East to South")
    public void testChangeDirectionFromEastToSouth(){

        rover.setDirection(command1);
        assertEquals(rover.getDirection(), CardinalDirection.SOUTH.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from East to North")
    public void testChangeDirectionFromEastToNorth(){

        rover.setDirection(command2);
        assertEquals(rover.getDirection(), CardinalDirection.NORTH.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from East to East")
    public void testChangeDirectionFromEastToEast(){

        rover.setDirection(command0);
        assertEquals(rover.getDirection(), CardinalDirection.EAST.getDirection());

    }
}
