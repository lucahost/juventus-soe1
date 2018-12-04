package ch.team2.persistence.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Mocked db class to store persons
 */
public class PersonRepository {

	// attributes
	private static List<IPersonDAO> persons = new ArrayList<>();

	// constructor

	// method

	public static List<IPersonDAO> getPersons() {
		return persons;
	}


	/**
	 * Returns the next personId as arrays are zero indexed
	 *
	 * @return int nextId
	 */
	public static int getNextId() {
		return persons.size();
	}

	public static IPersonDAO getPersonById(int id) {
		for (IPersonDAO person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	public static void addPerson(IPersonDAO person){
		persons.add(person);
	}
}
