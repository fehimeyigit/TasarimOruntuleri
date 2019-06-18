package builder;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Hasta A = new Hasta.Builder(12345688,"Ali","Acar")
	                .yas(25)
	                .Cinsiyet("Erkek")
	                .Adres("Akasya Acýbadem Ofis Kuleleri\n A Blok 24. Kat No:127\n Acýbadem Ýstanbul Turkey")
	                .HastaId(1)
	                .MedeniHal("Evli")
	                .build();

	        Hasta B = new Hasta.Builder(123456789,"Kevser", "Köse")
	                .yas(22)
	                .MedeniHal("Bekar")
	                .build();

	        Hasta C = new Hasta.Builder(145236987,"Merve", "Topal")
	                .yas(29)
	                .build();

	        System.out.println(A);
	        System.out.println(B);
	        System.out.println(C);
		
		
	}

}
