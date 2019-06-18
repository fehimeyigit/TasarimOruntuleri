package Mediator;

import java.util.ArrayList;
import java.util.List;

public class TahlilSırası implements IMediator{

private List<User> users;
	
	public TahlilSırası(){
		this.users=new ArrayList<>();
	}
	
	
	
	@Override
	public void TahlilSıraGöster(String msg, User user) {
		// TODO Auto-generated method stub
		
		for(User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}
		
	

	
	
	
	
	
	
	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}

}
