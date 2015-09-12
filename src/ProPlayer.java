/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class ProPlayer {

    private String nickName;
    private String team;
    private Position position;
    private int salary;

    //Constructors
    public ProPlayer( String nickName) {
        this( nickName, "N/A", Position.NA, 0);
    }
    public ProPlayer( String nickName, int salary) {
        this( nickName, "N/A", Position.NA, salary);
    }

    public ProPlayer( String nickName, String team, Position position, int salary) {

        setProPlayer(nickName, team, position, salary);
    }

    public ProPlayer( ProPlayer proPlayer) {

        this(proPlayer.getNickName(), proPlayer.getTeam(), proPlayer.getPosition(), proPlayer.getSalary());
    }

    public ProPlayer() {

        this( "N/A", "N/A", Position.NA, 0);
    }
    //End of Constructors

    //Setting up a ProPlayer
    public void setProPlayer( String nickName, String team, Position position, int salary ) {

        setNickName( nickName);
        setTeam( team );
        setPosition( position );
        setSalary(salary);
    }

    public void setNickName( String nickName ) {
        this.nickName = nickName;
    }

    public void setTeam( String team ){
        this.team = team;
    }

    public void setPosition( Position position ) {
        this.position = position;
    }

    public void setSalary( int salary) {
        this.salary = salary;
    }
    //End of setting up a ProPlayer

    //get Methods
    //
    public String getNickName() {
        return nickName;
    }

    public String getTeam() {
        return team;
    }

    public Position getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
    //End of get Methods
    //

    public String toString() {
        return String.format("\t%s\t %s\t %s\t = %d\t\n", getPosition(), getTeam(), getNickName(), getSalary());
    }
}
