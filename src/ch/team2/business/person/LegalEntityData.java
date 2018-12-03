package ch.team2.business.person;

import ch.team2.business.PersonType;

/**
 * Business Class for a legal entity.
 */
public class LegalEntityData extends PersonDataBase {


	// attributes


	// constructor
	public LegalEntityData(){
		this.setPersonType(PersonType.PERSONTYP_LEGALENTITY);
	}
	public LegalEntityData(String companyName){
		this.setCompanyName(companyName);
		this.setPersonType(PersonType.PERSONTYP_LEGALENTITY);
	}

	// methods

}
