package ch.team2.persistence.person;

/**
 * Mocked db class to store persons
 */
public class PersonRepository {

	// attributes
	private static IPersonDAO[] persons;

	// constructor

	// method

	public static IPersonDAO[] getPersons() {
		return persons;
	}


	/**
	 *	Returns the next personId as arrays are zero indexed
	 * @return int nextId
	 */
	public static int getNextId() {
		return persons.length;
	}

	public static IPersonDAO getPersonById(int id) {
		for (IPersonDAO person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}
}
