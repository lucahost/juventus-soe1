package ch.team2.business.person;

/**
 * Class used to create people
 */
public class PersonFactory implements IPersonFactory {

    // attributes
    private static PersonFactory ourInstance = new PersonFactory();

    // constructor
    private PersonFactory() {
    }

    // methods
    public static PersonFactory getInstance() {
        return ourInstance;
    }
}
