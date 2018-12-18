package ch.team2.business.person;

import java.util.List;

/**
 * Interface for PersonFactory
 */
public interface IPersonFactory {

	/**
	 * Declare method to create a new person and save it
	 *
	 * @param personType the personType can be found in person.PersonType
	 * @param firstName  the FirstName of the person
	 * @param lastName   the LastName of the person
	 * @return PersonId of the new created Person
	 */
	String createPerson(PersonType personType, String firstName, String lastName);

	/**
	 * Declare the method to return a person by their ID
	 * @param personId String
	 * @return Person with given ID
	 */
	IPerson displayPeople(String personId);

	/**
	 * Declare method to return a list of a people
	 *
	 * @param personType PersonType
	 * @return IPerson
	 */
	List<IPerson> displayPeople(PersonType personType);
}

