// HistogrammExtended.java
package aufgabe2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * HistogrammExtended liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Raphael Bregger
 * @version 23.04.2019
 */
public final class HistogrammExtended {
    private HistogrammExtended() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {

        final int max = 6;
        final int min = 1;

        int[] counter = new int[max];

        //---------------------------------------------------- Zahlen einlesen
        System.out.println("Ganze Zahlen zwischen 1 und 6 eingeben "
                    + "(Ende mit Strg-D):");

        while (EINGABE.hasNext()) {
            int number = EINGABE.nextInt();

            //Analyze and process input
            if (number < min || number > max) {
                System.out.println("Falsche Eingabe wird ignoriert: " + number);
            } else {
                counter[number - 1]++;
            }
        }

        //------------------------------------------------ Histogramm ausgeben
        int maxValue = counter[0];

        for(int i = 1; i < counter.length; i++) {
            if(counter[i] > maxValue) {
                maxValue = counter[i];
            }
        }

        int n = (maxValue / 50) + 1;

        for (int i = 0; i < counter.length; ++i) {
            for (int j = 0; j < counter[i]; ++j) {
                if ((j + 1) % n == 0) {
                    System.out.printf("%s", i + 1);
                }
            }
            System.out.printf(" (%s)%n", counter[i]);
        }
    }
}

