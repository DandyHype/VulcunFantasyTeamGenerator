/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class Team {

    private String teamName;
    private String teamAbbreviation;
    private int teamCounter;

    public Team(String name, String abbreviation) {
        createTeam(name, abbreviation);
    }

    public void createTeam(String name, String abbreviation) {
        setTeamName(name, abbreviation);
        teamCounter = 0;
    }

    public void setTeamName(String name, String abbreviation) {
        teamName = name;
        teamAbbreviation= abbreviation;
    }

    public void addToTeamCounter() {
        teamCounter++;
    }

    public void subtractFromTeamCounter() {
        teamCounter--;
    }

    public int getTeamCounter() {
        return teamCounter;
    }

    public void resetTeamCounter() {
        teamCounter = 0;
    }

    public String toString() {
        return teamAbbreviation;
    }
}
