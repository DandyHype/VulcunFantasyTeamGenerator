import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeam {

    private int teamSalary;
    private int salaryUsed;


    private ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];




    public FantasyTeam(int teamSalary, int salaryUsed) {

        setTeamSalary(teamSalary);
        setSalaryUSed(salaryUsed);
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

    public void setSalaryUSed(int salary) {
        salaryUsed = salary;
    }

    public int salaryLeft() {
        return getTeamSalary() - getSalaryUsed();
    }

    public void addProPlayer( ProPlayer player) {
        fantasyTeam[player.getPosition().getArrayID()] = player;
        setSalaryUSed(getSalaryUsed() + player.getSalary());
        player.getTeam().addToTeamCounter();
    }

    public void addProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = player;
        setSalaryUSed(getSalaryUsed() + player.getSalary());
        player.getTeam().addToTeamCounter();

    }



    public void removeProPlayer( ProPlayer player) {
        fantasyTeam[player.getPosition().getArrayID()] = null;
        setSalaryUSed(getSalaryUsed() - player.getSalary());
        player.getTeam().subtractFromTeamCounter();
    }

    public void removeProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = null;
        setSalaryUSed(getSalaryUsed() - player.getSalary());
        player.getTeam().subtractFromTeamCounter();
    }

    public  int counter = 0;
    public void printTeam() {


        for(ProPlayer player : fantasyTeam) {
            System.out.print(player);
        }

        System.out.print("\n");
        counter++;
        System.out.print("Team #" + counter);
        System.out.print("\t Salary used: " + getSalaryUsed());
        System.out.print("\t Salary left: " + salaryLeft());
        System.out.print("\n\n\n");


    }

    public void buildTeam(ArrayList<ProPlayer> players, Position position) {

        ArrayList <ProPlayer> remainingPlayers = new ArrayList<>();

        for(ProPlayer player: players) {

            int teamCounter = player.getTeam().getTeamCounter();

            if((player.getPosition() == position) && (salaryLeft() >= player.getSalary()) && (teamCounter < 3)) {

                addProPlayer(player);

                if(position != Position.SUP) {
                    buildTeam(players, position.getNext());
                }

                else if (position == Position.SUP) {

                    for(ProPlayer eachPlayer : players) {
                        remainingPlayers.add(eachPlayer);
                    }

                    for (ProPlayer usedPlayer : fantasyTeam)
                        remainingPlayers.remove(usedPlayer);

                    addFlexPicks(remainingPlayers, fantasyTeam);
                    remainingPlayers.clear();

                }


                removeProPlayer(player);

            }
        }


    }

    public int getLength( ProPlayer[] array) {
        int counter = 0;

        for(ProPlayer player : array) {
            if( player != null)
                counter++;
        }

        return counter;
    }

    public void addFlexPicks(ArrayList<ProPlayer> players, ProPlayer[] fantasyTeam) {

        for(ProPlayer player : players) {


            int flexPick = getLength(fantasyTeam);
            int teamCounter = player.getTeam().getTeamCounter();

            if((salaryLeft() >= player.getSalary()) && (teamCounter < 3) && (fantasyTeam[player.getPosition().getArrayID()].getSalary() > player.getSalary())) {

                if(flexPick == 5) {
                    addProPlayer(player, flexPick);
                    addFlexPicks(players, fantasyTeam);
                    removeProPlayer(player, flexPick );
                }

                if( flexPick == 6 ) {
                    if(player.getSalary() < fantasyTeam[flexPick - 1].getSalary()) {
                        addProPlayer(player, flexPick);
                        addFlexPicks(players, fantasyTeam);
                        removeProPlayer(player, flexPick);
                    }
                }

                if(flexPick == 7) {
                    if (player.getSalary() < fantasyTeam[flexPick - 1 ].getSalary()) {
                        addProPlayer(player, flexPick);
                        printTeam();
                        removeProPlayer(player, flexPick );
                    }
                }




            }




        }



    }

}
