package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;

import java.util.List;

public interface IPersonDAOFactory {

	IPersonDAO createPerson(IPerson personData);

	IPersonDAO getPerson(String personId);

	List<IPersonDAO> getPeople();
}
