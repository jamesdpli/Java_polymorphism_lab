package teams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setUp(){
        team = new Team();
        team.addPlayer(new PointGuard("Jimmy",2.09,400,400,"Speed " +
                "past Center"));
        team.addPlayer(new PointGuard("Johnny",2.19,4030,4000,"Speed " +
                "past power forward"));
        team.addPlayer(new PointGuard("Timmy",2.09,400,400,"Speed " +
                "past small forward"));
    }

    @Test
    public void canAddPlayer(){
        assertThat(team.players.size()).isEqualTo(3);
    }

    @Test
    public void canRemovePlayer(){
        team.players.remove(1);
        assertThat(team.players.size()).isEqualTo(2);
    }


}
