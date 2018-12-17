package ch.team2.persistence.person;

import ch.team2.business.person.PersonType;
import ch.team2.business.person.IPerson;

import java.util.List;

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
		switch(personData.getPersonType()){
			case PERSONTYPE_NATURAL:
				person = new NaturalPersonMock(personData);
				break;
			default:
				return null;
		}
		PersonRepository.addPerson(person);
		return person;
	}

	public IPersonDAO getPerson(String personId) {
		return PersonRepository.getPersonById(personId);
	}

	public List<IPersonDAO> getPeople() { return PersonRepository.getPersons(); }
}
