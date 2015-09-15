import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class FantasyTeamsGenerator {
    private int teamSalary;
    private int salaryUsed;
    private ArrayList<FantasyTeam> fantasyTeams = new ArrayList<>();
    protected ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];


    public FantasyTeamsGenerator() {
        setTeamSalary(10000);
        setSalaryUsed(0);
    }

    public FantasyTeamsGenerator(int teamSalary) {
        setTeamSalary(teamSalary);

    }

    public FantasyTeamsGenerator(int teamSalary, ArrayList players) {
        setTeamSalary(teamSalary);
        buildTeam(players);
    }

    public int getTeamSalary() {
        return teamSalary;
    }

    public int getSalaryUsed() {
        return salaryUsed;
    }

    public void setTeamSalary(int salary) {
        teamSalary = salary;
    }

    public void setSalaryUsed(int salary) {
        salaryUsed = salary;
    }

    public int salaryLeft() {
        return getTeamSalary() - getSalaryUsed();
    }

    public void addProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = player;
        setSalaryUsed(getSalaryUsed() + player.getSalary());
        player.getTeam().addToTeamCounter();

    }

    public void removeProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = null;
        setSalaryUsed(getSalaryUsed() - player.getSalary());
        player.getTeam().subtractFromTeamCounter();
    }

    public int getLength( ProPlayer[] array) {
        int counter = 0;

        for(ProPlayer player : array) {
            if( player != null)
                counter++;
        }

        return counter;
    }

    public void addTeam(ProPlayer[] team) {
        FantasyTeam fantasyTeam = new FantasyTeam(team , getTeamSalary(), getSalaryUsed());
        fantasyTeams.add(fantasyTeam);
    }


    public void buildTeam(ArrayList<ProPlayer> players){

        for(ProPlayer player: players) {
            int flexPick = getLength(fantasyTeam);
            int teamCounter = player.getTeam().getTeamCounter();

            if ((salaryLeft() >= player.getSalary()) && (teamCounter < 3)) {

                switch (flexPick) {
                    case 0:
                        addProPlayer(player, flexPick);
                        buildTeam(players);
                        removeProPlayer(player, flexPick );
                        break;

                    case 7:
                        if (player.getUniqueId() < fantasyTeam[flexPick - 1].getUniqueId()) {
                            addProPlayer(player, flexPick);
                            addTeam(fantasyTeam);
                            removeProPlayer(player, flexPick);
                        }
                        break;

                    default:
                        if(player.getUniqueId() < fantasyTeam[flexPick - 1].getUniqueId()) {
                            addProPlayer(player, flexPick);
                            buildTeam(players);
                            removeProPlayer(player, flexPick);
                        }
                        break;
                }
            }
        }
    }
    public void printTeams() {
        System.out.print(fantasyTeams.size());
        for(FantasyTeam fantasyTeam : fantasyTeams) {
            fantasyTeam.printTeam();
        }
    }

}
