/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class LoLPlayer extends MobaPlayer{

    private Position position;

    public LoLPlayer(String nickName, Team team, Position position, int salary) {
        super(nickName, team, salary);
        setPosition(position);
    }

    public void setPosition( Position position ) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format("\t%s\t %s\t %s\t = %d\t %d\n", getPosition(), getTeam().toString(), getNickName(), getSalary(), getUniqueId());
    }

}
