package players;

public class PowerForward extends Player {

    private String postMove;

    public PowerForward(String name, double height, int shotsTaken, int shotsMade, String postMove){
        super(name,height,shotsTaken,shotsMade);
        this.postMove = postMove;
    }

    public String postUp(){
        return this.postMove;
    }

}
