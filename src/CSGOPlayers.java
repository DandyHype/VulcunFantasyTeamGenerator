/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class CSGOPlayers extends ProPlayer {

    private int headshots;

    //Start of Constructors
    public CSGOPlayers(String nickName, Team team, int salary) {
        super(nickName, team, salary);
    }
    //End of Constructors

    //Start of Set methods
    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }
    //End of Set methods

    //Start of Get methods
    public int getHeadshots() {
        return headshots;
    }
    //End of Get methods

    //Implements method calculatePoints inherited from ProPlayer superclass
    public void calculatePoints(){
        setPoints(getKills()*2 - getDeaths() + getAssists()*1.6 + getHeadshots()*2.5);
    }


}
