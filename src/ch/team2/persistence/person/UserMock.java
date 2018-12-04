package ch.team2.persistence.person;

import ch.team2.business.person.IPersonData;

/**
 * User DB Mock
 */
public class UserMock implements IPersonDAO {

	// attributes
	private int id;
	private String firstName;
	private String lastName;

	// constructor

	public UserMock(IPersonData personData) {
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
