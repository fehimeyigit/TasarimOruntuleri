package decorator;

public class MRI extends TetkikDecorator {

	 public MRI(ITetkik tetkik) {
	        super(tetkik);
	    }
	     
	    public String decorate() {
	        return super.decorate() + decorateMRI();
	    }
	     
	    private String decorateMRI() {
	        return " MRI";
	    }
	
	
	
}
