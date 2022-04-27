package teams;

import players.Player;
import java.util.ArrayList;
import java.util.List;

public class Team {

    protected List<Player> bostonCeltics;

    public Team(){
        bostonCeltics = new ArrayList<>();
    }

    public void addPlayer(Player player){
        this.bostonCeltics.add(player);
    }

    public void removePlayer(Player player){
        this.bostonCeltics.remove(player);
    }

}
