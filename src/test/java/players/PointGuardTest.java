package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointGuardTest{

    PointGuard pointGuard;

    @BeforeEach
    public void setUp(){
        pointGuard = new PointGuard("Magic Johnson",2.06);

    }

    @Test
    public void canGetPlayersName(){
        assertThat(pointGuard.getName()).isEqualTo("Magic Johnson");
    }

    @Test
    public void canGetPlayersHeight(){
        assertThat(pointGuard.getHeight()).isEqualTo(2.06);
    }

    @Test
    public void canUseSuperSpeed(){
        assertThat(pointGuard.superSpeed()).isEqualTo("speeds up!");
    }

}
