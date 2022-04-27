package teams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeamTest {

    Team team1;

    @BeforeEach
    public void setUp(){
        team1 = new Team();
        team1.addPlayer(new PointGuard("Jimmy",2.09,400,400,"Speed " +
                "past Center",20));
        team1.addPlayer(new PointGuard("Johnny",2.19,4030,4000,"Speed " +
                "past power forward",20));
        team1.addPlayer(new PointGuard("Timmy",2.09,400,400,"Speed " +
                "past small forward",20));
    }

    @Test
    public void canAddPlayer(){
        assertThat(team1.bostonCeltics.size()).isEqualTo(3);
    }

    @Test
    public void canRemovePlayer(){
        team1.bostonCeltics.remove(1);
        assertThat(team1.bostonCeltics.size()).isEqualTo(2);
    }


}
