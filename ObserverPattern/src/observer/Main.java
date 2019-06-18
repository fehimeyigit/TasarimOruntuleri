package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Hasta1 hasta1 = new Hasta1();
	        Hasta2 hasta2 = new Hasta2();

	        NoticeObservable noticeObservable = new NoticeObservable();

	        hasta2.setObservable(noticeObservable);

	        noticeObservable.addHastaObserver(hasta1);
	        noticeObservable.addHastaObserver(hasta2);
	        noticeObservable.notifyHastaObserver();

	        hasta2.removeHastaObserver();
	        noticeObservable.notifyHastaObserver();
		
		
		
		
		
	}

}
