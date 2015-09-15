/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class MobaPlayer extends ProPlayer{

    private int cs;

    public MobaPlayer(String nickName, Team team, int salary) {
        super(nickName, team, salary);
    }

    public MobaPlayer(MobaPlayer mobaPlayer) {
        super(mobaPlayer);
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getCs() {
        return cs;
    }

    public void calculatePoints(){
         setPoints(getKills()*2 - getDeaths() + getAssists()*1.6 + getCs()*0.01);
    }
}
