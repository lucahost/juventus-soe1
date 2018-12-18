package ch.team2.business.person;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BCNaturalPersonTest {
	// TODO: do we need to create the object with "new" for every test case?

	@Test
	public void testNaturalPersonIsInstanceOfPersonBase () {
		BCNaturalPerson testPerson = new BCNaturalPerson("Max", "Mustermann");
		assertTrue(testPerson instanceof ACPerson);
	}

	@Test
	public void testNaturalPersonHasCorrectNames () {
		BCNaturalPerson testPerson = new BCNaturalPerson("Max", "Mustermann");
		assertEquals(testPerson.getFirstName(), "Max");
		assertEquals(testPerson.getLastName(), "Mustermann");
	}

}