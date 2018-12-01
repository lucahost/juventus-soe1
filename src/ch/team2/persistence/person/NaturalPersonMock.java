package ch.team2.persistence.person;

/**
 * NaturalPerson DB Mock
 */
public class NaturalPersonMock implements IPersonDAO {

    // attributes
	
	private String vorname;
	private String nachname;
	
    // constructor
	
	public NaturalPersonMock(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

    // methods
	
	public String getVorname() {
		return this.vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	public String getDisplayName() {
		return this.vorname + " " + this.nachname;
	}
}
