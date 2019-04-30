// IntVar.java

package aufgabe1;

import java.util.Scanner;

/**
 * IntVar zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Raphael Bregger
 * @version 09.04.2019
 */
public final class IntVar {
    private IntVar() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final int min = 0x8000_0000;
        final int max = 0x7fff_ffff;

        System.out.printf("%s %d %s %d %s%n",
            "Zwei ganze Zahlen zwischen", min, "und", max, "eingeben:");

        int firstInt = EINGABE.nextInt();
        int secondInt = EINGABE.nextInt();

        System.out.printf("%d %s %o %s %x%n",
            firstInt, "ist oktal", firstInt,
            "und hexadezimal", firstInt);

        System.out.printf("%d %s %o %s %x%n",
            secondInt, "ist oktal", secondInt,
            "und hexadezimal", secondInt);

        System.out.printf("%d %s %d %s %d%n",
            firstInt, "+", secondInt, "ist", firstInt + secondInt);

        System.out.printf("%d %s %d %s %d%n",
            firstInt, "-", secondInt, "ist", firstInt - secondInt);

        System.out.printf("%d %s %d %s %d%n",
            firstInt, "/", secondInt, "ist", firstInt / secondInt);

        System.out.printf("%d %s %d %s %d%n",
            firstInt, "*", secondInt, "ist", firstInt * secondInt);

        System.out.printf("%d %s %d %s %d%n",
            firstInt, "%", secondInt, "ist", firstInt % secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, "==", secondInt, "ist", firstInt == secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, "!=", secondInt, "ist", firstInt != secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, "<", secondInt, "ist", firstInt < secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, "<=", secondInt, "ist", firstInt <= secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, ">", secondInt, "ist", firstInt > secondInt);

        System.out.printf("%d %s %d %s %b%n",
            firstInt, ">=", secondInt, "ist", firstInt >= secondInt);

    }
}

/**Fällt eine der beiden eingegebenen Zahlen aus dem Rahmen,
So stürzt das Programm mit eine InputMismatchExeception ab

Fällt das Ergebnis einer Rechenoperation aus dem Rahmen, wird
mit dem zweierkomplement gerechnet, dabei fallen zusätzlich
benötigte Bits die über 32 hinaus gehen einfach weg, wodurch
das Ergebnis verfälscht wird.

Gibt man Text anstatt Zahlen ein, so hat das eine
InputMismatchExeception zur Folge

Gibt man STRG-D anstatt Zahlen ein. so hatdas eine
NoSuchElementException zur folge
**/

