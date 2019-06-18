package decorator;

public abstract class TetkikDecorator implements ITetkik{

	 private ITetkik tetkik;
     
	    public TetkikDecorator(ITetkik tetkik) {
	    	 this.tetkik = tetkik;
	}

		// standard constructors
	    @Override
	    public String decorate() {
	        return tetkik.decorate();
	    }
	
	
	
	
}
