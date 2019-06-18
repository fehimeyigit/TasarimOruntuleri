package Mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMediator mediator = new TahlilSýrasý();
		User user1 = new UserImp(mediator, "Ali Esen");
		User user2 = new UserImp(mediator, "Lisa Parlak");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
	
		
		user1.receive("SýraNO:55");
		user2.receive("Sýra No:56");

	}

}
