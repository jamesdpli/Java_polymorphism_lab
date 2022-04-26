package heights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import players.PointGuard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeightTest {

    PointGuard pointGuard;

    @BeforeEach
    public void setUp(){
        pointGuard = new PointGuard("Magic Johnson",2.06,
                800,800, "Magic Johnson is too fast for the competition!",20);
    }

    @Test
    public void canDetermineHeight(){

    }


}
