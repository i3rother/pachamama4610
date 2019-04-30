// ByteVar.java

package aufgabe1;

import java.util.Scanner;

/**
 * ByteVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Raphael Bregger
 * @version 09.04.2019
 */
public final class ByteVar {
    private ByteVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final Byte min = Byte.MIN_VALUE;
        final Byte max = Byte.MAX_VALUE;

        System.out.printf("%s %d %s %d %s%n",
            "Zwei ganze Zahlen zwischen", min, "und", max, "eingeben:");

        Byte firstByte = EINGABE.nextByte();
        Byte secondByte = EINGABE.nextByte();

        System.out.printf("%d %s %o %s %x%n",
            firstByte, "ist oktal", firstByte,
            "und hexadezimal", firstByte);

        System.out.printf("%d %s %o %s %x%n",
            secondByte, "ist oktal", secondByte,
            "und hexadezimal", secondByte);

        System.out.printf("%d %s %d %s %d%n",
            firstByte, "+", secondByte, "ist", firstByte + secondByte);

        System.out.printf("%d %s %d %s %d%n",
            firstByte, "-", secondByte, "ist", firstByte - secondByte);

        System.out.printf("%d %s %d %s %d%n",
            firstByte, "/", secondByte, "ist", firstByte / secondByte);

        System.out.printf("%d %s %d %s %d%n",
            firstByte, "*", secondByte, "ist", firstByte * secondByte);

        System.out.printf("%d %s %d %s %d%n",
            firstByte, "%", secondByte, "ist", firstByte % secondByte);

        System.out.printf("%d %s %d %s %b%n",
            firstByte, "==", secondByte, "ist",
            firstByte.equals(secondByte));

        System.out.printf("%d %s %d %s %b%n",
            firstByte, "!=", secondByte, "ist",
            !firstByte.equals(secondByte));

        System.out.printf("%d %s %d %s %b%n",
            firstByte, "<", secondByte, "ist", firstByte < secondByte);

        System.out.printf("%d %s %d %s %b%n",
            firstByte, "<=", secondByte, "ist", firstByte <= secondByte);

        System.out.printf("%d %s %d %s %b%n",
            firstByte, ">", secondByte, "ist", firstByte > secondByte);

        System.out.printf("%d %s %d %s %b%n",
            firstByte, ">=", secondByte, "ist", firstByte >= secondByte);
    }
}

/**Verhält sich wie IntVar.java außer, dass Ergebnisse von Rechenoperationen,
die den Byte Rahmen sprengen würden, trotzdem ausgegeben werden. Vermutung:
Ergebnisse werden als Int zwischengespeichert. **/
