package ch.team2.persistence.person;

import ch.team2.business.person.IPerson;

import java.util.List;

/**
 * Interface for the PersonDAOFactory
 */
public interface IPersonDAOFactory {

	/**
	 * Declares a method to create and store a person
	 * @param personData
	 * @return <IPersonDAO>personMock</IPersonDAO>
	 */
	IPersonDAO createPerson(IPerson personData);

	/**
	 * Declares a method to return a personMock by personId
	 * @param personId
	 * @return <IPersonDAO>personMock</IPersonDAO>
	 */
	IPersonDAO getPerson(String personId);

	/**
	 * Declares a method to return all people
	 * @return <List><IPersonDAO>dbPeople</IPersonDAO></List>
	 */
	List<IPersonDAO> getPeople();
}
