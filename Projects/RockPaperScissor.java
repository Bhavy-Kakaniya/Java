import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Game rules: \n 0 = rock,  1 = paper,  2 = scissor");
        Random random = new Random();
        int i = 0;
        int playerScore = 0, computerScore = 0;
        while (i <= 4) {
            int playerTurn;
            int computerTurn;
            System.out.println("\n" + name + "'s turn");
            playerTurn = sc.nextInt();
            computerTurn = random.nextInt(3);
            System.out.print(name + " choosed: ");
            if (playerTurn == 0) {
                System.out.println("rock");
            } else if (playerTurn == 1) {
                System.out.println("paper");
            } else if (playerTurn == 2) {
                System.out.println("scissor");
            }

            System.out.print("computer choosed: ");

            if (computerTurn == 0) {
                System.out.println("rock");
            } else if (computerTurn == 1) {
                System.out.println("paper");
            } else if (computerTurn == 2) {
                System.out.println("scissor");
            }

            if (playerTurn == 0 && computerTurn == 1) {
                computerScore++;
            } else if (playerTurn == 1 && computerTurn == 2) {
                computerScore++;
            } else if (playerTurn == 2 && computerTurn == 0) {
                computerScore++;
            } else if (playerTurn == 1 && computerTurn == 0) {
                playerScore++;
            } else if (playerTurn == 2 && computerTurn == 1) {
                playerScore++;
            } else if (playerTurn == 0 && computerTurn == 2) {
                playerScore++;
            } else if (playerTurn == computerTurn) {
                playerScore++;
                computerScore++;
            }
            System.out.println(name + " score = " + playerScore + "computer score = " + computerScore);
            i++;
        }
        if (computerScore > playerScore) {
            System.out.println("\ncomputer wins ! ");
        } else {
            System.out.println("\n" + name + " wins !");
        }
    }
}
