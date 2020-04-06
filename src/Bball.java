public class Bball extends sports
{
    private int highestScore;
    public Bball(String sport, String ball, String team, String equipment, int highestScore)
    {
        super(sport, ball, team, equipment);
        this.highestScore = highestScore;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nHighest Score: " + highestScore;
        return output;
    }
}
