package pack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image extends JFrame{
	
	ImageIcon img = new ImageIcon(getClass().getResource("sadge.jpg"));
	JLabel l = new JLabel(img);
	public Image() {
		add(l);
		
		//Window
		setTitle("Add Images");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		 new Image();
	}
}
