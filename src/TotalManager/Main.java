package TotalManager;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team TotalFC = new Team("Real Madrid");
        OutfieldPlayer rafa_silva= new OutfieldPlayer(10,88,
                89,"Rafa Silva",23,Position.STRIKER);
        Goalkeeper ter_steegen= new Goalkeeper(12,87,"Marc Andre TerSteegen",32,Position.GOALKEEPER);
        TotalFC.addPlayerinSquad(ter_steegen);
        TotalFC.addPlayerinSquad(rafa_silva);
        System.out.println(ter_steegen);
        System.out.println(rafa_silva);
        Player arda_gueler = new Player("Arda Gueler", 20, Position.MIDFIELDER);
        Player antonio_ruediger = new Player("Antonio Ruediger", 32, Position.DEFENDER);
        Player killian_mbappe = new Player("Killian Mbappe", 26, Position.STRIKER);
        Player luka_modric = new Player("Luka Modric", 38, Position.MIDFIELDER);
        Player thibaut_courtois = new Player("Thibaut Courtois", 31, Position.GOALKEEPER);
        Player vinicius_jr = new Player("Vinicius Jr", 23, Position.STRIKER);
        Player dani_carvajal = new Player("Dani Carvajal", 32, Position.DEFENDER);
        Player jude_bellingham = new Player("Jude Bellingham", 20, Position.MIDFIELDER);
        Player ferland_mendy = new Player("Ferland Mendy", 28, Position.DEFENDER);
        Player nacho_fernandez = new Player("Nacho Fernandez", 34, Position.DEFENDER);
        Player federico_valverde = new Player("Federico Valverde", 25, Position.MIDFIELDER);
        Player eduardo_camavinga = new Player("Eduardo Camavinga", 21, Position.MIDFIELDER);
        Player toni_kroos = new Player("Toni Kroos", 34, Position.MIDFIELDER); // wird der 11.
        Player ibrahim = new Player("Ibrahim", 14, Position.STRIKER); // absichtlich zu jung
        Player xabi = new Player("Xabi", 26, Position.DEFENDER); // wird der 12. → Exception
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(arda_gueler);
        allPlayers.add(antonio_ruediger);
        allPlayers.add(killian_mbappe);
        allPlayers.add(luka_modric);
        allPlayers.add(thibaut_courtois);
        allPlayers.add(vinicius_jr);
        allPlayers.add(dani_carvajal);
        allPlayers.add(jude_bellingham);
        allPlayers.add(ferland_mendy);
        allPlayers.add(nacho_fernandez);
        allPlayers.add(federico_valverde);
        allPlayers.add(eduardo_camavinga); // zu viel
        allPlayers.add(toni_kroos);        // zu viel
        allPlayers.add(ibrahim);           // zu jung
        allPlayers.add(xabi);              // zu viel


        for (Player p : allPlayers) {
            try {
                TotalFC.addPlayer(p);
            } catch (DuplicatePlayerException | PlayerTooYoungException |SquadLimitReachedException e) {
                System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            }
            System.out.println(p);

        }


    }
    };


