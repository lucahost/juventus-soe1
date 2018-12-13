package ch.team2.business.person;

import ch.team2.business.PersonType;

/**
 * Interface for PersonBase
 */
public interface IPerson {
	// attributes

	// methods
	int getId();

	void setId(int id);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	PersonType getPersonType();

	void setPersonType(PersonType personType);

}
