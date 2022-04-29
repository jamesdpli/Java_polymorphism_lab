package players;

public abstract class Player {

    private String name;
    private double height;

    public Player(String name, double height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public double getHeight(){
        return this.height;
    }

}
