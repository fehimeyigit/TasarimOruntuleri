package singleton;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiating Singleton class with variable x 
        Hospital x = Hospital.getInstance(); 
        Hospital Y = Hospital.getInstance(); 
        Hospital Z = Hospital.getInstance(); 
		System.out.println(" " +x); 
		System.out.println(" " +Y); 
		System.out.println(" " +Z); 
		
		Hasta hasta = new Hasta("123456789", "Fehime", "Yigit", 7);
		
		System.out.printf(hasta.Tc+" "+hasta.Ad+" "+hasta.Soyad);
		
		System.out.println(" ");
		
		Doktor dr = new Doktor("983455566", "Tuba", "Çetiner", "x");
		
		System.out.println(dr.Tc+" "+dr.Ad+" "+dr.Soyad);
		
		
	}

}
