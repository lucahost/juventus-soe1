package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;

public interface IPersonDAOFactory {

	IPersonDAO createPerson(IPerson personData);

	IPersonDAO getPerson(int personId);
}
