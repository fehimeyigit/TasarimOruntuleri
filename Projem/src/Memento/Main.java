package Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      originator.setState("Hasta1");
	      originator.setState("Hasta2");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("Hasta3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("Hasta4");
	      System.out.println("Muayenedeki Hasta: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("Ýþlemi Yapýlan Hasta: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Ýþlemi Yapýlacak Hasta: " + originator.getState());
		
		
	}

}
