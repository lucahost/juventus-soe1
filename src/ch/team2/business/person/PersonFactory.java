package ch.team2.business.person;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.PersonDAOFactory;

/**
 * Class used to create people
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

	public IPersonDAO createPerson(PersonType personType, Address address, ContactMethod contactMethod, Relationship relationship) {
		IPersonData personData = convert(personType, address, contactMethod, relationship);
		IPersonDAO dbPerson = PersonDAOFactory.getInstance().createPerson(personData);
		return dbPerson;
	}

	public static IPersonData convert(PersonType personType, Address address, ContactMethod contactMethod, Relationship relationship) {
		IPersonData personData = null;

		if (personType.equals(PersonType.PERSONTYPE_NATURAL)) {
			personData = new NaturalPersonData();
		} else if (personType.equals(PersonType.PERSONTYP_LEGALENTITY)) {
			personData = new LegalEntityData();
		} else if (personType.equals(PersonType.PERSONTYPE_USER)) {
			personData = new UserData();
		}
		personData.setAddress(address);
		personData.setContactMethod(contactMethod);
		personData.setRelationship(relationship);

		return personData;
	}
}
