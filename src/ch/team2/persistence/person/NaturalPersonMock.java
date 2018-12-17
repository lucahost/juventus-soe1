package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.PersonType;

/**
 * NaturalPerson DB Mock
 */
public class NaturalPersonMock implements IPersonDAO {

	// attributes

	private String id;
	private String firstName;
	private String lastName;
	private PersonType personType;

	// constructor

	public NaturalPersonMock(IPerson personData) {
		this.id = PersonRepository.getNextId();
		this.firstName = personData.getFirstName();
		this.lastName = personData.getLastName();
		this.personType = personData.getPersonType();
	}

	// methods

	public String getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public PersonType getPersonType() {
		return this.personType;
	}
}
