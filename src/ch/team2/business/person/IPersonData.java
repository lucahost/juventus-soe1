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
	public int getId();

	public void setId(int id);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public String getCompanyName();

	public void setCompanyName(String companyName);

	public String getDisplayName();

	public PersonType getPersonType();

	public void setPersonType(PersonType personType);

	public Address getAddress();

	public void setAddress(Address address);

	public ContactMethod getContactMethod();

	public void setContactMethod(ContactMethod contactMethod);

	public Relationship getRelationship();

	public void setRelationship(Relationship relationship);
}
