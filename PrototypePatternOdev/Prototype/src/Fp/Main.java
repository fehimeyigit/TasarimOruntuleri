package Fp;

import java.util.List;



public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		 
		Hasta hastalar = new Hasta();
		hastalar.hastaEkle();
 
        Hasta yeniHasta = (Hasta) hastalar.clone();
        Hasta yeniHasta2 = (Hasta) hastalar.clone();
 
        List<String> list = yeniHasta.getHastaListesi();
        list.add("Ay�e");
 
        List<String> list1 = yeniHasta2.getHastaListesi();
        list1.remove("Ahmet");
 
        System.out.println("Kalp hastalar� Listesi:(2016) " + hastalar.getHastaListesi());
        System.out.println("Kalp Hastalar� Yeni Liste:(2017) " + list);
        System.out.println("Kalp Hastalar� Yeni Liste:(2018) " + list1);
 
    }
}
