package ch.team2.business.person;

import java.util.List;

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
	 * @return IPerson
	 */
	String createPerson(PersonType personType, String firstName, String lastName);

	/**
	 * Declare method to return the displayName of a person
	 *
	 * @param personId
	 * @return String displayName
	 */
	IPerson displayPerson(String personId);

	/**
	 * Declare method to return a list of a people
	 *
	 * @param personType
	 * @return List of People with same Type
	 */
	List<IPerson> displayPerson(PersonType personType);
}

