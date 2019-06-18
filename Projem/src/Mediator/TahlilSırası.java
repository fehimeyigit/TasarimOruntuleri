package Mediator;

import java.util.ArrayList;
import java.util.List;

public class TahlilS�ras� implements IMediator{

private List<User> users;
	
	public TahlilS�ras�(){
		this.users=new ArrayList<>();
	}
	
	
	
	@Override
	public void TahlilS�raG�ster(String msg, User user) {
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
