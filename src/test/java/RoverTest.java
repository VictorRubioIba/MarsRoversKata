import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    public void testGeneralRoverPositionDirection(){
        Direction direction = new Direction(CardinalDirection.NORTH.getDirection());
        Rover rover = new Rover(2,2,direction);
        assertEquals(rover.getPositionX(), 2);
        assertEquals(rover.getPositionY(), 2);
        assertEquals(rover.getDirection(), CardinalDirection.NORTH.getDirection());
    }
}
