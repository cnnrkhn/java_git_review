import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

/**
 *  Plays an addition game
 *
 *  @author Connor Khin
 *  @version 1/28/23
 */ 
public class Addition extends Game {
    private int ans;
    private int a;
    private int b;

    public Addition() {
        System.out.println("Enter the sums until you get one wrong.");
    }

    // @override
    public void input() {
        Scanner kb = new Scanner(System.in);
        boolean invalid = true;
        while(invalid) {
            try {
                ans = kb.nextInt();
                invalid = false;
            }catch(InputMismatchException e) {
                System.out.println("That is not a number.");
                kb.nextLine();
                System.out.printf("What is %d + %d = ", a, b);
            }
        }
    }

    // @override
    public boolean playTurn() {
        boolean check = a + b == ans;
        if(!check) {
            System.out.println("That was wrong.");
        }
        return check;
    }

    // @override
    public void output() {
        Random r = new Random();
        a = r.nextInt(100); 
        b = r.nextInt(100);
        System.out.printf("What is %d + %d = ", a, b); 
    }
}
