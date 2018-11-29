package ch.team2.persistence.person;

/**
 * Knows database access and methods
 * Used to create mocks
 */
public class PersonDAOFactory {
    // attributes
    private static PersonDAOFactory ourInstance = new PersonDAOFactory();

    // constructor
    private PersonDAOFactory() {
    }

    // methods
    public static PersonDAOFactory getInstance() {
        return ourInstance;
    }

}
