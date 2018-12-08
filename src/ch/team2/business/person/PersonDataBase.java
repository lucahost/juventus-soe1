package ch.team2.business.person;
import ch.team2.business.PersonType;


/**
 * Abstract Class for persons
 */
public abstract class PersonDataBase implements IPersonData {

	// attributes
	private int id;
	private PersonType personType;
	private String firstName;
	private String lastName;

	// methods
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