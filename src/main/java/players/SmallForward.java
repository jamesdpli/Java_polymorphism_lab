package players;

public class SmallForward extends Player{

    private String steal;

    public SmallForward(String name, double height, int shotsTaken, int shotsMade, String steal){
        super(name,height,shotsTaken,shotsMade);
        this.steal = steal;
    }

    public String getStealBall(){
        return this.steal;
    }



}
