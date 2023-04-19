public enum CardinalDirection {

    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String direction;

    CardinalDirection(String direction) {
        this.direction=direction;
    }

    public String getDirection(){
        return direction;
    }
}
