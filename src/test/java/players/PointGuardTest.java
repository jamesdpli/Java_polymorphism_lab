package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

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

    @Test
    public void canPassBall(){
        assertThat(pointGuard.passBall()).isEqualTo("James is passing the ball");
    }

    @Test
    public void canPassBallAtGivenSpeed(){
        assertThat(pointGuard.passBall(200.5)).isEqualTo("James passed the ball at 200.5 miles per hour!");
    }



}