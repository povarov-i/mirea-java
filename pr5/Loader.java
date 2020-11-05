public class Loader {
    public static void main(String[] args) {
        Team team1 = new Team("BLUE");
        Team team2 = new Team("RED");

        new MyForm(team1, team2);
    }
}
