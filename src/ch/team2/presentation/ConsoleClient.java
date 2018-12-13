package ch.team2.presentation;

import ch.team2.business.PersonType;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.NaturalPersonData;
import ch.team2.business.person.PersonFactory;
import ch.team2.persistence.person.IPersonDAO;


/**
 * Class used to display data
 * Could be replaced due future plans with GUI
 *
 * @author Luca Hostettler
 * @author Marc Bischof
 * @author Florian Bohren
 */
public class ConsoleClient {

	/**
	 * Initial point
	 *
	 * @param args
	 */
	public static void main(String[] args) {


        IPersonFactory personFactory = PersonFactory.getInstance();
        IPersonDAO person1 = personFactory.createPerson(
                PersonType.PERSONTYPE_NATURAL,
                "Florian",
                "Bohren"
        );
        IPersonDAO person2 = personFactory.createPerson(
                PersonType.PERSONTYPE_NATURAL,
                "Luca",
                "Hostettler"
        );

        System.out.println("Folgende Personen wurden erstellt:");
        System.out.println(personFactory.displayPerson(0));
        System.out.println(personFactory.displayPerson(1));
    }
}
