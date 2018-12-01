package ch.team2.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ch.team2.business.person.IPerson;
import ch.team2.business.person.IPersonFactory;
import ch.team2.business.person.PersonFactory;
import ch.team2.persistence.person.IPersonDAO;
import ch.team2.persistence.person.NaturalPersonMock;

/**
 * Class used to display data
 * Could be replaced due future plans with GUI
 * @author Luca Hostettler
 * @author Marc Bischoff
 * @auhor Florian Bohren
 */
public class ConsoleClient {

    // attributes

    // constructor

    // methods

    /**
     * Initial point
     * @param args
     */
    public static void main(String[] args) throws IOException {    
    	try{
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	System.out.println("Bitte geben Sie den Personentyp ein (natural, legalentity, user)");
	    	String personenTyp = br.readLine();
	    	createPersonWithoutScan(personenTyp); 
	    	//createPersonWithScan();
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
    }
    
    public static void createPersonWithoutScan(String personenTyp) {
        System.out.println("start createPerson");
        
        //IPersonFactory personFactory = PersonFactory.getInstance();
        //IPerson person = personFactory.createPerson("Florian","Bohren");
        IPersonDAO person = null;
        if(personenTyp.equals("natural")) {
        	person = new NaturalPersonMock("Florian","Bohren");            
        } else if(personenTyp.equals("legalentity")) {
        	//person = new LegalEntityMock("Florian","Bohren");
        } else if(personenTyp.equals("user")) {
        	//person = new UserMock("Florian","Bohren");
        }
        if(person != null) {
        	System.out.println("createPerson erfolgreich abgeschlossen. Neue Person: " + person.getDisplayName());
        } else {
        	System.out.println("Fehler, keine Person wurde erstellt.");
        }
        
    }
    
    public static void createPersonWithScan() {
    	// get console values
    }
    
}

