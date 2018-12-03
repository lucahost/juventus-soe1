package ch.team2.presentation;

/**
 * Class used to display data
 * Could be replaced due future plans with GUI
 * @author Luca Hostettler
 * @author Marc Bischof
 * @author Florian Bohren
 */
public class ConsoleClient {

    /**
     * Initial point
     * @param args
     */
    public static void main(String[] args) {
        int mainMenuOption = 0;
        while (mainMenuOption != 9) {
            mainMenuOption = ConsoleClientView.getMainMenuSelection();
            switch(mainMenuOption)
            {
                // Kunde anzeigen
                case 1:
                    System.out.println("TODO: Kunde anzeigen\n");
                    break;
                // Kunde anlegen
                case 2:
                    int CreatePersonMenuOption = 0;
                    while (
                            CreatePersonMenuOption != 9 &&
                            CreatePersonMenuOption != 1 &&
                            CreatePersonMenuOption != 2 &&
                            CreatePersonMenuOption != 3
                    ) {
                        CreatePersonMenuOption = ConsoleClientView.getCreatePersonSelection();
                        switch(CreatePersonMenuOption)
                        {
                            // Natürliche Person
                            case 1:
                                ConsoleClientController.createPersonWithoutScan("1");
                                break;
                            // Juristische Person
                            case 2:
                                System.out.println("TODO: Juristische Person anlegen\n");
                                ConsoleClientController.createPersonWithoutScan("2");
                                break;
                            // Systembenutzer
                            case 3:
                                System.out.println("TODO: Systembenutzer anlegen\n");
                                ConsoleClientController.createPersonWithoutScan("3");
                                break;
                            // Zurück
                            case 9:
                                break;
                            default:
                                System.out.println("Ungültige Auswahl.\n");
                                break;
                        }
                    }
                    break;
                // Beenden
                case 9:
                    System.out.println("Kundenverwaltung wird beendet.\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Auswahl.\n");
                    break;
            }

        }
    }
}

