package designpatterns.creational.builder;

public class VegBurger extends Burger{
	@Override
	public String name(){
		return "Veg Burger";
	}
	
	@Override 
	public float price(){
		return 2.00f;
	}
}
