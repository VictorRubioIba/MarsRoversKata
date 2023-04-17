public enum Command {

    GOFRONT("M"),
    TURNLEFT("L"),
    TURNRIGHT("R");

    public String command;

    Command(String command) {
        this.command=command;
    }
    public String returnCommand(){
        return command;
    }
}
