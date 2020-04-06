public class soccer extends sports
{
    private int numOfP;
    public soccer(String sport, String ball, String team, String equipment, int numOfP)
    {
        super(sport, ball, team, equipment);
        this.numOfP = numOfP;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nNumber of Players: " + numOfP;
        return output;
    }
}
