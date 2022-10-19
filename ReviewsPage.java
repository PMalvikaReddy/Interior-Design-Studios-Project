package InteriorDesignStudios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReviewsPage implements ActionListener {
	JFrame frame=new JFrame();
	JTextField textfield;
	JLabel label,label1,msg;
	JButton submit;
	JCheckBox checkbox;
	ImageIcon image;
	JLabel labelimage;
	ReviewsPage(){
		image=new ImageIcon("C:/Users/Malvika/Desktop/interior_image_150.jpg");
		label=new JLabel("Thanks for choosing from our services.");
		label.setFont(new Font("segoe print",Font.BOLD,15));
		label1=new JLabel("Write your review here.");
		label1.setFont(new Font("segoe print",Font.BOLD,15));
		textfield=new JTextField();
		textfield.setPreferredSize(new Dimension(400,50));
		submit =new JButton("Submit");
		submit.setFocusable(false);
		//checkbox=new JCheckBox("Click here to submit your review");
		//checkbox.setFocusable(false);
		//checkbox.setFont(new Font("Consolas",Font.PLAIN,15));
		labelimage =new JLabel();
		labelimage.setIcon(image);
		
		submit.addActionListener(this);
		//checkbox.addActionListener(this);
		
		msg=new JLabel("");
		
	frame.add(labelimage);
	frame.add(label);
	frame.add(label1);
	frame.add(textfield);
	//frame.add(checkbox);
	//frame.add(msg);
	frame.add(submit);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(450,500);
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
}
	@Override
	public void actionPerformed(ActionEvent e) {
		BufferedWriter buffwriter=null;
		/*if(checkbox.isSelected()) {
			msg.setText("Click submit now");
		}*/
		if(e.getSource()==submit) {
			String review=textfield.getText();
			try {
				buffwriter=new BufferedWriter(new FileWriter(new File("C:/Users/Malvika/Desktop/4th_sem_mini_project/reviews.txt"),true));
				buffwriter.write("Review: "+ review+"\n");
				System.out.println("review submitted");
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
		}
			frame.dispose();
		}new MenuPage();
	}
}  
	

