package abstractFactory;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
            IPoliklinikFactory goz = new GozFactory();
            IPoliklinikFactory dahiliye = new DahiliyeFactory();
            IPoliklinikFactory dermo = new DermotolojiFactory();
            
            System.out.println("Goz Polikiliniði Çalýþanlarý");
           Hospital hospital = new Hospital(goz);
           System.out.println(hospital.GetDoktor());
           System.out.println(hospital.GetHemsire());
           
           System.out.println("Dahiliye Polikiliniði Çalýþanlarý");
           Hospital hospital2 = new Hospital(dahiliye);
           System.out.println(hospital2.GetDoktor());
           System.out.println(hospital2.GetHemsire());
           
           System.out.println("Dermotoloji Polikiliniði Çalýþanlarý");
           Hospital hospital3 = new Hospital(dermo);
           System.out.println(hospital3.GetDoktor());
           System.out.println(hospital3.GetHemsire());
           
        }
    }

	
	
	
	

