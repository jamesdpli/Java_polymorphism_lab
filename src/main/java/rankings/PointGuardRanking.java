package rankings;

import players.PointGuard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PointGuardRanking {

    List<PointGuard> pointGuards;

    public PointGuardRanking(){
        pointGuards = new LinkedList<>();
    }

    public void addPointGuard(PointGuard pointGuard){
        this.pointGuards.add(pointGuard);
    }

    public List<PointGuard> getPointGuards(){
        return this.pointGuards;
    }

}
