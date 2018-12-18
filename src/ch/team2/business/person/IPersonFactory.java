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
	 * @return <String>PersonId of the new created Person</String>
	 */
	String createPerson(PersonType personType, String firstName, String lastName);

	/**
	 * Declare the method to return a person by their ID
	 * @param personId
	 * @return <IPerson>Person with given ID</IPerson>
	 */
	IPerson displayPeople(String personId);

	/**
	 * Declare method to return a list of a people
	 *
	 * @param personType
	 * @return <List>IPerson</List>
	 */
	List<IPerson> displayPeople(PersonType personType);
}

