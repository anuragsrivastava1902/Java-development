package projects;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame {

	private JLabel heading;
	private JLabel clockLabel;
	
	private Font font = new Font("",Font.BOLD,35);
	
	MyWindow(){
		super.setTitle("My clock");
		super.setSize(550,400);
		super.setLocation(430,200);
		this.createGui();
		this.startClock();
		super.setVisible(true);
	}
	
	public void createGui() {
		heading = new JLabel("My clock");
		clockLabel = new JLabel("clock");
		
		heading.setFont(font);
		clockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(heading);
		this.add(clockLabel);
	}
	
	public void startClock() {
		
	
		ActionListener action = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		          //...Perform a task...
		    	  
		   //String dateTime = new Date().toLocaleString();
		   
		   Date d = new Date();
		   SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a, E, dd-LL-Y");
		   String dateTime = sdf.format(d);
		   clockLabel.setText(dateTime);
		   
		      }
		  };

		Timer t = new Timer(1,action) ;
		t.start();
		
}
}
	