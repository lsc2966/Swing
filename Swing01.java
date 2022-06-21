package swing;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
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
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						URI uri = new URI("http://www.roseindia.net");
						desktop.browse(uri);
					} catch (Exception ex) {
					}
				} else {
				}
			}
		});
		btn.setBounds(130,100,100,40);  
		add(btn);//adding button on frame  
	}
	


	public static void main(String[] args) {
		
		new Swing01();  

	}

}
