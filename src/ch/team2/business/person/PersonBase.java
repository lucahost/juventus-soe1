package ch.team2.business.person;

/**
 * Abstract Class for persons
 */
public abstract class PersonBase implements IPerson {
	// attributes
	private int id;
	private PersonType personType;
	private String firstName;
	private String lastName;

	// methods - getter and setter
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PersonType getPersonType() {
		return this.personType;
	}

	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

}