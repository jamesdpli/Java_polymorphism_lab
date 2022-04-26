package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.Center;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CenterTest{

    Center center;

    @BeforeEach
    public void setUp(){
        center = new Center("Shaquille O'Neal",2.16,1000,1000,"Nothing " +
                "can get passed this center, he blocks every shot!" );
    }

    @Test
    public void canGetPlayersName(){
        assertThat(center.getName()).isEqualTo("Shaquille O'Neal");
    }

    @Test
    public void canGetPlayersHeight(){
        assertThat(center.getHeight()).isEqualTo(2.16);
    }

    @Test
    public void canGetPlayersShotsTaken(){
        assertThat(center.getShotsTaken()).isEqualTo(1000);
    }

    @Test
    public void canGetPlayersShotsMade(){
        assertThat(center.getShotsMade()).isEqualTo(1000);
    }

    @Test
    public void canBlock(){
        assertThat(center.getBlock()).isEqualTo("Nothing can get passed this center, he blocks every shot!");
    }

}



