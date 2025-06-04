package TotalManager;
import java.util.List;
import java.util.ArrayList;
public class Team {
    private String TeamName;
    private List<Player> squad; // - Liste anlegen

    public Team(String TeamName) { // - Konstruktor
        this.TeamName = TeamName;
        squad = new ArrayList<>(); // - Konstruktor für eine Liste
    }

    public String getTeamName() { // - Getter
        return TeamName;
    }

    public void setTeamName(String teamName) { // - Setter
        TeamName = teamName;
    }

    public void addPlayerinSquad(Player player) { // - Als Paramter Nutzen wir den Datentyp der Liste
        squad.add(player);
    }

    public void printSquad() { // - In den Klammern müssen keine Parameter eingegeben werden, da wir in der For Schleife damit arbeiten.
        for (Player p : squad) { // - Gehe jeden Player in der Liste squad durch und nenne ihn jeweils p.
            System.out.println(p);
        }
    }

    public void addPlayer(Player player) throws DuplicatePlayerException,PlayerTooYoungException,SquadLimitReachedException {
        if (squad.contains(player)) {
            throw new DuplicatePlayerException(player);

        } if(player.getAge() < 16){
            throw new PlayerTooYoungException(player);
        } if (squad.size() > 10){
            throw new SquadLimitReachedException();

        }
        squad.add(player);


    }
}
