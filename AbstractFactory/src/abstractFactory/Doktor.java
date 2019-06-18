package abstractFactory;

public class Doktor {

	
	 public static class DermotolojiDoktoru implements IDoktor
	    {
			@Override
			public String GetDoctor() {
				// TODO Auto-generated method stub
				return "Tuðba Çetin";
			}
	    }
	    
	 public static class GozDoktoru implements IDoktor
	    {

		@Override
		public String GetDoctor() {
			// TODO Auto-generated method stub
			return "Ali Akar";
		}
	        
	    }
	    
	  
	
	 public static class DahiliyeDoktoru implements IDoktor
	    {

		@Override
		public String GetDoctor() {
			// TODO Auto-generated method stub
			return "Mehmet Gürsoy";
		}
	        
	    }
	    
	
	
	
	
}
