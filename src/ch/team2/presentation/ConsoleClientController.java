package ch.team2.presentation;

import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.NaturalPersonMock;

public class ConsoleClientController {
    public static void createPersonWithoutScan(String personType) {
        //IPersonFactory personFactory = PersonFactory.getInstance();
        //IPerson person = personFactory.createPerson("Florian","Bohren");
        IPersonDAO person = null;
        if(personType.equals("natural")) {
            person = new NaturalPersonMock("Florian","Bohren");
        } else if(personType.equals("legalentity")) {
            //person = new LegalEntityMock("Florian","Bohren");
        } else if(personType.equals("user")) {
            //person = new UserMock("Florian","Bohren");
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
