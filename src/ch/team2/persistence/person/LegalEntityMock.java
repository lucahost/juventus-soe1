package ch.team2.persistence.person;

/**
 * LegalEntity DB Mock
 */
public class LegalEntityMock implements IPersonDAO {

	// attributes
	private int id;
	private String companyname;

	// constructor

	public LegalEntityMock(String companyname) {
		this.companyname = companyname;
	}

	// methods
	public int getId() {
		return this.id;
	}

	public String getDisplayName() {
		return this.companyname;
	}
}
