package observer;

public class Hasta2 implements Observer {
	private Observable observable;

    public Hasta2() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + " Hasta2 Mesaj Geldi.");
    }

    public void removeHastaObserver(){
        observable.removeHastaObserver(this);
    }
	
	
	
	

}
