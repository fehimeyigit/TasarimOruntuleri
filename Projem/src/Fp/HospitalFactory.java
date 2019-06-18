package Fp;


public class HospitalFactory {


	    public static Iperson createPerson(Class aClass) throws IllegalAccessException, InstantiationException {
	            return (Iperson) aClass.newInstance();
	    
	}
}

