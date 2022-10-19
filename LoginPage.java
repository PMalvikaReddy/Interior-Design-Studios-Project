package InteriorDesignStudios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	JFrame frame=new JFrame();
	JButton loginbutton=new JButton("login");
	JButton resetbutton=new JButton("reset");
	JTextField useridfield=new JTextField();
	JPasswordField userpasswordfield=new JPasswordField();
	
	ImageIcon image=new ImageIcon("C:/Users/Malvika/Desktop/interior_image_125.jpg");
	
	
	
	JLabel titlelabel=new JLabel("INTERIOR DESIGN STUDIOS");
	JLabel useridlabel=new JLabel("userId");
	JLabel userpasswordlabel=new JLabel("password");
	JLabel passwordlabel=new JLabel("");
	JLabel messagelabel=new JLabel();
	JLabel label1=new JLabel();
	//JLabel labelimage =new JLabel();
	//labelimage.setIcon(image);
	
	
	HashMap<String,String>logininfo=new HashMap<String,String>();
	LoginPage(HashMap<String,String>LoginInfoOrginal){
		logininfo=LoginInfoOrginal;
		
		//label1.setIcon(image);
		
		useridlabel.setBounds(50, 100, 75, 25);
		userpasswordlabel.setBounds(50, 150, 75, 25);
		passwordlabel.setBounds(50,150,75,25);
		
		titlelabel.setBounds(65, 25, 420, 75);
		titlelabel.setFont(new Font("segoe print",Font.BOLD,20));
		
		messagelabel.setBounds(125, 275,250,35);
		messagelabel.setFont(new Font(null,Font.ITALIC,25));
		
		useridfield.setBounds(125, 100, 200, 25);
		userpasswordfield.setBounds(125, 150, 200, 25);
		
		loginbutton.setBounds(125, 225, 100, 25);
		loginbutton.setFocusable(false);
		loginbutton.addActionListener(this);
		
	   resetbutton.setBounds(225, 225, 100, 25);
		resetbutton.setFocusable(false);
		resetbutton.addActionListener(this);
		
		frame.setIconImage(image.getImage());
		
		//frame.add(labelimage);
		frame.add(titlelabel);
		frame.add(label1);
		//frame.add(label2);
		frame.add(useridlabel);
		frame.add(userpasswordlabel);
		frame.add(passwordlabel);
		frame.add(useridfield);
		frame.add(userpasswordfield);
		frame.add(loginbutton);
		frame.add(resetbutton);
		frame.add(messagelabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetbutton) {
			useridfield.setText("");
			userpasswordfield.setText("");
		}
		if(e.getSource()==loginbutton) {
			String userid=useridfield.getText();
			String password=String.valueOf(userpasswordfield.getPassword());
			if(logininfo.containsKey(userid)) {
				if(logininfo.get(userid).equals(password)) {
					messagelabel.setForeground(Color.green);
					messagelabel.setText("               login successful");
					frame.dispose();
					MenuPage welcomepage=new MenuPage();
				}else
				{
					messagelabel.setForeground(Color.red);
					messagelabel.setText("               wrong password");
				}
			}else {
				messagelabel.setForeground(Color.red);
				messagelabel.setText("               username not found");
			}
		}
		
	}

}





























