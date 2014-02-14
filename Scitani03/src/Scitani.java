
import java.util.Scanner;

/**
 * @author Jan Hybs <x3mSpeedy@gmail.com>
 */
public class Scitani {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int total = sc.nextInt ();

        for (int i = 0; i < total; i++) {
            int sum = 0;
            int n;
            do {
                n = sc.nextInt ();
                if (n > 0)
                    sum += n;
            } while (n > 0);
            System.out.println (sum);
        }
    }
}
