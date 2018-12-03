package ch.team2.business.person;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;

/**
 * Abstract Class for persons
 */
public abstract class PersonDataBase implements IPersonData {

	// attributes
	private String firstName;
	private String lastName;
	private String companyName;
	private PersonType personType;
	private Address address;
	private ContactMethod contactMethod;
	private Relationship relationship;

	// methods
	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}

	@Override
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String getDisplayName() {
		if (this.getPersonType() != PersonType.PERSONTYP_LEGALENTITY) {
			return this.getFirstName() + " " + this.getLastName();
		}
		return this.getCompanyName();
	}

	public PersonType getPersonType(){
		return this.personType;
	}

	public void setPersonType(PersonType personType){
		this.personType = personType;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ContactMethod getContactMethod() {
		return this.contactMethod;
	}

	public void setContactMethod(ContactMethod contactMethod) {
		this.contactMethod = contactMethod;
	}

	public Relationship getRelationship() {
		return this.relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}
}
