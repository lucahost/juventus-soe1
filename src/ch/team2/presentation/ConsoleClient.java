package ch.team2.presentation;

import ch.team2.business.person.PersonType;

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
	 * @param args can be used to start the program with arguments (External)
	 */
	public static void main(String[] args) {
		ConsoleClientApp app = new ConsoleClientApp();
		String person1Id = app.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jon",
				"Doe"
		);
		app.displayPerson(person1Id);

		String person2Id = app.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jane",
				"Doe"
		);
		app.displayPerson(person2Id);
	}
}
