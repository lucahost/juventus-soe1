package ch.team2.persistence.person;

/**
 * NaturalPerson DB Mock
 */
public class NaturalPersonMock implements IPersonDAO {

    // attributes
	
	private String firstname;
	private String lastname;
	
    // constructor
	
	public NaturalPersonMock(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

    // methods
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public String getDisplayName() {
		return this.firstname + " " + this.lastname;
	}
}
