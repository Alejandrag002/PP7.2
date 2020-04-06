public abstract class sports
{
    protected String sport;
    protected String ball;
    protected String team;
    protected String equipment;
    public sports(String sport, String ball, String team, String equipment)
    {
        this.sport = sport;
        this.ball = ball;
        this.team = team;
        this.equipment = equipment;
    }
    public String toString()
    {
        String output = "Sport: " + sport;
        output += "\nBall: " + ball;
        output += "\nTeam: " + team;
        output += "\nEquipment: " + equipment;
        return output;
    }
}
