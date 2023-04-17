

public class ConsolePrint {

    private String commands ="";
    public void printMessageIntroduce(){
        System.out.println("You must introduce the command for mov the rovers");
    }
    public void printMessagePosition(int positionY, int positionX, String direction, String command){
        commands+=command;
        String position = "["+positionX + ":" + positionY + ":" + direction+"]";
        System.out.println("Position: "+position + " Commands: " + commands);


    }
}
