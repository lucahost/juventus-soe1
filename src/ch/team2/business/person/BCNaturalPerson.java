package ch.team2.business.person;

/**
 * Business Class for a natural person.
 * A physic person being (human)
 */
public class BCNaturalPerson extends ACPerson {

	/**
	 * Constructor for BCNaturalPerson
	 * @param firstName
	 * @param lastName
	 */
	public BCNaturalPerson(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPersonType(PersonType.PERSONTYPE_NATURAL);
	}

	/**
	 * Formats the Firstname and Lastname to one Displayname
	 * @return DisplayName
	 */
	public String getDisplayName() {
		return this.getFirstName() + " " + this.getLastName();
	}
}
