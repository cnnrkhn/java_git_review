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
        
        do{
            System.out.println("Would you like to play a game? (y/n)");
            reponse = kb.nextLine();
        }while(validAns(response))
    }
    
    public static boolean validAns(String s) {
        char c = s.charAt(0);
        boolean valid = false;
        if(c == 'y' || c == 'n' || c == 'Y' || c == 'N') {
            valid = true;
        }
        return valid;
    }
}
