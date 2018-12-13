package ch.team2.business.person;

import ch.team2.business.PersonType;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.PersonDAOFactory;

/**
 * Class used to create people
 */
public class PersonFactory implements IPersonFactory {

	// attributes
	private static PersonFactory ourInstance = new PersonFactory();

	// constructor
	private PersonFactory() {
	}

	// methods
	public static PersonFactory getInstance() {
		return ourInstance;
	}

	public IPersonDAO createPerson(PersonType personType, String firstName, String lastName) {
		IPersonData personData = convert(firstName, lastName);
		IPersonDAO dbPerson = PersonDAOFactory.getInstance().createPerson(personData);
		return dbPerson;
	}

	public String displayPerson(int personId) {

		return PersonDAOFactory.getInstance().
				getPerson(personId).getDisplayName();
	}


	public static IPersonData convert(String firstName, String lastName) {
		return new NaturalPersonData(firstName, lastName);
	}
}
