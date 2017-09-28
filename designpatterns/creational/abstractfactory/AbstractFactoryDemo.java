package designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[] args){
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("blue");
		color1.fill();
	}
}
