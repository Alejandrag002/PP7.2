public class tennis extends sports
{
    private int sOd;
    public tennis(String sport, String ball, String team, String equipment, int sOd)
    {
        super(sport, ball, team, equipment);
        this.sOd = sOd;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nNumber of Players: " + sOd;
        return output;
    }
}
