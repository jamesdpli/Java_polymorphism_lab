package players;

import popularityRatings.PopularityRating;

public class PointGuard extends Player{

    private PopularityRating popularityRating;
    private String superSpeed;


    public PointGuard(String name, double height, int shotsTaken, int shotsMade, String superSpeed){
        super(name,height,shotsTaken,shotsMade);
        this.superSpeed = superSpeed;
    }

    public String useSuperSpeed(){
        return this.superSpeed;
    }


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
