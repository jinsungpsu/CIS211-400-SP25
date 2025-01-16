//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] teams = {"hi", "bye"};

        System.out.println(teams[0] + " " + teams[1]);
        for (String team : teams) {
            System.out.println(team);
        }

        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i]);
        }

        int[] nums = new int[5];

        Team eagles = new Team("Eagles", "Philly");
    }
}

class Team {
    private String name;
    private String city;
    private int numPlayers;
    private String[] players;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void signPlayer(String player) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}