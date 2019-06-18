package Fp;

import Fp.HospitalFactory;

public class Main {

	 public static void main(String[] args) {

	        try {
	        	Hemsire dr = (Hemsire) HospitalFactory.createPerson(Hemsire.class);
	            
	            dr.AdSoyad();

	            Hasta hasta = (Hasta) HospitalFactory.createPerson(Hasta.class);
	            hasta.AdSoyad();
                hasta.Yas(23);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
}
