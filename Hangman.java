import java.util.Scanner;
import java.util.Random;

/**
 *  Plays the game hangman with 6 randomly chosen letters.
 *
 *  @author Connor Khin
 *  @version 1/28/23
 */
public class Hangman extends Game {
    private String ans;
    private boolean[] guesses;
    private boolean[] correct;
    private char guess;

    public Hangman() {
        System.out.println("Enter lowercase letters to guess this string of length 6");
        ans = "";
        Random r = new Random();
        correct = new boolean[6];
        for(int i = 0; i < 6; i++) {
            char c =(char)(97 + r.nextInt(26));
            ans = ans + c;
            correct[i] = false;
        }
        guesses = new boolean[26];
        for(int i = 0; i < 26; i++) {
            guesses[i] = false;
        }
    }
    
    // @override
    public void input() {
        Scanner kb = new Scanner(System.in);
        boolean invalid = true;
        while(invalid) {
            System.out.println("Guess a lowercase letter.");
            String s = kb.nextLine();
            guess = s.charAt(0);
            if(guess < 97 || guess > 122) {
                System.out.println("This is not a lowercase letter.");
            }else if(guesses[guess - 97]) {
                System.out.println("You already guessed this letter.");
            }else {
                invalid = false;
            }
        } 
    }

    // @override
    public boolean playTurn() {
        boolean unfinished = false;
        for(int i = 0; i < 6; i++) {
            if(guess == ans.charAt(i)) {
                correct[i] = true;
            }
            if(!correct[i]) {
                unfinished = true;
            }
        } 
        guesses[guess - 97] = true;
        if(!unfinished) {
            System.out.printf("Congratulations, you found the string %s \n",ans);
        }
        return unfinished;
    }

    // @override
    public void output() {
        System.out.println("The string:");
        for(int i = 0; i < 6; i++) {
            if(correct[i]) {
                System.out.print(ans.charAt(i) + " ");
            }else {
                System.out.print("_ ");
            }
        }
        System.out.println("\nPrevious guesses: ");
        for(int i = 0; i < 26; i++) {
            if(guesses[i]) {
                char c =(char)(97 + i);
                System.out.print(c + " ");
            }
        }
    }
}
