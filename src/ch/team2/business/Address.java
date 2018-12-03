package ch.team2.business;

/**
 * Class to generate contact addresses
 */
public class Address {

	// attributes

	private Integer zipCode;
	private String city;
	private String street;
	private String houseNumber;

	// constructor
	public Address(Integer zipCode, String city, String street, String houseNumber){

	}

	// methods

	public Integer getZipCode(){
		return this.zipCode;
	}
	public void setZipCode(Integer zipCode){
		this.zipCode = zipCode;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getStreet(){
		return this.street;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getHouseNumber(){
		return this.houseNumber;
	}
	public void setHouseNumber(String houseNumber){
		this.houseNumber = houseNumber;
	}
}
