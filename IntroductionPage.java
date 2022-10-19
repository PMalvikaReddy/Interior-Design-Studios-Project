package InteriorDesignStudios;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class IntroductionPage implements ActionListener {
	
	JFrame frame=new JFrame();
	JButton button;
	JLabel labelimage;
	JLabel label1,label2,label3,label4,label5,label6,label7;
	ImageIcon image;
	IntroductionPage(){
		
		image=new ImageIcon("C:/Users/Malvika/Desktop/interior_image_150.jpg");
		
		label1=new JLabel("INTERIOR DESIGN STUDIOS");
		//label1.setBounds(65, 25, 420, 75);
		//label1.setFont(new Font("comic sans ms",Font.ITALIC,20));
		label1.setFont(new Font("segoe print",Font.BOLD,20));
		label1.setHorizontalTextPosition(JLabel.RIGHT);
		
		label2=new JLabel("Providing end-to-end solutions for new homes and renovation projects.");
		label2.setFont(new Font("comic sans ms",Font.ITALIC,12));
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		//label1.setBounds(10, 100, 400, 75);
		
		label3=new JLabel("Let the home interiors reflect your personality.");
		label3.setFont(new Font("comic sans ms",Font.ITALIC,15));
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		
		label4=new JLabel("Select customized home interiors that suit your style.");
		label4.setFont(new Font("comic sans ms",Font.ITALIC,15));
		
		label5=new JLabel("Tap to get a free consultation and personalised designs.");
		label5.setFont(new Font("comic sans ms",Font.ITALIC,15));
		label7=new JLabel("Everything from a modular kitchen to personalised wardrobes");
		label7.setFont(new Font("comic sans ms",Font.ITALIC,15));
		
		label6=new JLabel("LOG IN HERE:");
		//label6.setFont(new Font("comic sans ms",Font.ITALIC,15));
		label6.setFont(new Font("segoe print",Font.BOLD,15));
		
		labelimage =new JLabel();
		labelimage.setIcon(image);
		/*labelimage.setHorizontalAlignment(JLabel.LEFT);
		labelimage.setHorizontalTextPosition(JLabel.LEFT);
		labelimage.setVerticalAlignment(JLabel.TOP);*/
		
		button=new JButton("click here");
		//button.setBounds(110,350,200,50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(labelimage);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label7);
		frame.add(label6);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			IdAndPasswords idandpasswords=new IdAndPasswords();
			LoginPage loginpage=new LoginPage(idandpasswords.getLoginInfo());
		}
	}

}
