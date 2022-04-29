package players;

public class PowerForward extends Player {

    private String postMove;

    public PowerForward(String name, double height){
        super(name,height);
    }

    public String postUp(){
        return "does a post move!";
    }

}
