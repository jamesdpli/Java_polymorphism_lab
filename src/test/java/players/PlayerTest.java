//Cannot test players.Player class as you cannot new up a player due to the players.Player class being abstract
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class PlayerTest {
//
//    private players.Player player;
//
//    @BeforeEach
//    public void setUp(){
//        player = new players.Player("Larry Bird",2.08,300,300);
//    }
//
//    @Test
//    public void playerHasName(){
//        assertThat(player.getName()).isEqualTo("Larry Bird");
//    }
//
//    @Test
//    public void playerHasHeight(){
//        assertThat(player.getHeight()).isEqualTo(2.08);
//    }
//
//    @Test
//    public void canGetPlayersShotsTaken(){
//        assertThat(player.getShotsTaken()).isEqualTo(300);
//    }
//
//    @Test
//    public void canGetPlayersSotsMade(){
//        assertThat(player.getShotsMade()).isEqualTo(300);
//    }
//
//
//
//}
