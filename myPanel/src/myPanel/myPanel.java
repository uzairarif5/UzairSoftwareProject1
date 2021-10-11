package myPanel;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;    

public class myPanel {
	public static ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public static void main(String[] args) {  
	    JFrame f = new JFrame("Display Shapes");  
	    JButton b1 = new JButton("Load Shapes");  
	    JButton b2 = new JButton("Sort Shapes");  
	    b1.setBounds(140,50,150,30);  
	    b2.setBounds(310,50,150,30);  
	    f.add(b1);
	    f.add(b2);
	    
        JPanel shapePanel = drawingCanvas.getInstance();
        shapePanel.setBounds(0,100,600,400);
        shapePanel.setBackground(Color.LIGHT_GRAY);
	    f.add(shapePanel);
	    
	    f.setSize(600,600);  
	    f.setLayout(null);  
	    f.setVisible(true);   

	    b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
	    	myPanel.shapes.clear();
	    	for (int i = 0; i < 6;i++) {
	    		Shape s = ShapeFactory.getShape(Shape.shapes[(int) Math.floor(Math.random() * 3)]);
	    		myPanel.shapes.add(s);
	    	}
		    f.revalidate();
		    f.repaint();
	    }});
	    
	    b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
	    	if(!myPanel.shapes.isEmpty()) {
	    		SortingTechnique.sort(myPanel.shapes);
			    f.revalidate();
			    f.repaint();
	    	}
	    }});
	} 

}
