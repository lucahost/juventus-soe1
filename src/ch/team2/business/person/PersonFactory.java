package ch.team2.business.person;

import ch.team2.business.PersonType;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.IPersonDAOFactory;
import ch.team2.persistence.person.PersonDAOFactory;

/**
 * Class used to create people
 * Implementation of a singleton factory
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
		IPerson personData = convert(firstName, lastName);
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO dbPerson = personDAOFactory.createPerson(personData);
		return dbPerson;
	}

	public String displayPerson(int personId) {
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO person = personDAOFactory.getPerson(personId);
		if (person != null) {
			return person.getDisplayName();
		} else {
			throw new IllegalArgumentException(String.format("person with id %s not found", personId));
		}
	}


	public static IPerson convert(String firstName, String lastName) {
		return new NaturalPerson(firstName, lastName);
	}
}
