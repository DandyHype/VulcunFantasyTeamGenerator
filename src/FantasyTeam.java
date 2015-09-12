import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeam {

    private int teamSalary;
    private int salaryUsed;


    private ProPlayer[] fantasyTeam = new ProPlayer[ 8 ];
    private int[] teamCounter = new int[10];





    public FantasyTeam(int teamSalary, int salaryUsed/*, ProPlayer... players*/) {

        setTeamSalary(teamSalary);
        setSalaryUSed(salaryUsed);

        /*for( ProPlayer proPlayer : players) {
            addProPlayer(proPlayer);
        }

        */


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
        updateTeamCounter(player.getTeam());
    }

    public void addProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = player;
        setSalaryUSed(getSalaryUsed() + player.getSalary());

    }

    public void updateTeamCounter(String team) {

        switch (team) {
            case "TSM":
        }


    }

    public void removeProPlayer( ProPlayer player) {
        fantasyTeam[player.getPosition().getArrayID()] = null;
        setSalaryUSed(getSalaryUsed() - player.getSalary());
    }

    public void removeProPlayer( ProPlayer player, int position) {
        fantasyTeam[position] = null;
        setSalaryUSed(getSalaryUsed() - player.getSalary());
    }

    public  int counter = 0;
    public void printTeam() {


        for(ProPlayer player : fantasyTeam) {
            System.out.print(player);
        }

        System.out.print("\n");
        counter++;
        System.out.print(counter);
        System.out.print("\t Salary used" + getSalaryUsed());
        System.out.print("\t Salary left" + salaryLeft());
        System.out.print("\n");


    }

    public void buildTeam(ArrayList<ProPlayer> players, Position position) {


        for(ProPlayer player: players) {

            if((player.getPosition() == position) && (salaryLeft() >= player.getSalary())) {

                addProPlayer(player);

                if(position != Position.SUP) {
                    buildTeam(players, position.getNext());
                }

                else if (position == Position.SUP) {



                    ArrayList <ProPlayer> remainingPlayers = new ArrayList<>();
                    for(ProPlayer eachPlayer : players) {
                        remainingPlayers.add(eachPlayer);
                    }

                    for (ProPlayer usedPlayer : fantasyTeam)
                        remainingPlayers.remove(usedPlayer);

                    addFlexPicks(remainingPlayers, fantasyTeam);
                    //printTeam();
                    //System.out.print(remainingPlayers);
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

            if(player.equals(fantasyTeam[player.getPosition().getArrayID()])) {
                continue;
            }

            if(salaryLeft() >= player.getSalary()) {

                if(getLength(fantasyTeam) == 5) {
                    addProPlayer(player, getLength(fantasyTeam));
                    addFlexPicks(players, fantasyTeam);
                    removeProPlayer(player, getLength(fantasyTeam) - 1 );
                }

                if(getLength(fantasyTeam) == 6) {
                    if(player.getSalary() < fantasyTeam[getLength(fantasyTeam) - 1].getSalary()) {
                        addProPlayer(player, getLength(fantasyTeam));
                        addFlexPicks(players, fantasyTeam);
                        removeProPlayer(player, getLength(fantasyTeam) - 1);
                    }
                }

                if(getLength(fantasyTeam) == 7) {
                    if (player.getSalary() < fantasyTeam[getLength(fantasyTeam) - 1 ].getSalary()) {
                        addProPlayer(player, getLength(fantasyTeam));
                        System.out.print(getLength(fantasyTeam));
                        printTeam();
                        removeProPlayer(player, getLength(fantasyTeam) - 1 );
                    }
                }




            }




        }



    }

}
