package abstractFactory;

public class Hospital {

	  
	 private IDoktor _doktor;
	 private IHemsire _hemsire;   
	    public Hospital(IPoliklinikFactory factory) {
	        this._doktor = factory.CreateDoctor();
	        this._hemsire = factory.CreateHemsire();
	    }
	    
	    public final String GetDoktor() {
	        return this._doktor.GetDoctor();
	    }
	
	    public final String GetHemsire() {
	        return this._hemsire.GetHemsire();
	    }
	
	
}
