import java.util.Scanner;

public class SimpleRiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Try to solve the following riddle:");
        System.out.println("I speak without a mouth and hear without ears. I have nobody, but I come alive with wind. What am I?");

        while (true) {
            System.out.print("Your guess (or type 'quit' to exit): ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            } else if (guess.equals("echo")) {
                System.out.println("Correct! Well done.");
                break;
            } else {
                System.out.println("Incorrect. Try again!");
            }
        }

        scanner.close();
    }
}
