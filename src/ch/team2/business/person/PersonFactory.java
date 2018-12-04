package ch.team2.business.person;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.PersonDAOFactory;
import ch.team2.presentation.ConsoleClientView;

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

	public IPersonDAO displayPerson(int personId) {
		return PersonDAOFactory.getInstance().getPerson(personId);
	}


	public static IPersonData convert(PersonType personType, Address address, ContactMethod contactMethod, Relationship relationship) {
		IPersonData personData = null;

		if (personType.equals(PersonType.PERSONTYPE_NATURAL)) {
			String firstName = ConsoleClientView.getFirstName();
			String lastName = ConsoleClientView.getLastName();
			personData = new NaturalPersonData(firstName, lastName);
		} else if (personType.equals(PersonType.PERSONTYP_LEGALENTITY)) {
			String companyName = ConsoleClientView.getCompanyName();
			personData = new LegalEntityData(companyName);
		} else if (personType.equals(PersonType.PERSONTYPE_USER)) {
			String firstName = ConsoleClientView.getFirstName();
			String lastName = ConsoleClientView.getLastName();
			personData = new UserData(firstName, lastName);
		}
		personData.setAddress(address);
		personData.setContactMethod(contactMethod);
		personData.setRelationship(relationship);

		return personData;
	}
}
