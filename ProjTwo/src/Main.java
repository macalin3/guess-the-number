import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char anotherGame;
        Scanner sca = new Scanner(System.in);

        do {
            Main.guessNumber();
            System.out.println("Would you like to play again? (Y/N)");
            anotherGame = sca.nextLine().charAt(0);
        } while (anotherGame == 'y');
    }

    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Hello! What is your name?");
        String name = sc.next();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
        try {
            int guess;
            int randNum = rand.nextInt(20 - 1) + 1;
            int counter = 0;

            do {
                System.out.println("Take a guess.");
                guess = sc.nextInt();
                counter++;

                if (guess == randNum) {
                    System.out.println("Good job, " + name + "! You guessed my number!");
                    System.out.println("You guessed it in " + counter + " tries!");
                } else if (randNum < guess && guess > 20 ){
                    System.out.println("Please enter a number between 1 and 20.");
                } else if (randNum < guess) {
                    System.out.println("Your guess is too high.");
                } else if (randNum > guess) {
                    System.out.println("Your guess is too low.");
                }
            } while (guess != randNum && counter < 6);
        } catch (Exception e) {
            System.out.println("Caught Exception: Please enter valid integer.");
        }
    }

}