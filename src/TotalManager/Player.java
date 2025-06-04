package TotalManager;

public class Player {
    private String name;
    private int age;

    private Position position;

    public Player (String name, int age, Position position){
        this.age = age;
        this.name = name;
        this.position= position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() { // - toString Methode
        return "Player (" +
                "Name = " + name + '\'' +
                ",Age = " + age +  '\'' +
                ",Position = " + position +
                ')';
    }


    }

