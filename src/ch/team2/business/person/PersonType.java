package ch.team2.business.person;

public enum PersonType {
	PERSONTYPE_NATURAL("natural"),
	PERSONTYP_LEGALENTITY("legalentity"),
	PERSONTYPE_USER("user");

	// attributes
	private String pascalCase;

	PersonType(String pascalCase) {
		this.pascalCase = pascalCase;
	}

	// methods
	public String getPascalCase() {
		return this.pascalCase;
	}
}
