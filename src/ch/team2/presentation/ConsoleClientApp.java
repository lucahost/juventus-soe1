package ch.team2.presentation;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.business.person.PersonType;

import java.util.List;


/**
 * Class used to display data
 * Could be replaced due future plans with GUI
 *
 * @author Luca Hostettler
 * @author Marc Bischof
 * @author Florian Bohren
 */
public class ConsoleClientApp {

	/**
	 * Initial point
	 *
	 * @param args can be used to start the program with arguments (External)
	 */
	public static void main(String[] args) {
		String person1Id = createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jon",
				"Doe"
		);
		displayPerson(person1Id);

		String person2Id = createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jane",
				"Doe"
		);
		displayPerson(person2Id);
	}


	/**
	 * This methods creates a person by PersonType, Firstname and Lastname
	 * Saves it to the db
	 * @param personType personType
	 * @param firstName String firstName
	 * @param lastName String lastName
	 * @return the ID of the newly created person
	 */
	public static String createPerson(PersonType personType, String firstName, String lastName){
		IPersonFactory personFactory = PersonFactory.getInstance();
		return personFactory.createPerson(
				personType,
				firstName,
				lastName
		);
	}

	/**
	 * Displays a person by the id
	 * @param personId String personId
	 */
	public static void displayPerson(String personId){
		IPersonFactory personFactory = PersonFactory.getInstance();
		System.out.println(String.format("Person mit ID %s erstellt:", personId));
		IPerson person = personFactory.displayPeople(personId);
		System.out.println(person.getDisplayName());
	}

	/**
	 * Displays all people in db by their given type
	 * @param personType personType
	 * @return IPerson all people with the same type
	 */
	public static List<IPerson> displayPeople(PersonType personType){
		IPersonFactory personFactory = PersonFactory.getInstance();
		System.out.println(String.format("Folgende Personen mit dem Typen '%s' in der DB", personType.getPascalCase()));
		List<IPerson> people = personFactory.displayPeople(personType);
		for(IPerson person: people){
			System.out.println(person.getDisplayName());
		}
		return people;
	}
}
