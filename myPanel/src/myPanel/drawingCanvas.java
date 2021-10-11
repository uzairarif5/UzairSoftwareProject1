package myPanel;
import java.awt.Graphics;
import javax.swing.JPanel;


public class drawingCanvas extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private drawingCanvas() {}
	
	public static drawingCanvas getInstance() {
		return new drawingCanvas();
	}
	
	@Override
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	if(!myPanel.shapes.isEmpty()) {
		for (int i = 0; i < 6;i++) {
			Shape s = myPanel.shapes.get(i);
		  	g.setColor(s.color);
			if(s.name == "circle") {g.fillOval((60*i)+10, (60*i)+10,s.width,s.height);}
			else {g.fillRect((60*i)+10, (60*i)+10,s.width, s.height);}
		}
	}}
}