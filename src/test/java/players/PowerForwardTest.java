package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PowerForward;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PowerForwardTest {

    PowerForward powerForward;

    @BeforeEach
    public void setUp(){
        powerForward = new PowerForward("Tim Duncan", 2.11);
    }

    @Test
    public void canGetName(){
        assertThat(powerForward.getName()).isEqualTo("Tim Duncan");
    }

    @Test
    public void canGetHeight(){
        assertThat(powerForward.getHeight()).isEqualTo(2.11);
    }

    @Test
    public void canPostUp(){
        assertThat(powerForward.postUp()).isEqualTo("does a post move!");
    }

}
