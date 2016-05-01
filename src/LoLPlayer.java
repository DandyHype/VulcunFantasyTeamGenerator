/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class LoLPlayer extends MobaPlayer{

    private Position position;

    //Start of Constructors
    public LoLPlayer(String nickName, Team team, Position position, int salary) {
        super(nickName, team, salary);
        setPosition(position);
    }
    //End of Constructors

    //Start of Set methods
    public void setPosition( Position position ) {
        this.position = position;
    }
    //End of Set methods

    //Start of Get methods
    public Position getPosition() {
        return position;
    }
    //End of Get methods

    //method toString is Overridden to output Position of the player
    @Override
    public String toString() {
        return String.format("\t%-6s%s", getPosition(), super.toString());
    }

}
