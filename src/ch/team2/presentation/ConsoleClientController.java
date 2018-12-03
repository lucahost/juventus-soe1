package ch.team2.presentation;

import ch.team2.business.PersonType;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.NaturalPersonMock;

public class ConsoleClientController {
    public static void createPersonWithoutScan(String personType) {
        IPersonFactory personFactory = PersonFactory.getInstance();
        IPersonDAO person = null;
        switch (personType) {
            case "1":
                person = personFactory.createPerson(PersonType.PERSONTYPE_NATURAL, null, null, null);
                break;
            case "2":
                person = personFactory.createPerson(PersonType.PERSONTYP_LEGALENTITY, null, null, null);
                break;
            case "3":
                person = personFactory.createPerson(PersonType.PERSONTYPE_USER, null, null, null);
                break;
        }
        if(person != null) {
            System.out.println("Person " + person.getDisplayName() + " erfolgreich angelegt.\n");
        } else {
            System.out.println("Ein Fehler ist eingetreten, keine Person wurde angelegt.\n");
        }

    }

    public static void createPersonWithScan() {
        // get console values
    }
}
