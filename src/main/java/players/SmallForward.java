package players;

public class SmallForward extends Player{

    private String steal;

    public SmallForward(String name, double height){
        super(name,height);
    }

    public String stealBall(){
        return "steals the ball!";
    }

}
