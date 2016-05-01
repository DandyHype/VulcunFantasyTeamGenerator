import java.util.ArrayList;

/**
 * VulcunFantasyTeamGenerator
 * Created by ExcalibuR on 9/14/2015.
 */
public class FantasyTeamsGenerator {
    private int teamSalary;
    private int salaryUsed;
    private ArrayList<FantasyTeam> fantasyTeams = new ArrayList<>();
    protected ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];
    private Action choice;
    public int teamsCounter = 0;


    //Start of Constructors
    public FantasyTeamsGenerator() {
        setTeamSalary(10000);
        setSalaryUsed(0);
        setChoice(Action.COUNT);
    }
    public FantasyTeamsGenerator(int teamSalary) {
        setTeamSalary(teamSalary);

    }
    public FantasyTeamsGenerator(int teamSalary, ArrayList players) {
        setTeamSalary(teamSalary);
        buildTeam(players);
    }
    public FantasyTeamsGenerator(int teamSalary, ArrayList players, Action choice) {
        setTeamSalary(teamSalary);
        setChoice(choice);
        buildTeam(players);

    }
    //End of Constructors

    //Start of Set methods
    public void setChoice(Action choice) {
        this.choice = choice;
    }
    public void setTeamSalary(int salary) {
        teamSalary = salary;
    }
    public void setSalaryUsed(int salary) {
        salaryUsed = salary;
    }
    //End of Set methods

    //Start of Get methods
    public int getTeamSalary() {
        return teamSalary;
    }
    public int getSalaryUsed() {
        return salaryUsed;
    }
    public Action getChoice() {
        return choice;
    }
    //End of Get methods




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

    public void actionChooser(Action choice, ProPlayer[] team){

        switch (choice) {
            case COUNT:
                teamsCounter++;

                break;
            case GENERATE:
                new FantasyTeam(team,getTeamSalary(), getSalaryUsed()).printTeam();
                break;
        }
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
                            actionChooser(getChoice(), fantasyTeam);
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
        for(FantasyTeam fantasyTeam : fantasyTeams) {
            fantasyTeam.printTeam();
        }
    }

}
