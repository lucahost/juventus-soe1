package ch.team2.presentation;

import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.business.person.PersonType;
import ch.team2.persistence.person.IPersonDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleClientTest {

    @Test
    public void testConsoleClientCanCreatePerson() {
        IPersonFactory personFactory = PersonFactory.getInstance();

        String testPersonId = personFactory.createPerson(
                PersonType.PERSONTYPE_NATURAL,
                "Max",
                "Mustermann"
        );
        assertNotNull(testPersonId);
    }
}