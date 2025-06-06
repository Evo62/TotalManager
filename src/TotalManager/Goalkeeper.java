package TotalManager;

import java.util.jar.Attributes;

public class Goalkeeper extends Player {
    private int cleanSheets;
    private int reflexRaiting;
    Position position;

    public Goalkeeper( int cleanSheets, int reflexRaiting, String name, int age, Position position){
        super(name, age, position);
        this.cleanSheets=cleanSheets;
        this.reflexRaiting=reflexRaiting;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public int getReflexRaiting() {
        return reflexRaiting;
    }

    public void setReflexRaiting(int reflexRaiting) {
        this.reflexRaiting = reflexRaiting;
    }

    @Override
    public String toString() {
        return super.toString() + " | 🧤 Goalkeeper Stats: CleanSheets=" + cleanSheets + ", Reflex=" + reflexRaiting;
    }

}



