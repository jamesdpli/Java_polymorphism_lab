import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FanFavouritePointGuardTest {

    FanFavouritePointGuard fanFavouritePointGuard;

    @BeforeEach
    public void setUp(){
        fanFavouritePointGuard = new FanFavouritePointGuard();
        fanFavouritePointGuard.addPointGuard(new PointGuard("Allen Iverson",1.83,
                99,99));
        fanFavouritePointGuard.addPointGuard(new PointGuard("Chris Paul",1.83,
                90,88));
        fanFavouritePointGuard.addPointGuard(new PointGuard("James Dudhi-Price",1.85,
                1999,1999));
    }

    @Test
    public void canAddFanFavouritePointGuard(){
        assertThat(fanFavouritePointGuard.getPointGuards().size()).isEqualTo(3);
    }


}
