package rankings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointGuardRankingTest {

    PointGuardRanking pointGuards;

    @BeforeEach
    public void setUp(){
        pointGuards = new PointGuardRanking();
        pointGuards.addPointGuard(new PointGuard("Allen Iverson",1.83,
                99,99,"Allen is just too fast for the competition!"));
        pointGuards.addPointGuard(new PointGuard("Chris Paul",1.83,
                90,88,"is fast"));
        pointGuards.addPointGuard(new PointGuard("James Dudhi-Price",1.85,
                1999,1999,"is fast"));
    }

    @Test
    public void canGetPointGuardRanking(){
        assertThat(pointGuards.getPointGuards().size()).isEqualTo(3);
    }


}
