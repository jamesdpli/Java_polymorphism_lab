import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointGuardTest{

    PointGuard pointGuard;

    @BeforeEach
    public void setUp(){
        pointGuard = new PointGuard("Magic Johnson",2.06,800,800);
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
    public void canGetPlayersShotsTaken(){
        assertThat(pointGuard.getShotsTaken()).isEqualTo(800);
    }

    @Test
    public void canGetPlayersShotsMade(){
        assertThat(pointGuard.getShotsMade()).isEqualTo(800);
    }






}
