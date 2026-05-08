import java.util.Scanner;

public class RockPaperScissorsApp {
    // Method to get Computer Choice
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) return "Rock";
        if (rand == 1) return "Paper";
        return "Scissors";
    }

    // Method to determine winner
    public static String getWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.next();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);
            
            System.out.println("Computer chose: " + compChoice);
            System.out.println("Winner: " + winner);
            System.out.println("--------------------");
        }
    }
}