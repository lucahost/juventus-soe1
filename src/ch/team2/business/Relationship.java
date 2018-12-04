package ch.team2.business;

public enum Relationship {
	EMPLOYEE("employee"),
	SUB_COMPANY("subCompany"),
	PARTNER("partner");

	private String pascalCase;

	Relationship(String pascalCase) {
		this.pascalCase = pascalCase;
	}

	public String getPascalCase() {
		return this.pascalCase;
	}

	public static Relationship valueOf(int value) {
		switch (value) {
			case 1:
				return Relationship.EMPLOYEE;
			case 2:
				return Relationship.SUB_COMPANY;
			case 3:
				return Relationship.PARTNER;
			default:
				return null;
		}
	}
}
