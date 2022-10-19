package InteriorDesignStudios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ConsultationPage implements ActionListener{
	
		//private static final String String = null;
		JFrame frame=new JFrame();
		JLabel label1,label2,label3,label4,label5,msg;
		JRadioButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
		JButton submit;
		JTextField name,mailid,contact;
		JCheckBox checkbox;
		ImageIcon image;
		JLabel labelimage;
		
		ConsultationPage(){
			image=new ImageIcon("C:/Users/Malvika/Desktop/interior_image_150.jpg");
			label1=new JLabel("1. Let's get started.Tell us a little about your home.");
			label1.setFont(new Font("comic sans ms",Font.ITALIC,15));
			button1=new JRadioButton("1BHK");
			button2=new JRadioButton("2BHK");
			button3=new JRadioButton("3BHK");
			button4=new JRadioButton("Villa/Independent House");
			
			label2=new JLabel("2.In which city is this home located in?");
			label2.setFont(new Font("comic sans ms",Font.ITALIC,15));
			button5=new JRadioButton("Bangalore");
			button6=new JRadioButton("Mumbai");
			button7=new JRadioButton("Chennai");
			button8=new JRadioButton("Pune");
			button9=new JRadioButton("Hyderabad");
			button10=new JRadioButton("Kolkata");
			button11=new JRadioButton("Mysore");
			
			label3=new JLabel("3.Please enter your name");
			label3.setFont(new Font("comic sans ms",Font.ITALIC,15));
			name=new JTextField("\n");
			name.setPreferredSize(new Dimension(200,30));
			
			label4=new JLabel("4.Enter your email id");
			label4.setFont(new Font("comic sans ms",Font.ITALIC,15));
			mailid=new JTextField();
			mailid.setPreferredSize(new Dimension(200,30));
			
			label5=new JLabel("5.Enter your contact number, so we can fix an appointment");
			label5.setFont(new Font("comic sans ms",Font.ITALIC,15));
			contact=new JTextField();
			contact.setPreferredSize(new Dimension(200,30));
			
			checkbox=new JCheckBox("Please accept the terms and conditions");
			checkbox.setFocusable(false);
			checkbox.setFont(new Font("Consolas",Font.PLAIN,15));
			submit=new JButton("SUBMIT");
			submit.setFocusable(false);
			
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			button10.addActionListener(this);
			button11.addActionListener(this);
			checkbox.addActionListener(this);
			submit.addActionListener(this);	
			labelimage =new JLabel();
			labelimage.setIcon(image);
			
			msg=new JLabel("");
			
			ButtonGroup group1=new ButtonGroup();
			group1.add(button1);
			group1.add(button2);
			group1.add(button3);
			group1.add(button4);
			
			ButtonGroup group2=new ButtonGroup();
			group2.add(button5);
			group2.add(button6);
			group2.add(button7);
			group2.add(button8);
			group2.add(button9);
			group2.add(button10);
			group2.add(button11);
			
			frame.add(labelimage);
			frame.add(label1);
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.add(button4);
			frame.add(label2);
			frame.add(button5);
			frame.add(button6);
			frame.add(button7);
			frame.add(button8);
			frame.add(button9);
			frame.add(button10);
			frame.add(button11);
			frame.add(label3);
			frame.add(name);
			frame.add(label4);
			frame.add(mailid);
			frame.add(label5);
			frame.add(contact);
			frame.add(checkbox);
			frame.add(submit);
			frame.add(msg);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,600);
			frame.setVisible(true);
			frame.setLayout(new FlowLayout());
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		BufferedWriter buffwriter=null;
		{
		String mydata= new String();{
			if(e.getSource()==button1) {
				
				 mydata="1BHK";
			}else if(e.getSource()==button2) {
				
				 mydata="2BHK";
			}else if(e.getSource()==button3) {
				
				 mydata="3BHK";
		}else if(e.getSource()==button4) {
			
			 mydata="Independent House/Villa";
	}else if(e.getSource()==button5) {
		
		 mydata="Bangalore";
	}else if(e.getSource()==button6) {
		
		 mydata="Mumbai";
}else if(e.getSource()==button7) {
	
	 mydata="Chennai";
}else if(e.getSource()==button8) {
	
	 mydata="Pune";
}else if(e.getSource()==button9) {
	
	 mydata="Hyderabad";
}else if(e.getSource()==button10) {
	
	 mydata="Kolkata";
}else if(e.getSource()==button11) {
	
	 mydata="Mysore";
}
			
			try {
				buffwriter=new BufferedWriter(new FileWriter(new File("C:/Users/Malvika/Desktop/4th_sem_mini_project/consultation.txt"),true));
				buffwriter.write(mydata);
				System.out.println("append done");
			}catch(IOException e1)
			{
				System.out.println("I/O error occured");
			}
			finally
		{
		try {
			if(buffwriter !=null)
			{
				buffwriter.close();
			}
		
	}
		catch(IOException e1)
		{
			System.out.println("I/O error");
		}
		}}}
		{
		String namee=name.getText();
		try {
			buffwriter=new BufferedWriter(new FileWriter(new File("C:/Users/Malvika/Desktop/4th_sem_mini_project/consultation.txt"),true));
			buffwriter.write(namee+"\n");
			//System.out.println("name added");
		}catch(IOException e1)
		{
			System.out.println("I/O error occured");
		}
		finally
		{
	try {
		if(buffwriter !=null)
		{
			buffwriter.close();
		}
	
}
	catch(IOException e1)
	{
		System.out.println("I/O error");
	}
	}}
		{
		String mail=mailid.getText();
		try {
			buffwriter=new BufferedWriter(new FileWriter(new File("C:/Users/Malvika/Desktop/4th_sem_mini_project/consultation.txt"),true));
			buffwriter.write(mail+"\n");
			//System.out.println("mail id added");
		}catch(IOException e1)
		{
			System.out.println("I/O error occured");
		}
		finally
		{
	try {
		if(buffwriter !=null)
		{
			buffwriter.close();
		}
	
}
	catch(IOException e1)
	{
		System.out.println("I/O error");
	}
	}}
	{
		String mobile=contact.getText();
		try {
			buffwriter=new BufferedWriter(new FileWriter(new File("C:/Users/Malvika/Desktop/4th_sem_mini_project/consultation.txt"),true));
			buffwriter.write(mobile);
			//System.out.println("contact no added");
		}catch(IOException e1)
		{
			System.out.println("I/O error occured");
		}
		finally
		{
	try {
		if(buffwriter !=null)
		{
			buffwriter.close();
		}
	
}
	catch(IOException e1)
	{
		System.out.println("I/O error");
	}
	}}
if(checkbox.isSelected()) {
	msg.setText("Click submit now");
}
			if(e.getSource()==submit) {
				frame.dispose();
				new MenuPage();
			}
	}		
	}

