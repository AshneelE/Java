import java.util.Scanner;
import java.util.Random;

public class MathChallengeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Math Challenge Game!");

        while (true) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 * num2;

            System.out.println("What is " + num1 + " * " + num2 + "?");
            System.out.print("Your answer (or type 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            try {
                int playerAnswer = Integer.parseInt(input);
                if (playerAnswer == correctAnswer) {
                    System.out.println("Correct! Great job.");
                } else {
                    System.out.println("Incorrect. The correct answer was: " + correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
