package observer;
/*Randevu alýp iþlem yaptýracak hastalara hatýrlatma*/

/*duyurular bu interface üzerinden yayýlacak*/
public interface Observer {
	void notify(String message);
}
