import java.util.ArrayList;

/**
 * VulcunFantasyTeamGenerator
 * Created by ExcalibuR on 9/10/2015.
 */
public class FantasyTeamTest {

    public static void main(String[] args) {

        ArrayList<ProPlayer> proPlayers = new ArrayList<>();

        Team ahq = new Team("AHQ", "AHQ");
        Team bkt = new Team("BKT", "BKT");
        Team c9 = new Team("Cloud 9", "C9");
        Team clg = new Team("Counter Logic Gaming", "CLG");
        Team edg = new Team("Edward Gaming", "EDG");
        Team fnc = new Team("Fnatic", "FNC");
        Team fw = new Team("FW", "FW");
        Team h2k = new Team("H2K", "H2K");
        Team ig = new Team("IG", "IG");
        Team koo = new Team("KOO", "KOO");
        Team png = new Team("Pain Gaming", "pNG");
        Team skt = new Team("SK Telekom", "SKT");

        LoLPlayer ahq9Ziv = new LoLPlayer ("Ziv", ahq, Position.TOP, 1364);
        LoLPlayer ahqMountain = new LoLPlayer ("Mountain", ahq, Position.JUNGLE, 1272);
        LoLPlayer ahqWestdoor = new LoLPlayer ("Westdoor", ahq, Position.MID, 1521);
        LoLPlayer ahqAN = new LoLPlayer ("AN", ahq, Position.ADC, 1432);
        LoLPlayer ahqAlbis = new LoLPlayer ("Albis", ahq, Position.SUP, 1169);

        LoLPlayer bktWarLock = new LoLPlayer ("WarL0ck", bkt, Position.TOP, 1136);
        LoLPlayer bkt007x = new LoLPlayer ("007x", bkt, Position.JUNGLE, 1203);
        LoLPlayer bktG4 = new LoLPlayer ("G4", bkt, Position.MID, 1289);
        LoLPlayer bktLloyd = new LoLPlayer ("Lloyd", bkt, Position.ADC, 986);
        LoLPlayer bktMoss = new LoLPlayer ("Albis", bkt, Position.SUP, 904);

        LoLPlayer cl9Balls = new LoLPlayer ("Balls", c9, Position.TOP, 1247);
        LoLPlayer cl9Hai = new LoLPlayer ("Hai", c9, Position.JUNGLE, 1189);
        LoLPlayer cl9Incarnation = new LoLPlayer ("Incarnati0n", c9, Position.MID, 1322);
        LoLPlayer cl9Sneaky = new LoLPlayer ("Sneaky", c9, Position.ADC, 1198);
        LoLPlayer cl9Lemon = new LoLPlayer ("LemonNation", c9, Position.SUP, 997);

        LoLPlayer clgZion = new LoLPlayer("ZionSpartan", clg, Position.TOP, 1178);
        LoLPlayer clgXmithie = new LoLPlayer("Xmithie", clg, Position.JUNGLE, 1243);
        LoLPlayer clgPobelter = new LoLPlayer("Pobleter", clg, Position.MID, 1514);
        LoLPlayer clgDoublelift = new LoLPlayer("DoubleLift", clg, Position.ADC, 1403);
        LoLPlayer clgAphromoo = new LoLPlayer("AphroMoo", clg, Position.SUP, 1006);

        LoLPlayer edgKoro = new LoLPlayer("Koro1", edg, Position.TOP, 1320);
        LoLPlayer edgClearLove = new LoLPlayer("ClearLove", edg, Position.JUNGLE, 1278);
        LoLPlayer edgPawn = new LoLPlayer("PawN", edg, Position.MID, 1532);
        LoLPlayer edgDeft = new LoLPlayer("Deft", edg, Position.ADC, 1633);
        LoLPlayer edgMeiko = new LoLPlayer("Meiko", edg, Position.SUP, 1088);

        LoLPlayer fncHuni = new LoLPlayer("Huni", fnc, Position.TOP, 1278);
        LoLPlayer fncReignOver = new LoLPlayer("ReignOver", fnc, Position.JUNGLE, 1233);
        LoLPlayer fncFebiven = new LoLPlayer("Febiven", fnc, Position.MID, 1421);
        LoLPlayer fncRekkles = new LoLPlayer("Rekkles", fnc, Position.ADC, 1589);
        LoLPlayer fncYellowstar = new LoLPlayer("Yellowstar", fnc, Position.SUP, 1187);

        LoLPlayer fwSteak = new LoLPlayer("Steak", fw, Position.TOP, 1204);
        LoLPlayer fwKarsa = new LoLPlayer("Karsa", fw, Position.JUNGLE, 1071);
        LoLPlayer fwMaple = new LoLPlayer("Maple", fw, Position.MID, 1369);
        LoLPlayer fwNl = new LoLPlayer("NL", fw, Position.ADC, 1488);
        LoLPlayer fwSwordArt = new LoLPlayer("SwordArt", fw, Position.SUP, 984);

        LoLPlayer h2kOdoamne = new LoLPlayer("Odoamne", h2k, Position.TOP, 1244);
        LoLPlayer h2kloulex = new LoLPlayer("loulex", h2k, Position.JUNGLE, 1221);
        LoLPlayer h2kRyu = new LoLPlayer("Ryu", h2k, Position.MID, 1431);
        LoLPlayer h2kHjarnan = new LoLPlayer("Hjarnan", h2k, Position.ADC, 1289);
        LoLPlayer h2kKasing = new LoLPlayer("Kasing", h2k, Position.SUP, 977);

        LoLPlayer igZzitai = new LoLPlayer("Zzitai", ig, Position.TOP, 1198);
        LoLPlayer igKakao = new LoLPlayer("Kakao", ig, Position.JUNGLE, 1148);
        LoLPlayer igRookie = new LoLPlayer("Rookie", ig, Position.MID, 1301);
        LoLPlayer igKid = new LoLPlayer("Kid", ig, Position.ADC, 1437);
        LoLPlayer igKitties = new LoLPlayer("Kitties", ig, Position.SUP, 1067);

        LoLPlayer kooSmeb = new LoLPlayer("Smeb", koo, Position.TOP, 1241);
        LoLPlayer kooLee = new LoLPlayer("Lee", koo, Position.JUNGLE, 1321);
        LoLPlayer kooKuro = new LoLPlayer("Kuro", koo, Position.MID, 1584);
        LoLPlayer kooPray = new LoLPlayer("Pray", koo, Position.ADC, 1502);
        LoLPlayer kooGorilla = new LoLPlayer("Gorilla", koo, Position.SUP, 1254);

        LoLPlayer pngMylon = new LoLPlayer("Mylon", png, Position.TOP, 1136);
        LoLPlayer pngSirt = new LoLPlayer("Sirt", png, Position.JUNGLE, 1032);
        LoLPlayer pngKami = new LoLPlayer("Kami", png, Position.MID, 1204);
        LoLPlayer pngBrtt = new LoLPlayer("Brtt", png, Position.ADC, 989);
        LoLPlayer pngDioud = new LoLPlayer("Dioud", png, Position.SUP, 841);

        LoLPlayer sktMarin = new LoLPlayer("Marin", skt, Position.TOP, 1367);
        LoLPlayer sktBengi = new LoLPlayer("Bengi", skt, Position.JUNGLE, 1284);
        LoLPlayer sktFaker = new LoLPlayer("Faker", skt, Position.MID, 1738);
        LoLPlayer sktBang = new LoLPlayer("Bang", skt, Position.ADC, 1532);
        LoLPlayer sktWolf = new LoLPlayer("Wolf", skt, Position.SUP, 1203);





        proPlayers.add(ahq9Ziv);
        proPlayers.add(ahqMountain);
        proPlayers.add(ahqWestdoor);
        proPlayers.add(ahqAN);
        proPlayers.add(ahqAlbis);

        proPlayers.add(bktWarLock);
        proPlayers.add(bkt007x);
        proPlayers.add(bktG4);
        proPlayers.add(bktLloyd);
        proPlayers.add(bktMoss);

        proPlayers.add(cl9Balls);
        proPlayers.add(cl9Hai);
        proPlayers.add(cl9Incarnation);
        proPlayers.add(cl9Sneaky);
        proPlayers.add(cl9Lemon);

        proPlayers.add(clgZion);
        proPlayers.add(clgXmithie);
        proPlayers.add(clgPobelter);
        proPlayers.add(clgDoublelift);
        proPlayers.add(clgAphromoo);

        proPlayers.add(edgKoro);
        proPlayers.add(edgClearLove);
        proPlayers.add(edgPawn);
        proPlayers.add(edgDeft);
        proPlayers.add(edgMeiko);

        proPlayers.add(fncHuni);
        proPlayers.add(fncReignOver);
        proPlayers.add(fncFebiven);
        proPlayers.add(fncRekkles);
        proPlayers.add(fncYellowstar);

        proPlayers.add(fwSteak);
        proPlayers.add(fwKarsa);
        proPlayers.add(fwMaple);
        proPlayers.add(fwNl);
        proPlayers.add(fwSwordArt);

        proPlayers.add(h2kOdoamne);
        proPlayers.add(h2kloulex);
        proPlayers.add(h2kRyu);
        proPlayers.add(h2kHjarnan);
        proPlayers.add(h2kKasing);

        proPlayers.add(igZzitai);
        proPlayers.add(igKakao);
        proPlayers.add(igRookie);
        proPlayers.add(igKid);
        proPlayers.add(igKitties);

        proPlayers.add(kooSmeb);
        proPlayers.add(kooLee);
        proPlayers.add(kooKuro);
        proPlayers.add(kooPray);
        proPlayers.add(kooGorilla);

        proPlayers.add(pngMylon);
        proPlayers.add(pngSirt);
        proPlayers.add(pngKami);
        proPlayers.add(pngBrtt);
        proPlayers.add(pngDioud);

        proPlayers.add(sktMarin);
        proPlayers.add(sktBengi);
        proPlayers.add(sktFaker);
        proPlayers.add(sktBang);
        proPlayers.add(sktWolf);

        FantasyLoLTeamsGenerator generatedTeams = new FantasyLoLTeamsGenerator(8100, proPlayers);
        generatedTeams.printTeams();
    }
}


