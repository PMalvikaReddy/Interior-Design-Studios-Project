package InteriorDesignStudios;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Page6_WardrobePage implements ActionListener{
	JFrame frame=new JFrame();
	JRadioButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15;
	JLabel label1,label2,label3,label4;
	JComboBox combobox1,combobox2,combobox3;
	JButton submit;
	JCheckBox checkbox;
	
	Page6_WardrobePage(){
		label1=new JLabel("1). Select your type of wardrobe.");
		label1.setFont(new Font("segoe print",Font.BOLD,14));
		button1=new JRadioButton("Swing");
		button2=new JRadioButton("Sliding");
		button3=new JRadioButton("Floor to ceiling");
		button4=new JRadioButton("Walk in wardrobe");
		
		label2=new JLabel("2). Please select the core material to be used in the furniture");
		label2.setFont(new Font("segoe print",Font.BOLD,14));
		String[] materials= {"Engineered wood:MDF,HDF","Plywood: MR,BWR,BWP"};
		 combobox1=new JComboBox(materials);
		 
		 label3=new JLabel("3). Style your wardrobe shutter style and shutter finishes.");
		 label3.setFont(new Font("segoe print",Font.BOLD,14));
		 String[] shutters= {"Plain doors","Aluminium glass door","Clear glass shutters","Glass divisional doors"};
		 combobox2=new JComboBox(shutters);
		 String[] shutterFinish= {"Laminate","Acrylic","Membrane","Polymer paint"};
		 combobox3=new JComboBox(shutterFinish);
		 
		 label4=new JLabel("4). choose the add-ons and accessories for your wardrobe.");
		 label4.setFont(new Font("segoe print",Font.BOLD,14));
		 button5=new JRadioButton("Long-Hanging cabinets");
		 button6=new JRadioButton("Drawer cabinet");
		 button7=new JRadioButton("Shelfves");
		 button8=new JRadioButton("Hanging Rails");
		 button9=new JRadioButton("Trouser Rack");
		 button10=new JRadioButton("Jewellery Tray");
		// button11=new JRadioButton("Dressing mirror");
		 
		 checkbox=new JCheckBox("Click SUBMIT to submit the details");
		 checkbox.setFont(new Font("segoe print",Font.BOLD,14));
		 checkbox.setFocusable(false);
		 
		 submit=new JButton("SUBMIT");
		 submit.setFocusable(false);
		
		ButtonGroup group1=new ButtonGroup();
		group1.add(button1);
		group1.add(button2);
		group1.add(button3);
		group1.add(button4);
		
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
		checkbox.addActionListener(this);
		combobox1.addActionListener(this);
		combobox2.addActionListener(this);
		combobox3.addActionListener(this);
		
	submit.addActionListener(this);
		
		frame.add(label1);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label2);
		frame.add(combobox1);
		frame.add(label3);
		frame.add(combobox2);
		frame.add(combobox3);
		frame.add(label4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		//frame.add(button11);
		frame.add(checkbox);
		frame.add(submit);
		/*this.add(label1);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		/*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout());*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			System.out.println();
			System.out.println("Swing type wardrobe optin selected");
			System.out.println();
		}if(e.getSource()==button2) {
			System.out.println();
			System.out.println("Sliding type wardrobe optin selected");
			System.out.println();
		}if(e.getSource()==button3) {
			System.out.println();
			System.out.println("Floor to ceiling type optin selected");
			System.out.println();
		}if(e.getSource()==button4) {
			System.out.println();
			System.out.println("Walk in wardrobe optin selected");
			System.out.println();
		}if(e.getSource()==button5) {
			System.out.println("You selected long-hanging cabinets");
		}if(e.getSource()==button6) {
			System.out.println("You selected drawer cabinets");
		}if(e.getSource()==button7) {
			System.out.println("You selected extra shelves option");
		}if(e.getSource()==button8) {
			System.out.println("You selected hanging rails");
		}if(e.getSource()==button9) {
			System.out.println("You have selected Trouser Racks option");
		}if(e.getSource()==button10) {
			System.out.println("You have selected the Jewellery rack option");
		}if(e.getSource()==combobox1) {
			System.out.println(combobox1.getSelectedItem()+" is selected");
			System.out.println();
		}if(e.getSource()==combobox2) {
			System.out.println(combobox2.getSelectedItem()+" is selected");
		}if(e.getSource()==combobox3) {
			System.out.println(combobox3.getSelectedItem()+" is selected");
			System.out.println();
		}if(e.getSource()==submit) {
			frame.dispose();
			new MenuPage();
		}
	}
}

