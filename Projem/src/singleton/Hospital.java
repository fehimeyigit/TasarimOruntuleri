package singleton;

import java.util.HashMap;
import java.util.Map;

public class Hospital {

	private static Hospital instance; 
    private Hospital() 
    { 
    	
    } 
  
    // static method to create instance of Singleton class 
    public static Hospital getInstance() 
    { 
        if (instance == null) 
            instance = new Hospital(); 
  
        return instance; 
    } 
	private Map<String,Person> persons=new HashMap<String,Person>();
	
	private Person TryGetPerson(String Tc) {
		return persons.get(Tc);
		
	}
	
	private Doktor TryGetDoktor(String Tc) {
		Doktor doct;
		doct=(Doktor)TryGetPerson(Tc);
		return doct;
		
	}
	
	private Hasta TryGetHasta(String Tc) {
		Hasta hasta;
		hasta=(Hasta)TryGetPerson(Tc);
		return hasta;
		
	}
	
}

