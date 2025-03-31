import java.util.Scanner;
import java.util.Random;

public class ReactionTimeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Reaction Time Game!");
        System.out.println("When you see 'GO!', type anything as fast as you can!");
        System.out.println("Press ENTER to start.");
        scanner.nextLine();

        try {
            Thread.sleep(random.nextInt(4000) + 2000); // Wait 2-6 seconds randomly
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("GO!");
        long startTime = System.currentTimeMillis();
        scanner.nextLine();
        long endTime = System.currentTimeMillis();

        System.out.println("Your reaction time: " + (endTime - startTime) + " milliseconds!");
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}

