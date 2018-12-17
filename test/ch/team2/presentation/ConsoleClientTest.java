package ch.team2.presentation;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.business.person.PersonType;
import org.junit.After;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class ConsoleClientTest {
	private IPersonFactory personFactory;

	@Before
	public void setUp() throws Exception {
		personFactory = PersonFactory.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}


    @org.junit.Test
    public void createPerson() {
		String testPersonId = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Max",
				"Mustermann"
		);
		assertNotNull(testPersonId);
    }

    @org.junit.Test
    public void displayPerson() {
		String testPersonId = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Max",
				"Mustermann"
		);
		IPerson person = personFactory.displayPerson(testPersonId);
		assertEquals(person.getDisplayName(), "Max Mustermann");
    }

    @org.junit.Test
    public void displayPersonByType() {
		String testPerson1Id = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jon",
				"Doe"
		);
		String testPerson2Id = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Jan",
				"Doe"
		);
		String testPerson3Id = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"James",
				"Bond"
		);
		List<IPerson> people = personFactory.displayPerson(PersonType.PERSONTYPE_NATURAL);
		assertEquals(people.size(), 3);
    }
}