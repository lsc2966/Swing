package swing;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Swing01 extends JFrame {
	
	public Swing01(){
	JFrame f;    
	JButton b = new JButton("click");//create button  
	b.setBounds(130,100,100,40);  
	          
	add(b);//adding button on frame  
	setSize(400,500);  
	setLayout(null);  
	setVisible(true);  
	}
	public static void main(String[] args) {
		
		new Swing01();  

	}

}
