import java.util.ArrayList;

/**
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeamTest {

    public static void main(String[] args) {

        ArrayList<ProPlayer> proPlayers = new ArrayList<>();


        ProPlayer tsmDyrus = new ProPlayer("Dyrus", "TSM", Position.TOP, 1390);
        ProPlayer tsmSantorin = new ProPlayer("Santorin", "TSM", Position.JUNGLE, 1220);
        ProPlayer tsmBjergsen = new ProPlayer("Bjergsen", "TSM", Position.MID, 1620);
        ProPlayer tsmWildurtle = new ProPlayer("WildTurtle", "TSM", Position.ADC, 1590);
        ProPlayer tsmLustboy = new ProPlayer("Lustboy", "TSM", Position.SUP, 1190);

        ProPlayer cl9Balls = new ProPlayer("Balls", "C9", Position.TOP, 1300);
        ProPlayer cl9Hai = new ProPlayer("Hai", "C9", Position.JUNGLE, 1270);
        ProPlayer cl9Incarnation = new ProPlayer("Incarnati0n", "C9", Position.MID, 1450);
        ProPlayer cl9Sneaky = new ProPlayer("Sneaky", "C9", Position.ADC, 1430);
        ProPlayer cl9Lemon = new ProPlayer("LemonNation", "C9", Position.SUP, 990);

        ProPlayer tlQuas = new ProPlayer("Quas", "TL", Position.TOP, 1370);
        ProPlayer tlIwd = new ProPlayer("IWillDominate", "TL", Position.JUNGLE, 1301);
        ProPlayer tlFenix = new ProPlayer("Fenix", "TL", Position.MID, 1500);
        ProPlayer tlPiglet = new ProPlayer("Piglet", "TL", Position.ADC, 1591);
        ProPlayer tlXspecial = new ProPlayer("XSpecial", "TL", Position.SUP, 1200);

        ProPlayer clgZion = new ProPlayer("ZionSpartan", "CLG", Position.TOP, 1210);
        ProPlayer clgXmithie = new ProPlayer("Xmithie", "CLG", Position.JUNGLE, 1010);
        ProPlayer clgPobelter = new ProPlayer("Pobleter", "CLG", Position.MID, 1400);
        ProPlayer clgDoublelift = new ProPlayer("DoubleLift", "CLG", Position.ADC, 1600);
        ProPlayer clgAphromoo = new ProPlayer("AphroMoo", "CLG", Position.SUP, 1201);


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

        FantasyTeam team = new FantasyTeam(9800, 0);

        team.buildTeam(proPlayers, Position.TOP);
    }
}


