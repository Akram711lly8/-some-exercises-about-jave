public class Team {
    private Player[] thePlayer;
    private int numPlayer;
    private int maxPlayer;
    private String teamName;



    public Team(String name, int num)
    {
      teamName = name;
      maxPlayer = num;
      numPlayer = 0;
      thePlayer =new Player[maxPlayer];

    }
    public boolean addPlayer(Player newPlayer){
        if (numPlayer == maxPlayer){
            return false;
        }else {
            thePlayer[numPlayer]=newPlayer;
            numPlayer ++;
            return true;
        }

    }
    public void outputTeamDetails()
    {
        System.out.println("Team name :" + teamName );
        System.out.println("The player:");
        for (int i = 0; i<numPlayer ; i++)
        {
            System.out.println(thePlayer[i]);
        }
    }




}
