package players;

public class Center extends Player {

    private String block;

    public Center(String name, double height){
        super(name, height);
    }

    public String block(){
        return "blocks the ball!";
    }

}
