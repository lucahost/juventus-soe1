package ch.team2.presentation;

import ch.team2.business.Address;
import ch.team2.business.ContactMethod;
import ch.team2.business.PersonType;
import ch.team2.business.Relationship;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.NaturalPersonMock;

import java.util.Scanner;

public class ConsoleClientController {
	public static void createPerson(String personType) {
		IPersonFactory personFactory = PersonFactory.getInstance();
		IPersonDAO person = null;

		// Read Address Input from User
		Scanner console = new Scanner(System.in);
		String city = console.nextLine();
		int zipCode = console.nextInt();
		String street = console.nextLine();
		String houseNumber = console.nextLine();

		Address address = new Address(zipCode, city, street, houseNumber);

		System.out.println("Kontaktmethode:");
		System.out.println("1 - Email");
		System.out.println("2 - Telefon");
		System.out.println("3 - Post");
		System.out.println("");
		System.out.println("Bitte wählen Sie eine Option (z.B. 1): ");

		int contactMethod = console.nextInt();

		System.out.println("Beziehung:");
		System.out.println("1 - Mitarbeiter");
		System.out.println("2 - Sub-Unternehmen");
		System.out.println("3 - Partner");
		System.out.println("");
		System.out.println("Bitte wählen Sie eine Option (z.B. 1): ");

		int relationShip = console.nextInt();

		switch (personType) {
			case "1":
				person = personFactory.createPerson(PersonType.PERSONTYPE_NATURAL, address, ContactMethod.valueOf(contactMethod), Relationship.valueOf(relationShip));
				break;
			case "2":
				person = personFactory.createPerson(PersonType.PERSONTYP_LEGALENTITY, address, ContactMethod.valueOf(contactMethod), Relationship.valueOf(relationShip));
				break;
			case "3":
				person = personFactory.createPerson(PersonType.PERSONTYPE_USER, address, ContactMethod.valueOf(contactMethod), Relationship.valueOf(relationShip));
				break;
		}
		if (person != null) {
			System.out.println("Person " + person.getDisplayName() + " erfolgreich angelegt.\n");
		} else {
			System.out.println("Ein Fehler ist eingetreten, keine Person wurde angelegt.\n");
		}

	}

	public static void createPersonWithScan() {
		// get console values
	}
}
