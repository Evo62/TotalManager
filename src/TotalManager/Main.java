package TotalManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Team initialisieren
        Team TotalFC = new Team("Total FC");

        // Spezialspieler (Goalkeeper & OutfieldPlayer)
        OutfieldPlayer rafa_silva = new OutfieldPlayer(10, 88, 89, "Rafa Silva", 23, Position.STRIKER);
        Goalkeeper ter_steegen = new Goalkeeper(12, 87, "Marc Andre Ter Steegen", 32, Position.GOALKEEPER);

        TotalFC.addPlayerinSquad(ter_steegen);
        TotalFC.addPlayerinSquad(rafa_silva);

        // Standard-Spieler
        Player arda_gueler         = new Player("Arda Gueler", 20, Position.MIDFIELDER);
        Player antonio_ruediger    = new Player("Antonio Ruediger", 32, Position.DEFENDER);
        Player killian_mbappe      = new Player("Killian Mbappe", 26, Position.STRIKER);
        Player luka_modric         = new Player("Luka Modric", 38, Position.MIDFIELDER);
        Player thibaut_courtois    = new Player("Thibaut Courtois", 31, Position.GOALKEEPER);
        Player vinicius_jr         = new Player("Vinicius Jr", 23, Position.STRIKER);
        Player dani_carvajal       = new Player("Dani Carvajal", 32, Position.DEFENDER);
        Player jude_bellingham     = new Player("Jude Bellingham", 20, Position.MIDFIELDER);
        Player ferland_mendy       = new Player("Ferland Mendy", 28, Position.DEFENDER);
        Player nacho_fernandez     = new Player("Nacho Fernandez", 34, Position.DEFENDER);
        Player federico_valverde   = new Player("Federico Valverde", 25, Position.MIDFIELDER);
        Player eduardo_camavinga   = new Player("Eduardo Camavinga", 21, Position.MIDFIELDER);
        Player toni_kroos          = new Player("Toni Kroos", 34, Position.MIDFIELDER); // wird der 11.
        Player ibrahim             = new Player("Ibrahim", 14, Position.STRIKER);        // zu jung
        Player xabi                = new Player("Xabi", 26, Position.DEFENDER);          // zu viel

        // Spieler zur Liste hinzufügen
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(rafa_silva);
        allPlayers.add(ter_steegen);
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
        allPlayers.add(eduardo_camavinga);
        allPlayers.add(toni_kroos);
        allPlayers.add(ibrahim);
        allPlayers.add(xabi);

        Map<Position, Integer> positionCounter = new HashMap<>();

        for (Player p : allPlayers) {
            Position pos = p.getPosition();  // Spielerposition holen

            if (!positionCounter.containsKey(pos)) {
                positionCounter.put(pos, 1);  // Erster Spieler dieser Position
            } else {
                positionCounter.put(pos, positionCounter.get(pos) + 1);  // +1 zählen
            }
        }
        //Positionsausgabe durch eine Map
        System.out.println("\n\033[1;34m--- 📊 Position-Übersicht --- \033[0m");
        for (Map.Entry<Position, Integer> entry : positionCounter.entrySet()) {
            System.out.println("🔹 " + entry.getKey() + ": " + entry.getValue());
        }


        //Polymorphe Ausgabe
        System.out.println("\n\033[1;34m--- Spielerübersicht (mit Spezialwerten) ---\033[0m");
        for (Player p : allPlayers) {
            System.out.println("👤 " + p);
            if (p instanceof Goalkeeper) {
                System.out.println("   🧤 Clean Sheets: " + ((Goalkeeper) p).getCleanSheets());
            } else if (p instanceof OutfieldPlayer) {
                System.out.println("   ⚽ Goals: " + ((OutfieldPlayer) p).getGoalScored());
            }
        }

        //Spieler dem Team hinzufügen (mit Exceptions)
        System.out.println("\n\033[1;33m--- Spieler werden dem Team hinzugefügt ---\033[0m");
        for (Player p : allPlayers) {
            try {
                TotalFC.addPlayer(p);
                System.out.println("\033[32m✔ Spieler hinzugefügt: " + p.getName() + "\033[0m");
            } catch (DuplicatePlayerException | PlayerTooYoungException | SquadLimitReachedException e) {
                System.out.println("\033[31m✘ Fehler: " + e.getMessage() + "\033[0m");
            }
        }

        // Finale Teamübersicht
        System.out.println("\n\033[1;36m--- Finale Teamaufstellung ---\033[0m");
        TotalFC.printSquad();
    }
}

