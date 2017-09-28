package designpatterns.creational.singleton;

public class SingletonDemo {
	public static void main(String[] args){
		SingleObject singleInstance = SingleObject.getInstance();
		singleInstance.showMessage();
		
		singleInstance.setNumber(5);
		System.out.println(singleInstance.getNumber());
		
		SingleObject otherInstance = SingleObject.getInstance();
		System.out.println(otherInstance.getNumber());
		
		singleInstance.setNumber(10);
		
		System.out.println(otherInstance.getNumber());
		
	}
}
