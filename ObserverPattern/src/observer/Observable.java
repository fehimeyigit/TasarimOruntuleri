package observer;
/*Observable interface�i ise duyuru sisteminde ki kullan�c�lar�n temsili olarak d���nebilirsiniz.*/
public interface Observable {

	void addHastaObserver(Observer observer);
    void removeHastaObserver(Observer observer);
    void notifyHastaObserver();
	
	
}
