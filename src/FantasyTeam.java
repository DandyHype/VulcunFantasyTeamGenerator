/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeam {

    private int teamSalary;
    private int salaryUsed;
    public static int teamscounter = 0;


    private ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];


    //Start of Constructors
    public FantasyTeam(ProPlayer[] players, int teamSalary, int salaryUsed) {

        setTeamSalary(teamSalary);
        setSalaryUsed(salaryUsed);

        for(ProPlayer player: players) {
            addProPlayer(player,getLength(fantasyTeam));
        }
    }
    //End of Constructors

    //Start of Set methods
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
    //End of Get methods


    public int salaryLeft() {
        return getTeamSalary() - getSalaryUsed();
    }

    public void addProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = player;

    }

    public void removeProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = null;
        setSalaryUsed(getSalaryUsed() - player.getSalary());
    }

    public int getLength( ProPlayer[] array) {
        int counter = 0;

        for(ProPlayer player : array) {
            if(player != null)
                counter++;
        }

        return counter;
    }

    public void printTeam() {


        for(ProPlayer player : fantasyTeam) {
            System.out.print(player);
        }

        System.out.print("\n");
        teamscounter++;
        System.out.print("Team #" + teamscounter);
        System.out.print("\t Salary Used: " + getSalaryUsed());
        System.out.print("\t Salary left: " + salaryLeft());
        System.out.print("\n\n\n");


    }




}
