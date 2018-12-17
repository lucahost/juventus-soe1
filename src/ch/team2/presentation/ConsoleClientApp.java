package ch.team2.presentation;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.business.person.PersonType;

import java.util.List;

public class ConsoleClientApp {
	public String createPerson(PersonType personType, String firstName, String lastName){
		IPersonFactory personFactory = PersonFactory.getInstance();
		return personFactory.createPerson(
				personType,
				firstName,
				lastName
		);
	}

	public void displayPerson(String personId){
		IPersonFactory personFactory = PersonFactory.getInstance();
		System.out.println(String.format("Person mit ID %s erstellt:", personId));
		IPerson person = personFactory.displayPerson(personId);
		System.out.println(person.getDisplayName());
	}

	public List<IPerson> displayPeopleByType(PersonType personType){
		IPersonFactory personFactory = PersonFactory.getInstance();
		System.out.println(String.format("Folgende Personen mit dem Typen '%s' in der DB", personType.getPascalCase()));
		List<IPerson> people = personFactory.displayPerson(personType);
		for(IPerson person: people){
			System.out.println(person.getDisplayName());
		}
		return people;
	}
}
