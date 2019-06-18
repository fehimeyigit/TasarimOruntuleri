package decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ITetkik tetkik1 = new MRI(new Tetkik());
		  System.out.println(tetkik1.decorate());
		      
		    ITetkik tetkik2 = new KanTahlili(new Tetkik());
		      
		    System.out.println(tetkik2.decorate());
		    
		
		
		
		

	}

}
