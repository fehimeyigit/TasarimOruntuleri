package singleton;

public class Doktor extends Person{

	private String speciality="SPECIALITY";
	public Doktor(String Tc, String Ad, String Soyad,String spec) {
		super(Tc, Ad, Soyad);
		// TODO Auto-generated constructor stub
		
		this.setSpeciality(spec);
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
