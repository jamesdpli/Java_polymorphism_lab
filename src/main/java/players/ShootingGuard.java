package players;

public class ShootingGuard extends Player{

    private String shot;

    public ShootingGuard(String name, double height, int shotsTaken, int shotsMade, String shot){
        super(name,height,shotsTaken,shotsMade);
        this.shot = shot;
    }

    public String shoot(){
        return this.shot;
    }



}
