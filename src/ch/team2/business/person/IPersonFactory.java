package ch.team2.business.person;

import ch.team2.business.PersonType;
import ch.team2.persistence.person.IPersonDAO;

/**
 * Interface for PersonFactory
 */
public interface IPersonFactory {

	// attributes

	// methods

	IPersonDAO createPerson(PersonType personType, String firstName, String lastName);

	IPersonDAO displayPerson(int personId);
}
