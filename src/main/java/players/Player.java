package players;

public abstract class Player {

    private String name;
    private double height;
    private int shotsTaken;
    private int shotsMade;

    private Player player;

    public Player(String name, double height, int shotsTaken, int shotsMade){
        this.name = name;
        this.height = height;
        this.shotsTaken = shotsTaken;
        this.shotsMade = shotsMade;
    }

    public String getName(){
        return this.name;
    }

    public double getHeight(){
        return this.height;
    }

    public int getShotsTaken(){
        return this.shotsTaken;
    }

    public int getShotsMade(){
        return this.shotsMade;
    }

//    public String passBall(){
//        return player.getName() + "passed the ball!" ;
//    }
//
//    public String passBall(double speed){
//        String speedAsAString = Double.toString(speed);
//        return player.getName() + " passed the ball at " + Double.toString(speed) + " miles per hour!";
//    }




}
