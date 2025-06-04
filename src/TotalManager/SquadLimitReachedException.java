package TotalManager;


public class SquadLimitReachedException extends Exception{
    public SquadLimitReachedException(){
        super("You can only play with 11 Players on the Pitch");
    }
}
