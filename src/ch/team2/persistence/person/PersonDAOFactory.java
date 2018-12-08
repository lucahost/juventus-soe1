package ch.team2.persistence.person;

import ch.team2.business.PersonType;
import ch.team2.business.person.IPersonData;

/**
 * Knows database access and methods
 * Used to create mocks
 */
public class PersonDAOFactory {
	// attributes
	private static PersonDAOFactory ourInstance = new PersonDAOFactory();

	// constructor
	private PersonDAOFactory() {
	}

	// methods
	public static PersonDAOFactory getInstance() {
		return ourInstance;
	}


	public static IPersonDAO createPerson(IPersonData personData) {
		IPersonDAO person = null;
		if (personData.getPersonType().equals(PersonType.PERSONTYPE_NATURAL)) {
			person = new NaturalPersonMock(personData);
		}
		PersonRepository.addPerson(person);
		return person;
	}

	public static IPersonDAO getPerson(int personId) {
		return PersonRepository.getPersonById(personId);
	}
}
