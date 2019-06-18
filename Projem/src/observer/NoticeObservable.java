package observer;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {

	
	 private List<Observer> observerList = new ArrayList<>();
	    private String message = "Notice... !";
	
	@Override
	public void addHastaObserver(Observer observer) {
		// TODO Auto-generated method stub
		// Hastalarý duyuruya eklemek için
		observerList.add(observer);
	}

	@Override
	public void removeHastaObserver(Observer observer) {
		// TODO Auto-generated method stub
		//Hastalarý duyurudan silmek için.
		 observerList.remove(observer);
		
	}

	@Override
	public void notifyHastaObserver() {
		// Duyuruya kayýtlý hastalara mesaj göndermek için.
		
		for (Observer observer : observerList) {
            observer.notify(message); 
        }
		
		
		
		
	}

}
