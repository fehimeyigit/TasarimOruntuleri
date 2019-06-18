package Iterator;

/**
 * 
 * 
 * @author FEHÝME
 *
 */


/**
 * 
 *client
 *
 */
public class Main {

	 public static void main(String[] args) {
	        Container collection = new PolikliniCollection();

	        for (Iterator i = collection.getIterator();i.hasNext();){
	            String poliklinik = (String)i.next();
	            System.out.println(poliklinik);
	        }
	    }

}
