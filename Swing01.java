package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Swing01 extends JFrame {
	
	public Swing01(){
	JFrame f;    
	//JButton b = new JButton("Click");//create button  
	initUI();
	          
	setSize(400,500);  
	setLayout(null);  
	setVisible(true);  
	}
	public void initUI(){
		JButton btn = new JButton("Click");
		btn.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
			public void actionPerformed(ActionEvent e){
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("Click"))
					btn.setText("Hello");
				else 
					btn.setText("Click");
			}
		});
		btn.setBounds(130,100,100,40);  
		add(btn);//adding button on frame  
	}
	
	public static void main(String[] args) {
		
		new Swing01();  

	}

}
