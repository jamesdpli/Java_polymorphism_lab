package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PowerForward;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PowerForwardTest {

    PowerForward powerForward;

    @BeforeEach
    public void setUp(){
        powerForward = new PowerForward("Tim Duncan", 2.11,
                1000, 900,"No one can stop him, he has too much strength, " +
                "he scores in the post!");
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
    public void canGetPlayersShotsTaken(){
        assertThat(powerForward.getShotsTaken()).isEqualTo(1000);
    }

    @Test
    public void canGetPlayersShotsMade(){
        assertThat(powerForward.getShotsMade()).isEqualTo(900);
    }

    @Test
    public void canPostUp(){
        assertThat(powerForward.postUp()).isEqualTo("No one can stop him, he has too much strength," +
                " he scores in the post!");
    }

}
