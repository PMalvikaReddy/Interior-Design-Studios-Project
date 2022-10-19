package InteriorDesignStudios;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MenuPage implements ActionListener {
	
	JFrame frame=new JFrame();
	JLabel label1;
	JLabel label2,label5;
	JLabel label3,label4;
	JButton buttonoption0;
	JButton buttonoption1;
	JButton buttonoption2;
	JButton buttonoption3;
	JButton buttonoption4;
	JButton buttonoption5,buttonoption6;
	ImageIcon image;
	JLabel labelimage;
	
	MenuPage(){
		image=new ImageIcon("C:/Users/Malvika/Desktop/interior_image_125.jpg");
		label4=new JLabel("Choose from our wide range of offerings and services: ");
		label4.setFont(new Font("segoe print",Font.BOLD,15));
		label1=new JLabel("1. Click here to get a free consultation");
		label1.setFont(new Font("comic sans ms",Font.ITALIC,15));
		//welcomelabel.setBounds(0, 0, 200, 35);
		//label3=new JLabel("\n");
		label2=new JLabel("2.What service are you looking for?");
		label2.setFont(new Font("comic sans ms",Font.ITALIC,15));
		
		label3=new JLabel("3.Liked our service,tell us what you like the most");
		label3.setFont(new Font("comic sans ms",Font.ITALIC,15));
		
		label5=new JLabel("4.Do you want to exit the page? Then click here.");
		label5.setFont(new Font("comic sans ms",Font.ITALIC,15));
		
		buttonoption0=new JButton("Click Here");
		buttonoption0.setFocusable(false);
		//buttonoption1=new JButton("Check colour combinations for living room");
		//buttonoption1.setFocusable(false);
		buttonoption2=new JButton("Customize your kitchen interiors");
		buttonoption2.setFocusable(false);
		buttonoption3=new JButton("Design your wardrobe");
		buttonoption3.setFocusable(false);
		//buttonoption4=new JButton("Design your bedroom");
	//	buttonoption4.setFocusable(false);
		buttonoption5=new JButton("Write a review");
		buttonoption5.setFocusable(false);
		buttonoption6=new JButton("EXIT(click here)");
		buttonoption6.setFocusable(false);
		
		buttonoption0.addActionListener(this);
		//buttonoption1.addActionListener(this);
		buttonoption2.addActionListener(this);
		buttonoption3.addActionListener(this);
		//buttonoption4.addActionListener(this);
		buttonoption5.addActionListener(this);
		buttonoption6.addActionListener(this);
		
		labelimage =new JLabel();
		labelimage.setIcon(image);
		
		frame.add(labelimage);
		frame.add(label4);
		frame.add(label1);
		frame.add(buttonoption0);
		frame.add(label2);
		//frame.add(buttonoption1);
		frame.add(buttonoption2);
		frame.add(buttonoption3);
		//frame.add(buttonoption4);
		frame.add(label3);
		frame.add(buttonoption5);
		frame.add(label5);
		frame.add(buttonoption6);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonoption0) {
			System.out.println("Get a free consulation option has been selected");
			frame.dispose();
			new ConsultationPage();
		}
		//if(e.getSource()==buttonoption1) {
		//	System.out.println("Check colour combinations for living room option has been selected");
		//}
		if(e.getSource()==buttonoption2) {
			System.out.println("Customize your kitchen interiors options has been selected");
			frame.dispose();
			new Page5_CustomizationKitchenPage();
		}
		if(e.getSource()==buttonoption3) {
			System.out.println("Design your wardrobe option has been selected");
			frame.dispose();
			new Page6_WardrobePage();
		}
		//if(e.getSource()==buttonoption4) {
			//System.out.println("Design your bedroom option has been selected");
		//}
		if(e.getSource()==buttonoption5) {
			System.out.println("Write a review option has been selected");
			ReviewsPage review =new ReviewsPage();
			frame.dispose();
		}
		if(e.getSource()==buttonoption6) {
			System.out.println("You have exited");
			frame.dispose();
	}

}}
