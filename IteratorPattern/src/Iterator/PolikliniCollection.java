package Iterator;

/**
 * concrete aggregate
 */


public class PolikliniCollection implements Container{

	
	private String[] poliklinik = {"Dermotoloji" , "Dahiliye" ,"Göz" , "Fizik Tedavi"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return  new PoliklinikIterator();
	}

	

    public String[] getPoliklinik(){
        return poliklinik;
    }
	
	
	
	
}
