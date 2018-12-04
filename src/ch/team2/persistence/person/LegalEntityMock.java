package ch.team2.persistence.person;

import ch.team2.business.person.IPersonData;

/**
 * LegalEntity DB Mock
 */
public class LegalEntityMock implements IPersonDAO {

	// attributes
	private int id;
	private String companyName;

	// constructor

	public LegalEntityMock(IPersonData personData) {
		this.id = PersonRepository.getNextId();
		this.companyName = personData.getCompanyName();
	}

	// methods
	public int getId() {
		return this.id;
	}

	public String getDisplayName() {
		return this.companyName;
	}
}
