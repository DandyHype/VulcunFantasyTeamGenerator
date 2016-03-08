import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeam {

    private int teamSalary;
    private int salaryUsed;


    private ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];




    public FantasyTeam(ProPlayer[] players, int teamSalary, int salaryUsed) {

        setTeamSalary(teamSalary);
        setSalaryUsed(salaryUsed);

        for(ProPlayer player: players) {
            addProPlayer(player,getLength(fantasyTeam));
        }
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

    public static int counter = 0;

    public void printTeam() {


        for(ProPlayer player : fantasyTeam) {
            System.out.print(player);
        }

        System.out.print("\n");
        counter++;
        System.out.print("Team #" + counter);
        System.out.print("\t Salary Used: " + getSalaryUsed());
        System.out.print("\t Salary left: " + salaryLeft());
        System.out.print("\n\n\n");


    }



}
