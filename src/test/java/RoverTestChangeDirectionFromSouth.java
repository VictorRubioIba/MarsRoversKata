import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTestChangeDirectionFromSouth {

    private String command0 = "M";
    private String command1 = "R";
    private String command2 = "L";

    Rover rover;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Starting unit test");
        Direction direction = new Direction(CardinalDirection.SOUTH.getDirection());
       this.rover  = new Rover(2,2,direction);
    }

    @Test
    @DisplayName("Test for check the change direction from South to West")
    public void testChangeDirectionFromSouthToWest(){

        rover.setDirection(command1);
        assertEquals(rover.getDirection(), CardinalDirection.WEST.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from South to East")
    public void testChangeDirectionFromsouthToEast(){

        rover.setDirection(command2);
        assertEquals(rover.getDirection(), CardinalDirection.EAST.getDirection());

    }
    @Test
    @DisplayName("Test for check the change direction from South to South")
    public void testChangeDirectionFromSouthToSouth(){

        rover.setDirection(command0);
        assertEquals(rover.getDirection(), CardinalDirection.SOUTH.getDirection());

    }
}
