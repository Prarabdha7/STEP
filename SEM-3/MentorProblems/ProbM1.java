import java.util.Random;
import java.util.Scanner;
public class ProbM1 {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove))
            return "Draw";
        else if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                 (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                 (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")))
            return "Player Wins";
        else
            return "Computer Wins";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] player = new String[5];
        String[] computer = new String[5];
        String[] result = new String[5];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter move for Round " + (i + 1) + ": ");
            player[i] = sc.nextLine();
            computer[i] = moves[r.nextInt(3)];
            result[i] = playRound(player[i], computer[i]);
            if (result[i].equals("Player Wins"))
                wins++;
            else if (result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
            System.out.println(result[i]);
        }
        System.out.println("\nRound\tPlayer\tComputer\tResult");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + player[i] + "\t" + computer[i] + "\t\t" + result[i]);
        }
        double winPercentage = wins * 100.0 / 5;
        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win %%: %.1f%%", winPercentage);
        sc.close();
    }
}