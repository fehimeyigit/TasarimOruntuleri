package OP;

public class Main {

	public static void main(String[] args) {
		ObjectPool pool = ObjectPool.getInstance();
		Ilac malzeme1 =pool.getObject();
		malzeme1.setName("Parol");
		malzeme1.setNo(1212);
		
		System.out.println("Ýlaç 1: "+malzeme1.toString());
		
		Ilac malzeme2 = pool.getObject();
		malzeme2.setName("Aferin");
		malzeme2.setNo(123);
		System.out.println("Ýlaç 2: "+malzeme2.toString());
		
		
	}

}
