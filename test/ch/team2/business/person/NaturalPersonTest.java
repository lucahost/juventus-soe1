package ch.team2.business.person;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NaturalPersonTest {
	// TODO: do we need to create the object with "new" for every test case?

	@Test
	public void testNaturalPersonIsInstanceOfPersonBase () {
		NaturalPerson testPerson = new NaturalPerson("Max", "Mustermann");
		assertTrue(testPerson instanceof PersonBase);
	}

	@Test
	public void testNaturalPersonHasCorrectNames () {
		NaturalPerson testPerson = new NaturalPerson("Max", "Mustermann");
		assertEquals(testPerson.getFirstName(), "Max");
		assertEquals(testPerson.getLastName(), "Mustermann");
	}

}