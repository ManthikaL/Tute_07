public class Player {
    private String Name;
    private int Age;
    private String Type;
    private int Numberofwickets;
    private int Totalruns;
    private int Playerbestscore;
    private int Numberofmatches;
    private double Playeravarege;

    public Player(String Name, int Age, String Type, int Statistics, int Numberofwickets, int Totalruns, int Playerbestscore, int Numberofmatches, double Playeravarege)   //constructor
    {
        this.Name = Name;
        this.Age = Age;
        this.Type = Type;
        this.Numberofwickets = Numberofwickets;
        this.Totalruns = Totalruns;
        this.Playerbestscore = Playerbestscore;
        this.Numberofmatches = Numberofmatches;
        this.Playeravarege = Playeravarege;
    }
    void addPlayer(){
        //Adding new players

    }

    void palyerAvarege()
    {
        Playeravarege = Totalruns/Numberofmatches;
        System.out.println("Player Avatage: "+ Playeravarege);
    }

    void getpalyerDetails()
    {
        System.out.println("Player Name: "+ Name);
        System.out.println("Player Price: "+ Age);
        System.out.println("player Type: "+ Type);
    }

    void palyerBestPreformance()
    {
        System.out.println("Player Best Score: "+ +Playerbestscore);
        System.out.println("Player Highest Wickets: "+ Numberofwickets);
    }
}
