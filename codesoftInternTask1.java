import java.util.*;

public class codesoftInternTask1 {
    //TASK 1 :-
    public static void findNum(int randomNumber) {
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }
    }
    public static void main(String args[]) {
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 101 (exclusive)
        int randomNumber = random.nextInt(101);
        System.out.println("The randomly generated number is : " + randomNumber);

        findNum(randomNumber);
    }
}
