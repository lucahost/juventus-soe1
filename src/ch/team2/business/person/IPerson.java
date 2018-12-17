package ch.team2.business.person;

/**
 * Interface for PersonBase
 */
public interface IPerson {
	// attributes

	// methods
	void setId(String id);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getDisplayName();

	PersonType getPersonType();

	void setPersonType(PersonType personType);

}
