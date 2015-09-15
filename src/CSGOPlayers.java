/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class CSGOPlayers extends ProPlayer {

    private int headshots;


    public CSGOPlayers(String nickName, Team team, int salary) {
        super(nickName, team, salary);
    }

    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }

    public int getHeadshots() {
        return headshots;
    }

    public void calculatePoints(){
        setPoints(getKills()*2 - getDeaths() + getAssists()*1.6 + getHeadshots()*2.5);
    }


}
