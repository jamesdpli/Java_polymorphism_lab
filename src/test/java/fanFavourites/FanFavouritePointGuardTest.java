package fanFavourites;

import fanFavourites.FanFavouritePointGuard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FanFavouritePointGuardTest {

    FanFavouritePointGuard fanFavouritePointGuard;

    @BeforeEach
    public void setUp(){
        fanFavouritePointGuard = new FanFavouritePointGuard();
        fanFavouritePointGuard.addPointGuard(new PointGuard("Allen Iverson",1.83,
                99,99,"Allen is just too fast for the competition!"));
        fanFavouritePointGuard.addPointGuard(new PointGuard("Chris Paul",1.83,
                90,88,"is fast"));
        fanFavouritePointGuard.addPointGuard(new PointGuard("James Dudhi-Price",1.85,
                1999,1999,"is fast"));
    }

    @Test
    public void canAddFanFavouritePointGuard(){
        assertThat(fanFavouritePointGuard.getPointGuards().size()).isEqualTo(3);
    }


}
