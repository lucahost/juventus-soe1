package ch.team2.business.person;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonFactoryTest {

	@Test(expected = IllegalArgumentException.class)
	public void cannotDisplayPersonWithNullId() {
		IPersonFactory factory = PersonFactory.getInstance();
		factory.displayPerson("");
	}

	@Test()
	public void noPeopleFound() {
		IPersonFactory factory = PersonFactory.getInstance();
		List<IPerson> people = factory.displayPerson(PersonType.PERSONTYPE_USER);
		assertEquals(people.size(), 0);
	}
}