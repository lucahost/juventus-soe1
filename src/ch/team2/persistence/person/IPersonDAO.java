package ch.team2.persistence.person;

import ch.team2.business.person.PersonType;

/**
 * Interface for the Data Access Object of the person Class
 */
public interface IPersonDAO {

    // attributes

    // getters and setters
	String getId();

	String getDisplayName();

	String getFirstName();

	String getLastName();

	PersonType getPersonType();
}

