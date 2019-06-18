package abstractFactory;

public class Hemsire {

	public static class DermotolojiHemsiresi implements IHemsire
    {

		@Override
		public String GetHemsire() {
			// TODO Auto-generated method stub
			return "Gokce Almaz";
		}
		
    }
    
	public static class DahiliyeHemsiresi implements IHemsire
    {

		@Override
		public String GetHemsire() {
			// TODO Auto-generated method stub
			return "Sumeyye Dogan";
		}
		
    }
	
	
	public static class GozHemsiresi implements IHemsire
    {

		@Override
		public String GetHemsire() {
			// TODO Auto-generated method stub
			return "Ezgi Albayrak";
		}
		
    }
	
	
	
 
	
}
