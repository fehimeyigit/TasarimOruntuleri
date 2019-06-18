package Mediator;

public class UserImp extends User {

	public UserImp(IMediator med, String name) {
		super(med, name);
	}
/*
	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.TahlilSýraGöster(msg, this);
	}*/
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}


}
