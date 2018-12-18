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

	/**
	 * Defines the private instance attribute
	 */
	private static PersonFactory thisInstance = new PersonFactory();

	/**
	 * Constructor must be private for singleton
	 */
	private PersonFactory() {
	}

	/**
	 * Return the singleton instance
	 * @return <IPersonFactory>thisInstance</IPersonFactory>
	 */
	public static PersonFactory getInstance() {
		return thisInstance;
	}

	/**
	 * Creates a new person and returns their id
	 *
	 * @param personType the personType can be found in person.PersonType
	 * @param firstName  the FirstName of the person
	 * @param lastName   the LastName of the person
	 * @return <String>personId</String>
	 */
	public String createPerson(PersonType personType, String firstName, String lastName) {
		IPerson personData = convert(personType, firstName, lastName);
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO dbPerson = personDAOFactory.createPerson(personData);
		return dbPerson.getId();
	}

	/**
	 * Return a person by their given id
	 * @param personId
	 * @return <IPerson>person</IPerson>
	 */
	public IPerson displayPeople(String personId) {
		IPersonDAOFactory personDAOFactory = PersonDAOFactory.getInstance();
		IPersonDAO person = personDAOFactory.getPerson(personId);
		if (person != null) {
			return convert(person);
		} else {
			throw new IllegalArgumentException(String.format("person with id %s not found", personId));
		}
	}

	/**
	 * Displays a list of people by their personType
	 * @param personType
	 * @return <List><IPerson>ListOfPeople</IPerson></List>
	 */
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

	/**
	 * Returns a IPerson for the given input parameters
	 * @param personType
	 * @param firstName
	 * @param lastName
	 * @return <IPerson>personData</IPerson>
	 */
	public static IPerson convert(PersonType personType, String firstName, String lastName) {
		IPerson person = null;
		switch (personType) {
			case PERSONTYPE_NATURAL:
				person = new BCNaturalPerson(firstName, lastName);
				break;
		}
		return person;
	}

	/**
	 * Converts a IPersonDAO to a IPerson
	 * @param dbPerson
	 * @return <IPerson>personData</IPerson>
	 */
	public static IPerson convert(IPersonDAO dbPerson) {
		IPerson person = null;

		switch (dbPerson.getPersonType()) {
			case PERSONTYPE_NATURAL:
				person = new BCNaturalPerson(dbPerson.getFirstName(), dbPerson.getLastName());
		}
		person.setId(dbPerson.getId());
		return person;
	}
}
