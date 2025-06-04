package TotalManager;

public class OutfieldPlayer extends Player{
    private int goalScored;
    private int stamina;
    private int sprintSpeed;

    public OutfieldPlayer(int goalScored, int stamina, int sprintSpeed, String name, int age, Position position){
        super(name,age,position);
        this.goalScored=goalScored;
        this.stamina=stamina;
        this.sprintSpeed=sprintSpeed;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public int getSprintSpeed() {
        return sprintSpeed;
    }

    public void setSprintSpeed(int sprintSpeed) {
        this.sprintSpeed = sprintSpeed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tore=" + goalScored +
                ", Stamina=" + stamina +
                ", Speed=" + sprintSpeed;
    }
    }

