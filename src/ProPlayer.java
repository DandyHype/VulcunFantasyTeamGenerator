/**
 * Created by ExcalibuR on 9/10/2015.
 */
public abstract class ProPlayer {

    private String nickName;
    private Team team;
    private int salary;
    private int kills;
    private int deaths;
    private int assists;
    private double points;
    private static int id;
    private int uniqueId;

    //Constructors
    public ProPlayer( String nickName, Team team, int salary) {

        setProPlayer(nickName, team, salary);
    }

    public ProPlayer( ProPlayer proPlayer) {

        this(proPlayer.getNickName(), proPlayer.getTeam(), proPlayer.getSalary());
    }
    //End of Constructors


    public void setProPlayer( String nickName, Team team, int salary ) {

        setNickName( nickName);
        setTeam( team );
        setSalary(salary);
        setUniqueId();
    }

    public void setNickName( String nickName ) {
        this.nickName = nickName;
    }

    public void setTeam( Team team ){
        this.team = team;
    }

    public void setSalary( int salary) {
        this.salary = salary;
    }

    public void setUniqueId() {
        uniqueId = id;
        this.id++;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }



    public String getNickName() {
        return nickName;
    }

    public Team getTeam() {
        return team;
    }

    public int getSalary() {
        return salary;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public double getPoints() {
        return points;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }


    public abstract void calculatePoints();

    public String toString() {
        return String.format("\t %s\t %s\t = %d\t %d\n", getTeam().toString(), getNickName(), getSalary(), getUniqueId());
    }
}
