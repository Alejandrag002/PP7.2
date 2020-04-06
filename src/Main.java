public class Main
{
    public static void main(String[] args)
    {
        Bball Clippers = new Bball("Basketball", "basketball", "Cippers", "ball and hoop", 100);
        soccer Chivas = new soccer("Soccer", "soccer ball", "Chivas", "soccer ball and net", 31);
        tennis USA = new tennis("Tennis", "tennis ball", "USA", "tennis ball, racket, net", 1);

        System.out.println(Clippers);
        System.out.println("\n" + Chivas);
        System.out.println("\n" + USA);
    }
}
