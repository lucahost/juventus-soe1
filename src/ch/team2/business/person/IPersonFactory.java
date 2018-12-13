package ch.team2.business.person;

import ch.team2.business.PersonType;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.PersonDAOFactory;

/**
 * Interface for PersonFactory
 */
public interface IPersonFactory {

	// attributes

	// methods


	IPersonDAO createPerson(PersonType personType, String firstName, String lastName);

	String displayPerson (int personId);

	}

