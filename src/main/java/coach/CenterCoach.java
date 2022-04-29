package coach;

import players.*;

import java.util.ArrayList;

public class CenterCoach {

    private String name;
    private int age;
    private ArrayList<Center> centers;

    public CenterCoach(String name, int age){
        this.age = age;
        this.name = name;
        this.centers =  new ArrayList<>();
    }

    public void addCenters(Center newCenter){
        this.centers.add(newCenter);
    }

    public int centerCount(){
        return this.centers.size();
    }

//  Method overloading
    public void coach(Center center){
//      When coach has coached a center it is removed from his list of centers
        this.centers.remove(center);
    }

    public String coach(SmallForward smallForward){
        return "I cannot coach you, you are a center.";
    }

    public String coach(PowerForward powerForward){
        return "I cannot coach you, you are a center.";
    }

    public String coach(ShootingGuard shootingGuard){
        return "I cannot coach you, you are a center.";
    }

    public String coach(PointGuard pointGuard){
        return "I cannot coach you, you are a center.";
    }

}
