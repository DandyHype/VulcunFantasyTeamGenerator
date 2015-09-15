import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class FantasyLoLTeamsGenerator extends  FantasyTeamsGenerator{

    public FantasyLoLTeamsGenerator(ArrayList players) {
        buildTeam(players, Position.TOP);

    }

    public  FantasyLoLTeamsGenerator(int salary, ArrayList players) {
        super(salary);
        buildTeam(players, Position.TOP);
    }

    public void addProPlayer( ProPlayer player) {
        fantasyTeam[((LoLPlayer)player).getPosition().getArrayID()] = player;
        setSalaryUsed(getSalaryUsed() + player.getSalary());
        player.getTeam().addToTeamCounter();
    }

    public void removeProPlayer( ProPlayer player) {
        fantasyTeam[((LoLPlayer)player).getPosition().getArrayID()] = null;
        setSalaryUsed(getSalaryUsed() - player.getSalary());
        player.getTeam().subtractFromTeamCounter();
    }


    public void buildTeam(ArrayList<ProPlayer> players, Position position) {

        ArrayList <ProPlayer> remainingPlayers = new ArrayList<>();

        for(ProPlayer player: players) {

            int teamCounter = player.getTeam().getTeamCounter();

            if((((LoLPlayer)player).getPosition() == position) && (salaryLeft() >= player.getSalary()) && (teamCounter < 3)) {

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

    public void addFlexPicks(ArrayList<ProPlayer> players, ProPlayer[] fantasyTeam) {

        for(ProPlayer player : players) {

            int flexPick = getLength(fantasyTeam);
            int teamCounter = player.getTeam().getTeamCounter();

            if((salaryLeft() >= player.getSalary()) && (teamCounter < 3) && (fantasyTeam[((LoLPlayer)player).getPosition().getArrayID()].getUniqueId() > player.getUniqueId())) {




                switch (flexPick){

                    case 5:
                        addProPlayer(player, flexPick);
                        addFlexPicks(players, fantasyTeam);
                        removeProPlayer(player, flexPick );
                        break;
                    case 6:
                        if(player.getUniqueId() < fantasyTeam[flexPick - 1].getUniqueId()) {
                            addProPlayer(player, flexPick);
                            addFlexPicks(players, fantasyTeam);
                            removeProPlayer(player, flexPick);
                        }
                        break;

                    case 7:
                        if (player.getUniqueId() < fantasyTeam[flexPick - 1].getUniqueId()) {
                            addProPlayer(player, flexPick);
                            addTeam(fantasyTeam);
                            removeProPlayer(player, flexPick);
                        }
                        break;
                }
            }
        }
    }
}
