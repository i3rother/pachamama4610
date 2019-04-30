// ShortVar.java

package aufgabe1;

import java.util.Scanner;

/**
 * ShortVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Raphael Bregger
 * @version 09.04.2019
 */
public final class ShortVar {
    private ShortVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final Short min = Short.MIN_VALUE;
        final Short max = Short.MAX_VALUE;

        System.out.printf("%s %d %s %d %s%n",
            "Zwei ganze Zahlen zwischen", min, "und", max, "eingeben:");

        Short firstShort = EINGABE.nextShort();
        Short secondShort = EINGABE.nextShort();

        System.out.printf("%d %s %o %s %x%n",
            firstShort, "ist oktal", firstShort,
            "und hexadezimal", firstShort);

        System.out.printf("%d %s %o %s %x%n",
            secondShort, "ist oktal", secondShort,
            "und hexadezimal", secondShort);

        System.out.printf("%d %s %d %s %d%n",
            firstShort, "+", secondShort, "ist", firstShort + secondShort);

        System.out.printf("%d %s %d %s %d%n",
            firstShort, "-", secondShort, "ist", firstShort - secondShort);

        System.out.printf("%d %s %d %s %d%n",
            firstShort, "/", secondShort, "ist", firstShort / secondShort);

        System.out.printf("%d %s %d %s %d%n",
            firstShort, "*", secondShort, "ist", firstShort * secondShort);

        System.out.printf("%d %s %d %s %d%n",
            firstShort, "%", secondShort, "ist", firstShort % secondShort);

        System.out.printf("%d %s %d %s %b%n",
            firstShort, "==", secondShort, "ist",
            firstShort.equals(secondShort));

        System.out.printf("%d %s %d %s %b%n",
            firstShort, "!=", secondShort, "ist",
            !firstShort.equals(secondShort));

        System.out.printf("%d %s %d %s %b%n",
            firstShort, "<", secondShort, "ist", firstShort < secondShort);

        System.out.printf("%d %s %d %s %b%n",
            firstShort, "<=", secondShort, "ist", firstShort <= secondShort);

        System.out.printf("%d %s %d %s %b%n",
            firstShort, ">", secondShort, "ist", firstShort > secondShort);

        System.out.printf("%d %s %d %s %b%n",
            firstShort, ">=", secondShort, "ist", firstShort >= secondShort);
    }
}

/**Verhält sich wie IntVar.java außer, dass Ergebnisse von Rechenoperationen,
die den Short Rahmen sprengen würden, trotzdem ausgegeben werden. Vermutung:
Ergebnisse werden als Int zwischengespeichert. **/
