package designpatterns.structural.bridge;

public class BridgePatternDemo {
	public static void main(String[] args){
		Shape redCircle = new Circle(10, 100, 100, new RedCircle());
		Shape greenCircle = new Circle(20, 130, 130, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
