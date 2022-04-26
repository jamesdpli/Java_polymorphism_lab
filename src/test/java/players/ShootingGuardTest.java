package players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.ShootingGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShootingGuardTest{

    ShootingGuard shootingGuard;

    @BeforeEach
    public void setUp(){
        shootingGuard = new ShootingGuard("Stephen Curry",1.88,
                99999,99999,"He shoots he scores!!!!!");
    }

    @Test
    public void canGetPlayersName(){
        assertThat(shootingGuard.getName()).isEqualTo("Stephen Curry");
    }

    @Test
    public void canGetPlayersHeight(){
        assertThat(shootingGuard.getHeight()).isEqualTo(1.88);
    }

    @Test
    public void canGetPlayersShotsTaken(){
        assertThat(shootingGuard.getShotsTaken()).isEqualTo(99999);
    }

    @Test
    public void canGetPlayersShotsMade(){
        assertThat(shootingGuard.getShotsMade()).isEqualTo(99999);
    }

    @Test
    public void canShoot(){
        assertThat(shootingGuard.shoot()).isEqualTo("He shoots he scores!!!!!");
    }





}
