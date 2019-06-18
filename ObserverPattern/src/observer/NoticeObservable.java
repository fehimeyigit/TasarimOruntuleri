package observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {

	
	 private List<Observer> observerList = new ArrayList<>();
	    private String message = "Notice... !";
	
	@Override
	public void addHastaObserver(Observer observer) {
		// TODO Auto-generated method stub
		// Hastalar� duyuruya eklemek i�in
		observerList.add(observer);
	}

	@Override
	public void removeHastaObserver(Observer observer) {
		// TODO Auto-generated method stub
		//Hastalar� duyurudan silmek i�in.
		 observerList.remove(observer);
		
	}

	@Override
	public void notifyHastaObserver() {
		// Duyuruya kay�tl� hastalara mesaj g�ndermek i�in.
		
		for (Observer observer : observerList) {
            observer.notify(message); 
        }
		
		
		
		
	}

}
