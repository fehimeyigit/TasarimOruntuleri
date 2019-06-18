package decorator;

public class KanTahlili extends TetkikDecorator {

	
	public KanTahlili(ITetkik tetkik) {
        super(tetkik);
    }
     
    public String decorate() {
        return super.decorate() + decorateKanTahlili();
    }
     
    private String decorateKanTahlili() {
        return " KanTahlili";
    }
	
	
	
}
