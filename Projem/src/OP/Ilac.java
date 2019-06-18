package OP;



public class Ilac {
 
	private String name;
	private long no;
	
	public Ilac(String name,long no) {
		this.name = name;
		this.no = no;
	}
	
	public Ilac() {
		name ="";
		no=0;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public long getNo() {
		return no;
	}
 
	public void setNo(long no) {
		this.no = no;
	}
 
	@Override
	public String toString() {
		return "Ilac [name=" + name + ", no=" + no + "]";
	}
}
 
