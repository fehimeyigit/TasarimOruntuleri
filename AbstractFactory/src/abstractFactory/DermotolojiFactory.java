package abstractFactory;


public class DermotolojiFactory implements IPoliklinikFactory{

	@Override
	public IDoktor CreateDoctor() {
		// TODO Auto-generated method stub
		
		return new Doktor.DermotolojiDoktoru();
	}

	@Override
	public IHemsire CreateHemsire() {
		// TODO Auto-generated method stub
		return new Hemsire.DermotolojiHemsiresi();
	}

	
	
}
