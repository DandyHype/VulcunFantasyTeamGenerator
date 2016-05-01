import java.io.PrintStream;
import java.util.ArrayList;

/**
 * VulcunFantasyTeamGenerator
 * Created by ExcalibuR on 9/10/2015.
 */
public class Main {


    public static void main(String[] args){



        ArrayList<ProPlayer> playersArrayList = new PlayerManager().getPlayersArrayList();
        FantasyLoLTeamsGenerator lolTeamsGenerator = new FantasyLoLTeamsGenerator(10000, Action.COUNT);
        lolTeamsGenerator.generateTeams(playersArrayList);
        System.out.print(lolTeamsGenerator.teamsCounter);


    }
}


