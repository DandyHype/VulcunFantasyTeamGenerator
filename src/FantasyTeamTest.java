import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeamTest {

    public static void main(String[] args) {

        ArrayList<ProPlayer> proPlayers = new ArrayList<>();

        Team tsm = new Team("Team Solo Mid", "TSM");
        Team c9 = new Team("Cloud 9", "C9");
        Team tl = new Team("Team Liquid", "TL");
        Team clg = new Team("Counter Logic Gaming", "CLG");


        LoLPlayer tsmDyrus = new LoLPlayer ("Dyrus", tsm, Position.TOP, 1390);
        LoLPlayer tsmSantorin = new LoLPlayer ("Santorin", tsm, Position.JUNGLE, 1220);
        LoLPlayer tsmBjergsen = new LoLPlayer ("Bjergsen", tsm, Position.MID, 1620);
        LoLPlayer tsmWildurtle = new LoLPlayer ("WildTurtle", tsm, Position.ADC, 1590);
        LoLPlayer tsmLustboy = new LoLPlayer ("Lustboy", tsm, Position.SUP, 1190);

        LoLPlayer cl9Balls = new LoLPlayer ("Balls", c9, Position.TOP, 1300);
        LoLPlayer cl9Hai = new LoLPlayer ("Hai", c9, Position.JUNGLE, 1270);
        LoLPlayer cl9Incarnation = new LoLPlayer ("Incarnati0n", c9, Position.MID, 1450);
        LoLPlayer cl9Sneaky = new LoLPlayer ("Sneaky", c9, Position.ADC, 1430);
        LoLPlayer cl9Lemon = new LoLPlayer ("LemonNation", c9, Position.SUP, 990);

        LoLPlayer tlQuas = new LoLPlayer("Quas", tl, Position.TOP, 1370);
        LoLPlayer tlIwd = new LoLPlayer("IWillDominate", tl, Position.JUNGLE, 1301);
        LoLPlayer tlFenix = new LoLPlayer("Fenix", tl, Position.MID, 1500);
        LoLPlayer tlPiglet = new LoLPlayer("Piglet", tl, Position.ADC, 1591);
        LoLPlayer tlXspecial = new LoLPlayer("XSpecial", tl, Position.SUP, 1200);

        LoLPlayer clgZion = new LoLPlayer("ZionSpartan", clg, Position.TOP, 1210);
        LoLPlayer clgXmithie = new LoLPlayer("Xmithie", clg, Position.JUNGLE, 1010);
        LoLPlayer clgPobelter = new LoLPlayer("Pobleter", clg, Position.MID, 1400);
        LoLPlayer clgDoublelift = new LoLPlayer("DoubleLift", clg, Position.ADC, 1600);
        LoLPlayer clgAphromoo = new LoLPlayer("AphroMoo", clg, Position.SUP, 1201);


        proPlayers.add(tsmDyrus);
        proPlayers.add(cl9Balls);
        proPlayers.add(tlQuas);
        proPlayers.add(clgZion);

        proPlayers.add(tsmSantorin);
        proPlayers.add(cl9Hai);
        proPlayers.add(tlIwd);
        proPlayers.add(clgXmithie);

        proPlayers.add(tsmBjergsen);
        proPlayers.add(cl9Incarnation);
        proPlayers.add(tlFenix);
        proPlayers.add(clgPobelter);

        proPlayers.add(tsmWildurtle);
        proPlayers.add(cl9Sneaky);
        proPlayers.add(tlPiglet);
        proPlayers.add(clgDoublelift);

        proPlayers.add(tsmLustboy);
        proPlayers.add(cl9Lemon);
        proPlayers.add(tlXspecial);
        proPlayers.add(clgAphromoo);

        //FantasyLoLTeamsGenerator generatedTeams = new FantasyLoLTeamsGenerator(9800, proPlayers);
        //generatedTeams.printTeams();

        FantasyTeamsGenerator generatedTeams = new FantasyTeamsGenerator(9700, proPlayers);
        generatedTeams.printTeams();
    }
}


