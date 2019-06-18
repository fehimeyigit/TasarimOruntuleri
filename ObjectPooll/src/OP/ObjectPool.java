package OP;
/*

import java.util.ArrayList;

public class ObjectPool {
	
	private static ObjectPool instance = new ObjectPool(); 
	private int maxObject;
	private int currentSize;
	
	private ObjectPool() {
		maxObject =2;
		currentSize =0;
	}
	
	public static ObjectPool getInstance() {
		return instance;
	}
	
	public Student getObject() {
		
		if(currentSize >= maxObject) {
			return null; //or throws exceptions 
		}
		currentSize ++;
		return new Student();
	}
}*/



import java.util.ArrayList;

public class ObjectPool {
	
	private static ObjectPool instance = new ObjectPool(); 
	private int maxObject;
	
	private ArrayList <Ilac> availableObjects;
	private ArrayList <Ilac> busyObjects;
	
	private  int i=-1;
	
	private ObjectPool() {
		maxObject =2;
		availableObjects = new ArrayList <Ilac>();
		busyObjects = new ArrayList <Ilac>(maxObject);
	}
	
	public static ObjectPool getInstance() {
		return instance;
	}
	
	public Ilac getObject() {
		if(busyObjects.size() >= maxObject) {
			return null;
		}
		busyObjects.add(new Ilac());
		i++;
		return busyObjects.get(i);
	}
	
	public void reliaseObject(Ilac obj){
		
		if(availableObjects.size()== maxObject) {
			i--;
			availableObjects.add(obj);
			busyObjects.remove(obj);
		}else
		System.out.println("size error");
		
	}
	
	public void setPoolSize(int i) {
		maxObject = i;
		 // or you can write a method including a way that increase the pool size
		
	}
	public int getbusySize() {
		return busyObjects.size();
	}
	
	public int getAvSize() {
		return availableObjects.size();
	}
}