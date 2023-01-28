/**
 *  Does something
 *  @author Connor Khin
 *  @version 1/27/23
 */
import java.util.Scanner
public class Demo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in)
        String response;
        char c;
        boolean invalidAns = true;

        do{
            System.out.println("Would you like to play a game? (y/n)");
            reponse = kb.nextLine();
            c = response.charAt(0)
            switch(c) {
                case y:
                case Y:
                    c = 'y';
                case n:
                case N:
                    invalidAns = false;
                    break;
                default:
                    System.out.println("Please respond with yes or no.");
            }
        }while(validAns)

        Game game;
        if(c == 'y') {
            System.out.println("Good, let's play hangman.")
            game = new hangman();
        }else {
            System.out.println("Ok, here's some work to do instead.");
            game = new addition();
        }

        boolean unfinished = true;
        game.output();
        while(unfinished) {
            game.input();
            unfinished = game.output();
        }
    }
}
