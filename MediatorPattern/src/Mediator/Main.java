package Mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMediator mediator = new TahlilS�ras�();
		User user1 = new UserImp(mediator, "Ali Esen");
		User user2 = new UserImp(mediator, "Lisa Parlak");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
	
		
		user1.receive("S�raNO:55");
		user2.receive("S�ra No:56");

	}

}
