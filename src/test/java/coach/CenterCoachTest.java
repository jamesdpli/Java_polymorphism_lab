package coach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.Center;
import players.PointGuard;
import players.PowerForward;
import players.SmallForward;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CenterCoachTest {

    CenterCoach centerCoach;

    @BeforeEach
    public void setUp(){
        centerCoach = new CenterCoach("Doc Rivers", 60);
    }

    @Test
    public void canAddCenter(){
        Center center = new Center("J",2.0);
        centerCoach.addCenters(center);
        assertThat(centerCoach.centerCount()).isEqualTo(1);
    }

//  Essentially a remove method test
//  Method overloading
    @Test
    public void canCoach(){
        Center center = new Center("J",2.0);
        centerCoach.coach(center);
        assertThat(centerCoach.centerCount()).isEqualTo(0);
    }

    public void willNotCoachPG(){
        PointGuard pointGuard = new PointGuard("p",2.9);
        assertThat(centerCoach.coach(pointGuard)).isEqualTo("I cannot coach you, you are not a center.");
    }

    public void willNotCoachSG(){
        SmallForward smallForward= new SmallForward("p",2.9);
        assertThat(centerCoach.coach(smallForward)).isEqualTo("I cannot coach you, you are not a center.");
    }

    public void willNotCoachPF(){
        PowerForward powerForward = new PowerForward("p",2.9);
        assertThat(centerCoach.coach(powerForward)).isEqualTo("I cannot coach you, you are not a center.");
    }

    public void willNotCoachSF(){
        SmallForward smallForward = new SmallForward("p",2.9);
        assertThat(centerCoach.coach(smallForward)).isEqualTo("I cannot coach you, you are not a center.");
    }

}
