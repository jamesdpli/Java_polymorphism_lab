package players;

public class ShootingGuard extends Player{

    private String shot;

    public ShootingGuard(String name, double height){
        super(name,height);
    }

    public String shoot(){
        return "takes a shot!";
    }

}
