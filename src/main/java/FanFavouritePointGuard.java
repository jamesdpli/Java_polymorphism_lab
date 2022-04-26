import java.util.ArrayList;
import java.util.List;

public class FanFavouritePointGuard {

    private List<PointGuard> fanFavouritePointGuards;

    public FanFavouritePointGuard(){
        fanFavouritePointGuards = new ArrayList<>();
    }

    public void addPointGuard(PointGuard pointGuard){
        this.fanFavouritePointGuards.add(pointGuard);
    }

    public List<PointGuard> getPointGuards(){
        return this.fanFavouritePointGuards;
    }

}
