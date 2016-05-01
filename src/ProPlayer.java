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

    //Start of Constructors
    public ProPlayer( String nickName, Team team, int salary) {

        setProPlayer(nickName, team, salary);
    }
    public ProPlayer( ProPlayer proPlayer) {

        this(proPlayer.getNickName(), proPlayer.getTeam(), proPlayer.getSalary());
    }
    //End of Constructors

    //Start of Set methods
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
    //End of Set methods

    //Start of Get methods
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
    //End of Get methods

    //Abstract method that calculates a players points. Every ProPlayer subclass must implement calculatePoints();
    public abstract void calculatePoints();

    //The overridden toString method outputs a ProPlayer object as following
    //Team NickName Salary UniqueID
    public String toString() {
        return String.format("\t %-3s\t %-15s\t = %-4d\t %-2d\n", getTeam().toString(),
                getNickName(), getSalary(), getUniqueId());
    }
}
