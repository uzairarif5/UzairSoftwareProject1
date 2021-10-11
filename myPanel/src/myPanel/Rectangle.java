package myPanel;

public class Rectangle extends Shape{
	
	public Rectangle(int w, int h) {
		super(w);
		// TODO Auto-generated constructor stub
		this.name = "rectangle";
		this.height = h;
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		float area = this.width*this.height;
		return area;
	}
	
}
