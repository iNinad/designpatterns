package designpatterns.creational.singleton;

public class SingleObject {
	int checkNumber;
	private static SingleObject instance = new SingleObject();
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello world!");
	}
	
	public void setNumber(int value){
		checkNumber = value;
	}
	
	public int getNumber(){
		return checkNumber;
	}
	
}
