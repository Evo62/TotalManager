package TotalManager;

public class PlayerTooYoungException extends Exception{
    public PlayerTooYoungException(Player player){
        super("The Player: "  + player.getName() + " is too young for the Main Team" );
    }
}
