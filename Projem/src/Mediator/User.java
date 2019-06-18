package Mediator;

public abstract class User {
	protected IMediator mediator;
	protected String name;
	
	public User(IMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
//	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
