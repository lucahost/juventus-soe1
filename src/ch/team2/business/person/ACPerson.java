package ch.team2.business.person;

/**
 * Abstract Class for IPerson
 * Defines attributes and default getters and setters
 */
public abstract class ACPerson implements IPerson {
	// attributes
	private String id;
	private PersonType personType;
	private String firstName;
	private String lastName;

	// getters and setters
	public void setId(String id) {
		this.id = id;
	}

	public PersonType getPersonType() {
		return this.personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public abstract String getDisplayName();
}