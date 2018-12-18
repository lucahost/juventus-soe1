package ch.team2.persistence.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Mocked db class to store persons
 */
public class PersonRepository {

	// attributes
	private static List<IPersonDAO> persons = new ArrayList<>();

	// methods

	/**
	 * Return all saved persons
	 *
	 * @return IPersonDAO
	 */
	public static List<IPersonDAO> getPersons() {
		return persons;
	}

	/**
	 * Returns the next personId as arrays are zero indexed
	 *
	 * @return int nextId
	 */
	public static String getNextId() {
		return java.util.UUID.randomUUID().toString();
	}

	/**
	 * @param personId required param the personId
	 * @return IPersonDAO a person
	 */
	public static IPersonDAO getPersonById(String personId) {
		for (IPersonDAO person : persons) {
			if (person.getId() == personId) {
				return person;
			}
		}
		return null;
	}


	/**
	 * Create a person and save in the the list
	 *
	 * @param person the person to save
	 */
	public static void addPerson(IPersonDAO person) {
		persons.add(person);
	}
}
