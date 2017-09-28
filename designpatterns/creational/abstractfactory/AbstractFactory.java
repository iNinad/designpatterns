package designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}
