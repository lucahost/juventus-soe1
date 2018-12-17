package ch.team2.business.person;

/**
 * Business Class for a natural person.
 * A physic person being (human)
 */
public class NaturalPerson extends PersonBase {

	// attributes

	// constructor
	public NaturalPerson(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPersonType(PersonType.PERSONTYPE_NATURAL);
	}

	public String getDisplayName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	// methods

}
