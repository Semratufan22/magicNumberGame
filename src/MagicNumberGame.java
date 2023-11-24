import java.util.Random;
import java.util.Scanner;

        public class MagicNumberGame {

            public static void main(String[] args) {

                // This is the standard pseudo-random number generator
                Random random = new Random();
                int magicNumber = random.nextInt(10) + 1; // Generates a random number between 1 and 10

                // The scanner is a standard functionality that can read from an input stream,
                //   in this case your terminal (console)
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to the Magic Number Game!");
                System.out.print("Guess the magic number between 1 and 10: ");

                // we can use the scanner to read 'typed' values from the input.
                int userGuess = scanner.nextInt();

                 scanner.close();
             }
        }