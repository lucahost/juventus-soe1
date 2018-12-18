package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;

import java.util.List;

/**
 * Knows database access and
 * methods used to create mocks
 */
public class PersonDAOFactory implements IPersonDAOFactory {

	/**
	 * Defines the private instance attribute
	 */
	private static PersonDAOFactory thisInstance = new PersonDAOFactory();

	/**
	 * Constructor must be private to match singleton pattern
 	 */
	private PersonDAOFactory() {
	}

	/**
	 * Return the singleton instance
	 * @return thisInstance
	 */
	public static IPersonDAOFactory getInstance() {
		return thisInstance;
	}

	/**
	 * Create the transferred person by their data
	 * @param personData the generated personData of type IPerson
	 * @return IPersonDAO person
	 */
	public IPersonDAO createPerson(IPerson personData) {
		IPersonDAO person = null;
		if (personData != null) {
			switch (personData.getPersonType()) {
				case PERSONTYPE_NATURAL:
					person = new NaturalPersonMock(personData);
					break;
			}
			PersonRepository.addPerson(person);
			return person;
		} else{
			throw new IllegalArgumentException("personData is null");
		}
	}

	/**
	 * Get a person by their id
	 * @param personId String
	 * @return dbPerson
	 */
	public IPersonDAO getPerson(String personId) {
		return PersonRepository.getPersonById(personId);
	}

	/**
	 * Return all people saved in the db
	 * @return dbPeople
	 */
	public List<IPersonDAO> getPeople() {
		return PersonRepository.getPeople();
	}
}
