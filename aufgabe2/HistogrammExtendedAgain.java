// HistogrammExtendedAgain.java
package aufgabe2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * HistogrammExtendedAgain liest ganze Zahlen zwischen 1 und 6 ein und
 * gibt deren H&auml;ufigkeitsverteilung als Histogramm aus.
 * @author Raphael Bregger
 * @version 23.04.2019
 */
public final class HistogrammExtendedAgain {
    private HistogrammExtendedAgain() { }

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
        int[] orderedCounter = counter.clone();
        Arrays.sort(orderedCounter);

        for (int i = orderedCounter[min - 1];
            i <= orderedCounter[max - 1]; ++i) {
            for (int j = 0; j < counter.length; ++j) {
                if (counter[j] >= i) {
                    System.out.printf("%s ", j + 1);
                } else {
                    System.out.printf("%s ", " ");
                }
            }
            System.out.printf(" (%s)%n", i);
        }
    }
}

