package observer;

public class Hasta1 implements Observer {

	    private Observable observable;

	  
	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + " Hasta1 Mesaj Geldi.");
		
	}
	
	

    public void removeHastaObserver(){
        observable.removeHastaObserver(this);
    }


}
