package myPanel;

public class Circle extends Shape{

	public Circle(int w) {
		super(w);
		// TODO Auto-generated constructor stub
		this.name = "circle";
	}

	@Override
	public float calArea() {
		// TODO Auto-generated method stub
		float area = (float) (Math.pow((((float) this.width) / 2),2) * Math.PI);
		return area;
	}

}
