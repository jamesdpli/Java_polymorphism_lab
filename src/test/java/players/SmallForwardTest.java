package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.SmallForward;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SmallForwardTest{

    SmallForward smallForward;

    @BeforeEach
    public void setUp(){
        smallForward = new SmallForward("Lebron James",2.06);
    }

    @Test
    public void canGetPlayersName(){
        assertThat(smallForward.getName()).isEqualTo("Lebron James");
    }

    @Test
    public void canGetPlayersHeight(){
        assertThat(smallForward.getHeight()).isEqualTo(2.06);
    }

    @Test
    public void canGetStealBall(){
        assertThat(smallForward.stealBall()).isEqualTo("steals the ball!");
    }

}
