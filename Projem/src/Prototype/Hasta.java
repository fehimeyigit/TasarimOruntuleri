package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Hasta implements Cloneable{

	 private List<String> hastaListesi;
	 
	    public Hasta() {
	    	hastaListesi = new ArrayList<String>();
	    }
	 
	    public Hasta(List<String> liste) {
	        this.hastaListesi = liste;
	    }
	 
	    public void hastaEkle() {
	 
	    	hastaListesi.add("Burak");
	    	hastaListesi.add("Ahmet");
	    	hastaListesi.add("Mehmet");
	    }
	 
	    public List<String> getHastaListesi() {
	        return hastaListesi;
	    }
	 
	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        List<String> uyeListesi = new ArrayList<String>();
	        for (String s : this.getHastaListesi()) {
	            uyeListesi.add(s);
	        }
	        return new Hasta(uyeListesi);
	    }
	
	
	
}
