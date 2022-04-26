package players;

public class PointGuard extends Player{

    public PointGuard(String name, double height, int shotsTaken, int shotsMade){
        super(name,height,shotsTaken,shotsMade);
    }

    public String passBall(){
        return "James is passing the ball";
    }

    public String passBall(double speed){
        String speedAsAString = Double.toString(speed);
        return "James passed the ball at " + speedAsAString + " miles per hour!";
    }

}
