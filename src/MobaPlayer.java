/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class MobaPlayer extends ProPlayer{

    private int cs;

    //Start of Constructors
    public MobaPlayer(String nickName, Team team, int salary) {
        super(nickName, team, salary);
    }
    public MobaPlayer(MobaPlayer mobaPlayer) {
        super(mobaPlayer);
    }
    //End of Constructors

    //Start of Set methods
    public void setCs(int cs) {
        this.cs = cs;
    }
    //End of Set methods

    //Start of Get methods
    public int getCs() {
        return cs;
    }
    //End of Get methods

    //Implements method calculatePoints inherited from ProPlayer superclass
    public void calculatePoints(){
         setPoints(getKills()*2 - getDeaths() + getAssists()*1.6 + getCs()*0.01);
    }
}
