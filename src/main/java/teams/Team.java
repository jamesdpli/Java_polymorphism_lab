package teams;

import players.Player;
import java.util.ArrayList;
import java.util.List;

public class Team {

    protected List<Player> players;

    public Team(){
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

}
