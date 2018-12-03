package ch.team2.business.person;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;
import ch.team2.persistence.person.IPersonDAO;

/**
 * Interface for PersonFactory
 */
public interface IPersonFactory {

    // attributes

    // methods

	public IPersonDAO createPerson(PersonType personType, Address address, ContactMethod contactMethod, Relationship relationship);
}
