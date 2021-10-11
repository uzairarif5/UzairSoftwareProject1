package myPanel;
import java.awt.Color;
import java.util.Random;

abstract class Shape {
	public static char[] shapes = {'c','s','r'};
	public String name;
	public int width;
	public int height;
	public Color color;
	
	public Shape(int w) {
		this.width = w;
		this.height = w;
		Random rand = new Random();
		this.color = new Color(rand.nextFloat()/2, rand.nextFloat()/2,rand.nextFloat()/2);;
	}
	public abstract float calArea();
}
