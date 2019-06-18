package abstractFactory;



public class DahiliyeFactory implements IPoliklinikFactory{

	@Override
	public IDoktor CreateDoctor() {
		// TODO Auto-generated method stub
		
		return new Doktor.DahiliyeDoktoru();
	}

	@Override
	public IHemsire CreateHemsire() {
		// TODO Auto-generated method stub
		return new Hemsire.DahiliyeHemsiresi();
	}

	
	
}
