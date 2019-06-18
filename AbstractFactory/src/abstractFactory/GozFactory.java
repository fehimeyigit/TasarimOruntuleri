package abstractFactory;

public class GozFactory implements IPoliklinikFactory{

	@Override
	public IDoktor CreateDoctor() {
		// TODO Auto-generated method stub
		
		return new Doktor.GozDoktoru();
	}

	@Override
	public IHemsire CreateHemsire() {
		// TODO Auto-generated method stub
		return new Hemsire.GozHemsiresi();
	}

   
	
	
	
	
}
