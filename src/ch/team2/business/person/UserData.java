package ch.team2.business.person;

import ch.team2.business.PersonType;

/**
 * Business Class for a User
 */
public class UserData extends PersonDataBase {
	// attributes

	// constructor
	public UserData() {
		this.setPersonType(PersonType.PERSONTYPE_USER);
	}

	public UserData(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPersonType(PersonType.PERSONTYPE_USER);
	}


	// methods
}
