package Iterator;
/**
	 * Concrete iterator
	 */
public class PoliklinikIterator implements Iterator {

	
	
	
	    private PolikliniCollection collection = new PolikliniCollection();
	    private String[] poliklinikler = collection.getPoliklinik();
	    private int index =0 ;

	    @Override
	    public boolean hasNext() {
	        return index < poliklinikler.length;
	    }

	    @Override
	    public Object next() {
	        return this.hasNext() ? poliklinikler[index++]:null;
	    }
	
	
	
	
	
	
	
	
	
	
}
