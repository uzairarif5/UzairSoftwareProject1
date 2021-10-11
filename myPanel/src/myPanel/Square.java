package myPanel;

public class Square extends Shape{

	public Square(int w) {
		super(w);
		// TODO Auto-generated constructor stub
		this.name = "square";
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		float area = (float) Math.pow(((float) this.width),2);
		return area;
	}
	
}
