package designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType){
		if (shapeType == null){
			return null;
		}
		else if (shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		else if (shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color){
		return null;
	}

}
