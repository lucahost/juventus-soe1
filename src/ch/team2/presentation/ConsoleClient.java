package ch.team2.presentation;

/**
 * Class used to display data
 * Could be replaced due future plans with GUI
 *
 * @author Luca Hostettler
 * @author Marc Bischof
 * @author Florian Bohren
 */
public class ConsoleClient {

	/**
	 * Initial point
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int mainMenuOption = 0;
		while (mainMenuOption != 9) {
			mainMenuOption = ConsoleClientView.getMainMenuSelection();
			switch (mainMenuOption) {
				// Kunde anzeigen
				case 1:

					ConsoleClientController.displayPerson();
					break;
				// Kunde anlegen
				case 2:
					int createPersonMenuOption = 0;
					while (
							createPersonMenuOption != 9 &&
									createPersonMenuOption != 1 &&
									createPersonMenuOption != 2 &&
									createPersonMenuOption != 3
					) {
						createPersonMenuOption = ConsoleClientView.getCreatePersonSelection();
						switch (createPersonMenuOption) {
							// Natürliche Person
							case 1:
								ConsoleClientController.createPerson("1");
								break;
							// Juristische Person
							case 2:
								ConsoleClientController.createPerson("2");
								break;
							// Systembenutzer
							case 3:
								ConsoleClientController.createPerson("3");
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

