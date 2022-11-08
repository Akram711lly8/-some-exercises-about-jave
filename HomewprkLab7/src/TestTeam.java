public class TestTeam {
    public static void main(String[] args) {
        Player dave = new Player("Dvae","GoalKeeper ", 24);
        Player jon = new Player("Joe","Striker ", 21);
        Player andy= new Player("Andy","Defender", 29);
        Team rovers= new Team("Rovers",5);
        rovers.addPlayer(dave);
        rovers .addPlayer(jon);
        rovers . addPlayer(andy);
        rovers.outputTeamDetails();


    }
}
