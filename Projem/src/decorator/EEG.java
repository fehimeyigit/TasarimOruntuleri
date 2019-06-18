package decorator;

public class EEG extends TetkikDecorator{

	public EEG(ITetkik tetkik) {
		super(tetkik);
		// TODO Auto-generated constructor stub
	}
	
	
    public String decorate() {
        return super.decorate() + decorateEEG();
    }
     
    private String decorateEEG() {
        return " EEG";
    }
	

}
