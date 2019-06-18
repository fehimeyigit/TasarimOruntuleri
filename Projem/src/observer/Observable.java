package observer;
/*Observable interface’i ise duyuru sisteminde ki kullanýcýlarýn temsili olarak düþünebilirsiniz.*/
public interface Observable {

	void addHastaObserver(Observer observer);
    void removeHastaObserver(Observer observer);
    void notifyHastaObserver();
	
	
}
