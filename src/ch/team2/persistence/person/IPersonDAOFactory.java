package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;

import java.util.List;

/**
 * Interface for the PersonDAOFactory
 */
public interface IPersonDAOFactory {

	/**
	 * Declares a method to create and store a person
	 * @param personData String
	 * @return personMock
	 */
	IPersonDAO createPerson(IPerson personData);

	/**
	 * Declares a method to return a personMock by personId
	 * @param personId String
	 * @return personMock
	 */
	IPersonDAO getPerson(String personId);

	/**
	 * Declares a method to return all people
	 * @return dbPeople
	 */
	List<IPersonDAO> getPeople();
}
