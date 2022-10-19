package InteriorDesignStudios;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Page5_CustomizationKitchenPage implements ActionListener{
	
	JFrame frame=new JFrame();
	JRadioButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23;
	JLabel label1,label2,label3,label4,label5,label6;
	JButton submit;
	JComboBox combobox;
	
	Page5_CustomizationKitchenPage(){
		label1=new JLabel("1). Select the layout of your kitchen");
		label1.setFont(new Font("segoe print",Font.BOLD,14));
		/*button1=new JRadioButton("L-shaped");
		button2=new JRadioButton("parallel");
		button3=new JRadioButton("U-shaped");
		button4=new JRadioButton("U-shaped");*/
		String[] layout= {"L-shaped","parallel","U-shaped","Straight"};
		 combobox=new JComboBox(layout);
		
		label2=new JLabel("2). What kind of modular kitchen package would you prefer?");
		label2.setFont(new Font("segoe print",Font.BOLD,14));
		button5=new JRadioButton(" Essential package:Range with basic units and accessories.");
		button6=new JRadioButton("Premium package:Exquisite kitchen with sleek cabinets & fittings.");
		button7=new JRadioButton("Luxe package:Luxurious dream kitchen with swanky units.");
		
		label3=new JLabel("3). Materials for cabinets and shutters. Take your pick.");
		label3.setFont(new Font("segoe print",Font.BOLD,14));
		button8=new JRadioButton("HDFHMR:Has high strength and density");
		button9=new JRadioButton("MR Plywood:Is moisture and termite resistant.");
		button10=new JRadioButton("BWP Plywood:waterproof; withstands prolonged exposure to moisture.");
		
		label4=new JLabel("4). Pick a finish for base & wall cabinets");
		label4.setFont(new Font("segoe print",Font.BOLD,14));
		button11=new JRadioButton("Matte Laminate:smooth, durable finish for clean rich look.");
		button12=new JRadioButton("Anti-scratch Acrylic:Elegant, reflective, glossy scratch resistant");
		button13=new JRadioButton("Glossy PU:Slick look, high durability, and a polished finish.");
		
		label5=new JLabel("5). Select the on-site services you would require.");
		label5.setFont(new Font("segoe print",Font.BOLD,14));
		button14=new JRadioButton("Painting.");
		button15=new JRadioButton("Plumbing.");
		button16=new JRadioButton("Electrical.");
		button17=new JRadioButton("Tile work.");
		
		label6=new JLabel("5).Here comes the appliances. Your pick? ");
		label6.setFont(new Font("segoe print",Font.BOLD,14));
		button18=new JRadioButton("Hob.");
		button19=new JRadioButton("Chimney.");
		button20=new JRadioButton("Built in microwave.");
		button21=new JRadioButton("Refrigerator.");
		button22=new JRadioButton("Faucets and Sink.");
		button23=new JRadioButton("Dishwasher.");
		
		submit=new JButton("SUBMIT");
		submit.setFocusable(false);
		
		/*ButtonGroup group1=new ButtonGroup();
		group1.add(button1);
		group1.add(button2);
		group1.add(button3);
		group1.add(button4);*/
		
		ButtonGroup group2=new ButtonGroup();
		group2.add(button5);
		group2.add(button6);
		group2.add(button7);
		
		ButtonGroup group3=new ButtonGroup();
		group3.add(button8);
		group3.add(button9);
		group3.add(button10);
		
		ButtonGroup group4=new ButtonGroup();
		group4.add(button11);
		group4.add(button12);
		group4.add(button13);
		
		combobox.addActionListener(this);
		/*button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);*/
		
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);
		button21.addActionListener(this);
		button22.addActionListener(this);
		button23.addActionListener(this);
		submit.addActionListener(this);
		
		frame.add(label1);
		/*frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);*/
		frame.add(combobox);
		frame.add(label2);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(label3);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(label4);
		frame.add(button11);
		frame.add(button12);
		frame.add(button13);
		frame.add(label5);
		frame.add(button14);
		frame.add(button15);
		frame.add(button16);
		frame.add(button17);
		frame.add(label6);
		frame.add(button18);
		frame.add(button19);
		frame.add(button20);
		frame.add(button21);
		frame.add(button22);
		frame.add(button23);
		frame.add(submit);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource()==button1) {
			System.out.println("L-shaped kitchen optin selected");
		}if(e.getSource()==button2) {
			System.out.println("Parallel kitchen ooptin selected");
		}
		if(e.getSource()==button3) {
			System.out.println("Straight kitchen option selected");
		}
		if(e.getSource()==button4) {
			System.out.println("U-shaped kitchen option selected");
		}*/
		if(e.getSource()==combobox) {
			System.out.println("\n"+combobox.getSelectedItem()+" is selected\n");
		}
		if(e.getSource()==button5) {
			System.out.println("You chose the essential package option\n");
		}
		if(e.getSource()==button6) {
			System.out.println("You chose the premium package option\n");
		}
		if(e.getSource()==button7) {
			System.out.println("You chose the luxury package option\n");
		}
		if(e.getSource()==button8) {
			System.out.println("HDFHMR material option is selected\n");
		}if(e.getSource()==button9) {
			System.out.println("MR plywood material option is selected\n");
		}if(e.getSource()==button10) {
			System.out.println("BWP waterproof plywood option has been selected\n");
		}if(e.getSource()==button11) {
			System.out.println("Matte laminate finish option has been selected\n");
		}if(e.getSource()==button12) {
			System.out.println("Anti scratch acrylic finish option has been selected\n");
		}if(e.getSource()==button13) {
			System.out.println("Glossy PU finish option has been selected\n");
		}if(e.getSource()==button14) {
			System.out.println("You opted for painting services");
		}if(e.getSource()==button15) {
			System.out.println("You opted for plumbing services");
		}if(e.getSource()==button16) {
			System.out.println("You opted for electrical services");
		}if(e.getSource()==button17) {
			System.out.println("You opted for tile work serivces");
		}if(e.getSource()==button18) {
			System.out.println("You chose Hob appliance");
		}if(e.getSource()==button19) {
			System.out.println("You chose chimney appliance");
		}if(e.getSource()==button20) {
			System.out.println("You chose built-in-microwave ");
		}if(e.getSource()==button21) {
			System.out.println("You chose Refrigerator appliance");
		}if(e.getSource()==button22) {
			System.out.println("You chose faucets and sink option");
		}if(e.getSource()==button23) {
			System.out.println("You chose Dishwasher appliance");
		}
		if(e.getSource()==submit) {
			System.out.println("You have made ur choices");
			frame.dispose();
			new MenuPage();
		}
		}}
		
	

	