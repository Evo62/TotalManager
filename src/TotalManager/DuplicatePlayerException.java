package TotalManager;

public class DuplicatePlayerException extends Exception{ // - Hier haben wir eine Ausnhame Klasse, die von Exception erbt
    public DuplicatePlayerException (Player player){
        super("Player:" + player.getName() +  "is in your Team");
    }
}
