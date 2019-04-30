// IntVarExtended.java

package aufgabe1;

import java.util.Scanner;

/**
 * IntVarExtended zeigt den Umgang mit Variablen vom Typ int.
 * &Uuml;bungsaufgabe 1 zur Programmiertechnik 1.
 * @author Raphael Bregger
 * @version 09.04.2019
 */
public final class IntVarExtended {
    private IntVarExtended() { }

    private static final Scanner EINGABE = new Scanner(System.in);

    /**
     * main ist der Startpunkt des Programms.
     * @param args wird nicht verwendet.
     */
    public static void main(String[] args) {
        final int min = 0x8000_0000;
        final int max = 0x7fff_ffff;

        //Variables
        long firstInt;
        long secondInt;
        long operationResult = 0;
        String operator;

        //First message
        System.out.printf("%s %d %s %d %s%n%s%n",
            "Bitte geben sie zwei ganze Zahlen zwischen",
            min, "und", max, "ein.", "Bitte geben Sie die erste Zahl ein:");

        //Fetching first number
        EINGABE.useDelimiter("\n");
        while (!EINGABE.hasNextInt()) {
            System.out.println("Das war keine zulässige Eingabe.");
            EINGABE.next();
        }
        firstInt = EINGABE.nextInt();

        //Fetching second number
        System.out.println("Bitte geben sie die zweite Zahl ein:");
        while (!EINGABE.hasNextInt()) {
            System.out.println("Das war keine Zulässige Eingabe.");
            EINGABE.next();
        }
        secondInt = EINGABE.nextInt();

        //Fetching the operator
        System.out.println("Bitte geben sie eine arithmetischen Operator ein:");
        while (!(EINGABE.hasNext("\\+") || EINGABE.hasNext("\\-")
            || EINGABE.hasNext("\\*") || EINGABE.hasNext("\\/")
            || EINGABE.hasNext("%"))) {
            System.out.println("Bitte einen gültigen Operator eingeben.");
            EINGABE.next();
        }
        operator = EINGABE.next();

        //Perform arithmetic operation
        switch (operator) {
        case "+": operationResult = firstInt + secondInt;
                  break;
        case "-": operationResult = firstInt - secondInt;
                  break;
        case "*": operationResult = firstInt * secondInt;
                  break;
        case "/": operationResult = firstInt / secondInt;
                  break;
        case "%": operationResult = firstInt % secondInt;
                  break;
        default:
            System.out.println("Something went wrong");
            break;
        }

        //Validate for integer dadatyp
        if (operationResult <= max && operationResult >= min) {
            System.out.printf("Das Ergebnis ist: %d%n", operationResult);
        } else if (operationResult >= max) {
            System.out.println("Das Ergebnis ist für den Datentyp "
                + "\"Integer\" zu groß.");
        } else {
            System.out.println("Das Ergebnis ist für den Datentyp"
                + " \"Integer\" zu klein.");
        }
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
