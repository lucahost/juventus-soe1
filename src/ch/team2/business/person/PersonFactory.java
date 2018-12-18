package ch.team2.business.person;

import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.IPersonDAOFactory;
import ch.team2.persistence.person.PersonDAOFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to create people
 * Implementation of a singleton factory
 */
public class PersonFactory implements IPersonFactory {

	// attributes
	private static PersonFactory ourInstance = new PersonFactory();

	// constructor
	private PersonFactory() {
	}

	// methods
	public static PersonFactory getInstance() {
		return ourInstance;
	}

	/**
	 * Creates a new Person and returns their id
	 *
	 * @param personType the personType can be found in person.PersonType
	 * @param firstName  the FirstName of the person
	 * @param lastName   the LastName of the person
	 * @return personId
	 */
	public String createPerson(PersonType personType, String firstName, String lastName) {
		IPerson personData = convert(personType, firstName, lastName);
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO dbPerson = personDAOFactory.createPerson(personData);
		return dbPerson.getId();
	}

	public IPerson displayPeople(String personId) {
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO person = personDAOFactory.getPerson(personId);
		if (person != null) {
			return convert(person);
		} else {
			throw new IllegalArgumentException(String.format("person with id %s not found", personId));
		}
	}

	public List<IPerson> displayPeople(PersonType personType) {
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		List<IPerson> retList = new ArrayList<IPerson>();
		List<IPersonDAO> dbPeople = personDAOFactory.getPeople();
		if (dbPeople != null && dbPeople.size() >= 0) {
			for (IPersonDAO dbPerson : dbPeople) {
				if(dbPerson.getPersonType() == personType){
					IPerson person = convert(dbPerson);
					retList.add(person);
				}
			}
		}
		return retList;
	}


	public static IPerson convert(PersonType personType, String firstName, String lastName) {
		IPerson person = null;
		switch (personType) {
			case PERSONTYPE_NATURAL:
				person = new NaturalPerson(firstName, lastName);
				break;
		}
		return person;
	}

	public static IPerson convert(IPersonDAO dbPerson) {
		IPerson person = null;

		switch (dbPerson.getPersonType()) {
			case PERSONTYPE_NATURAL:
				person = new NaturalPerson(dbPerson.getFirstName(), dbPerson.getLastName());
		}
		person.setId(dbPerson.getId());
		return person;
	}
}
