package designpatterns.creational.factory;

public class FactoryPatternApp {
	public static void main(String[] args){
		FactoryPattern factory = new FactoryPattern();
		Shape shape1 = factory.getShape("Square");
		shape1.draw();
		Shape shape2 = factory.getShape("Circle");
		shape2.draw();
		Shape shape3 = factory.getShape("Rectangle");
		shape3.draw();
	}

}
