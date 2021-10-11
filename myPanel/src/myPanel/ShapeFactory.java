package myPanel;

public class ShapeFactory {
	
	public static Shape getShape(char sl) {
		Shape res;
		int randomWidth = 20 + (int) Math.ceil(Math.random()*35);
		if (sl == 'c') {res = new Circle(randomWidth);}
		else if(sl == 's') {res = new Square(randomWidth);}
		else {
			int randomHeight = 20 + (int) Math.ceil(Math.random()*35);
			res = new Rectangle(randomWidth,randomHeight);
		}
		return res;
	}
}
