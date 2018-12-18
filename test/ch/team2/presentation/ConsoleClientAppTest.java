package ch.team2.presentation;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.business.person.PersonType;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ConsoleClientAppTest {
	private IPersonFactory personFactory;

	@Before
	public void setUp() throws Exception {
		personFactory = PersonFactory.getInstance();
	}

	@Test
	public void main(){
		ConsoleClientApp.main(null);
	}

	@Test
	public void createPerson() {
		String testPersonId = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Max",
				"Mustermann"
		);
		assertNotNull(testPersonId);
	}

	@Test
	public void displayPerson() {
		String testPersonId = personFactory.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Max",
				"Mustermann"
		);
		IPerson person = personFactory.displayPeople(testPersonId);
		assertEquals(person.getDisplayName(), "Max Mustermann");
	}

	@Test
	public void displayPeopleByTypeFromApp() {
		ConsoleClientApp app = new ConsoleClientApp();
		app.createPerson(
				PersonType.PERSONTYPE_NATURAL,
				"Max",
				"Mustermann"
		);
		List<IPerson> people = app.displayPeopleByType(PersonType.PERSONTYPE_NATURAL);
		assertTrue(people.size() > 0);
	}

	@Test
	public void displayPeopleByType() {
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
		List<IPerson> people = personFactory.displayPeople(PersonType.PERSONTYPE_NATURAL);
		assertTrue(people.size() > 0);
	}
}