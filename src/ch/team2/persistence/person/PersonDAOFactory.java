package ch.team2.persistence.person;

import ch.team2.business.PersonType;
import ch.team2.business.person.IPerson;

/**
 * Knows database access and methods
 * Used to create mocks
 */
public class PersonDAOFactory implements IPersonDAOFactory {
	// attributes
	private static PersonDAOFactory ourInstance = new PersonDAOFactory();

	// constructor
	private PersonDAOFactory() {
	}

	// methods
	public static IPersonDAOFactory getInstance() {
		return ourInstance;
	}


	public IPersonDAO createPerson(IPerson personData) {
		IPersonDAO person = null;
		if (personData.getPersonType().equals(PersonType.PERSONTYPE_NATURAL)) {
			person = new NaturalPersonMock(personData);
		}
		PersonRepository.addPerson(person);
		return person;
	}

	public IPersonDAO getPerson(int personId) {
		return PersonRepository.getPersonById(personId);
	}
}
