package ch.team2.presentation;

import java.util.Scanner;

/**
 * Class used to display console menu
 * Could be replaced due future plans with GUI
 * @author Luca Hostettler
 * @author Marc Bischof
 * @author Florian Bohren
 */
public class ConsoleClientView {
    public static int getMainMenuSelection() {
        int option = 0;

        // Print Menu to User
        System.out.println("----------------");
        System.out.println("Kundenverwaltung");
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1 - Kunde anzeigen");
        System.out.println("2 - Kunde anlegen");
        System.out.println("9 - Beenden");
        System.out.println("");
        System.out.println("Bitte wählen Sie eine Option (z.B. 1): ");

        // Read Input from User
        Scanner console = new Scanner(System.in);
        option = console.nextInt();
        return option;
    }

    public static int getCreatePersonSelection() {
        int option = 0;

        // Print Menu to User
        System.out.println("Kunde anlegen");
        System.out.println("");
        System.out.println("Bitte wählen Sie den Personentyp:");
        System.out.println("1 - Natürliche Person");
        System.out.println("2 - Juristische Person");
        System.out.println("3 - Systembenutzer");
        System.out.println("9 - Abbrechen");
        System.out.println("");
        System.out.println("Bitte wählen Sie eine Option (z.B. 1):");

        // Read Input from User
        Scanner console = new Scanner(System.in);
        option = console.nextInt();
        return option;
    }
}
