import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ExcalibuR on 9/14/2015.
 */
public class FantasyLoLTeamsGenerator extends  FantasyTeamsGenerator{


    //Start of Constructors
    public FantasyLoLTeamsGenerator() {
        setTeamSalary(10000);
        setSalaryUsed(0);
        setChoice(Action.COUNT);
    }
    public FantasyLoLTeamsGenerator(int teamSalary) {
        super(teamSalary);
        setChoice(Action.COUNT);
    }
    public FantasyLoLTeamsGenerator(int teamSalary, Action choice) {
        setTeamSalary(teamSalary);
        setChoice(choice);
    }
    //End of Constructors


    private  boolean isPlayerEligible(ProPlayer player, Position position) {
        if ((((LoLPlayer)player).getPosition() == position) && (salaryLeft() >= player.getSalary()) && (player.getTeam().getTeamCounter() < 3))
            return true;
        else return false;
    }

    private void addProPlayer( ProPlayer player) {
        fantasyTeam[((LoLPlayer)player).getPosition().getArrayID()] = player;
        setSalaryUsed(getSalaryUsed() + player.getSalary());
        player.getTeam().addToTeamCounter();
    }

    private void removeProPlayer( ProPlayer player) {
        fantasyTeam[((LoLPlayer)player).getPosition().getArrayID()] = null;
        setSalaryUsed(getSalaryUsed() - player.getSalary());
        player.getTeam().subtractFromTeamCounter();
    }




    //Build Fantasy teams
    public void generateTeams(ArrayList<ProPlayer> players){
        buildTeam(players, Position.TOP);
    }
    private void buildTeam(ArrayList<ProPlayer> players, Position position) {

        for(ProPlayer player: players) {

            if(isPlayerEligible(player, position)) {

                addProPlayer(player);

                if(position != Position.SUP) {
                    buildTeam(players, position.getNext());
                }

                else if (position == Position.SUP) {

                    ArrayList <ProPlayer> remainingPlayers = new ArrayList<>();

                    for(ProPlayer thePlayer : players) {
                        if(!Arrays.asList(fantasyTeam).contains(thePlayer))
                            remainingPlayers.add(thePlayer);
                    }

                    addFlexPicks(remainingPlayers, fantasyTeam);

                    remainingPlayers.clear();

                }


                removeProPlayer(player);

            }
        }


    }
    private void addFlexPicks(ArrayList<ProPlayer> players, ProPlayer[] fantasyTeam) {

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
                            actionChooser(getChoice(),fantasyTeam);
                            removeProPlayer(player, flexPick);
                        }
                        break;
                }
            }
        }
    }
    //End of build Fantasy teams
}
