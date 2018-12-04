package ch.team2.persistence.person;

import ch.team2.business.person.IPersonData;

/**
 * NaturalPerson DB Mock
 */
public class NaturalPersonMock implements IPersonDAO {

	// attributes
	private int id;
	private String firstName;
	private String lastName;

	// constructor

	public NaturalPersonMock(IPersonData personData) {
		this.id = PersonRepository.getNextId();
		this.firstName = personData.getFirstName();
		this.lastName = personData.getLastName();
	}

	// methods

	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getDisplayName() {
		return this.firstName + " " + this.lastName;
	}
}
