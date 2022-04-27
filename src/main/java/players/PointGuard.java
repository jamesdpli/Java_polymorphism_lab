package players;

import java.util.OptionalDouble;

public class PointGuard extends Player{

    private String superSpeed;
    private int age;

    public PointGuard(String name, double height, int shotsTaken,
                      int shotsMade, String superSpeed, int age){
        super(name,height,shotsTaken,shotsMade);
        this.superSpeed = superSpeed;
        this.age = age;
    }

    public String getSuperSpeed(){
        return this.superSpeed;
    }

    public double getShootingPercentage(){
        return ((this.getShotsMade() / this.getShotsMade()) * 100);
    }

    public double getAge(){
        return this.age;
    }

//  Use of method overloading ... intended for a retire feature
    public double growOlder(){
        return this.age = this.age + 1;
    }

    public double growOlder(int years){
        return this.age = this.age + years;
    }

//    public String getShootingPercentage(){
//        return Double.ToString(((this.getShotsMade() / this.getShotsMade()) * 100));
//    }

//    public String getCrossOver(){
//        this.crossOver = crossOver;
//        return this.crossOver;
//    }
//    public String passBall(){
//        pointGuard = new PointGuard("James",2.03,200,200);
//        return pointGuard.getName() + " is passing the ball";
//    }
//
//    public String passBall(double speed){
//        pointGuard = new PointGuard("James",2.03,200,200);
//        String speedAsAString = Double.toString(speed);
//        return pointGuard.getName() + " passed the ball at " + speedAsAString + " miles per hour!";
//    }
//    public String getPopularityRating(PopularityRating popularityRating){
//        PointGuard pointGuard = new PointGuard("James", 2.03, 200, 200);
//        if(popularityRating == popularityRating.HIGH){
//            return pointGuard.getName() + " is very popular";
//        } else if(popularityRating == popularityRating.MEDIUM){
//            return pointGuard.getName() + " is quite popular!";
//        } else if(popularityRating == popularityRating.LOW){
//            return pointGuard.getName() + " is not very popular";
//        } else {
//            return null;
//        }
//    }
}
