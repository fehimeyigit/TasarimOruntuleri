package singleton;

public class Hasta extends Person{

	private int mrn;
	public Hasta(String Tc, String Ad, String Soyad,int mrn) {
		super(Tc, Ad, Soyad);
		// TODO Auto-generated constructor stub
		
		this.mrn=mrn;
	}
	
	public int getmrn() {
		return mrn;
	}
	public void setmrn(int mrn) {
		this.mrn = mrn;
	}
	
	
	
}
