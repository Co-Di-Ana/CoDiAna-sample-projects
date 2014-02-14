package cz.edu.x3m.test;

import cz.edu.x3m.test.math.Summo;
import java.util.Scanner;

/**
 * @author Jan Hybs <x3mSpeedy@gmail.com>
 */
public class Scitani {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        new Scitani ();
    }



    /**
     * Creates new instance of Main class
     */
    public Scitani () {
        Scanner s = new Scanner (System.in);
        int total = s.nextInt ();

        Summo summo;
        int value;
        for (int i = 0; i < total; i++) {

            summo = new Summo ();

            do {
                value = s.nextInt ();
                if (value > 0)
                    summo.add (value);
            } while (value > 0);
            
            // print result
            System.out.println (summo.getResult ());
        }
    }
}
