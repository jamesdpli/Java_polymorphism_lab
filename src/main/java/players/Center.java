package players;

public class Center extends Player {

    private String block;

    public Center(String name, double height, int shotsTaken, int shotsMade, String block){
        super(name, height, shotsTaken, shotsMade);
        this.block = block;
    }

    public String getBlock(){
        return this.block;
    }


}
