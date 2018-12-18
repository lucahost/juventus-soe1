package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.BCNaturalPerson;
import org.junit.Test;

public class PersonDAOFactoryTest {

	@Test(expected = IllegalArgumentException.class)
	public void cannotCreatePersonWithNullPersonData() {
		IPersonDAOFactory factory = PersonDAOFactory.getInstance();
		factory.createPerson(null);
	}

	@Test(expected = NullPointerException.class)
	public void cannotCreatePersonWithNullType() {
		IPerson person = new BCNaturalPerson("test", "Test");
		person.setPersonType(null);
		IPersonDAOFactory factory = PersonDAOFactory.getInstance();
		factory.createPerson(person);
	}
}