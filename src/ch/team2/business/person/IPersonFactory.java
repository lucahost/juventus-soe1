package ch.team2.business.person;

import ch.team2.business.PersonType;
import ch.team2.persistence.person.IPersonDAO;

/**
 * Interface for PersonFactory
 */
public interface IPersonFactory {

	// methods

	/**
	 * Create a new person and save it
	 *
	 * @param personType the personType can be found in person.PersonType
	 * @param firstName  the FirstName of the person
	 * @param lastName   the LastName of the person
	 * @return IPersonDAO
	 */
	IPersonDAO createPerson(PersonType personType, String firstName, String lastName);

	/**
	 * Declare method to return the displayName of a person
	 *
	 * @param personId
	 * @return String displayName
	 */
	String displayPerson(int personId);

}

