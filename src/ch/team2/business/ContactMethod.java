package ch.team2.business;


/**
 * Class to define several contact methods
 */
public enum ContactMethod {
	EMAIL("email"),
	PHONE("phone"),
	LETTER("letter");

	// attributes
	private String pascalCase;

	// constructor
	ContactMethod(String pascalCase) {
		this.pascalCase = pascalCase;
	}

	// methods
	public String getPascalCase() {
		return this.pascalCase;
	}

	public static ContactMethod valueOf(int value) {
		switch (value) {
			case 1:
				return ContactMethod.EMAIL;
			case 2:
				return ContactMethod.PHONE;
			case 3:
				return ContactMethod.LETTER;
			default:
				return null;
		}
	}
}
