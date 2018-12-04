package ch.team2.business.person;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;

/**
 * Interface for PersonBase
 */
public interface IPersonData {

	// attributes

	// methods
	int getId();

	void setId(int id);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getCompanyName();

	void setCompanyName(String companyName);

	String getDisplayName();

	PersonType getPersonType();

	void setPersonType(PersonType personType);

	Address getAddress();

	void setAddress(Address address);

	ContactMethod getContactMethod();

	void setContactMethod(ContactMethod contactMethod);

	Relationship getRelationship();

	void setRelationship(Relationship relationship);
}
