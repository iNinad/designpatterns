package designpatterns.structural.bridge;

public class Circle extends Shape{
	int x, y, radius;
	
	public Circle(int radius, int x, int y, DrawAPI drawAPI){
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw(){
		drawAPI.drawCircle(radius, x, y);
	}
}
