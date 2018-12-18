package ch.team2.business.person;

/**
 * Interface for PersonBase
 */
public interface IPerson {
	// getters and setters
	void setId(String id);

	PersonType getPersonType();

	void setPersonType(PersonType personType);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getDisplayName();
}
