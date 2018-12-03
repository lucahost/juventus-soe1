package ch.team2.business.person;

import ch.team2.business.PersonType;

/**
 * Business Class for a natural person.
 * A physic person being (human)
 */
public class NaturalPersonData extends PersonDataBase {

	// attributes

	// constructor
	public NaturalPersonData() {
		this.setPersonType(PersonType.PERSONTYPE_NATURAL);
	}

	public NaturalPersonData(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPersonType(PersonType.PERSONTYPE_NATURAL);
	}

	// methods
}
