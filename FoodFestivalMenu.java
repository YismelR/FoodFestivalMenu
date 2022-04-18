import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class FoodFestivalMenu extends JFrame implements ItemListener, ActionListener {
	JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8, checkBox9;
	
	JLabel label,label2, label3, label4;
	JButton button;
	
	public FoodFestivalMenu(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setTitle("Food Festival Menu");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		
		label = new JLabel("Food ordering System");
		label.setBounds(150, 50, 500, 50);
		label.setFont(new Font("Arial", Font.BOLD,22));
		label.setBackground(Color.DARK_GRAY);
		label.setOpaque(true);
		label.setForeground(Color.YELLOW);
		label.setBorder(new EmptyBorder(0,10,0,0));
		
		label2 = new JLabel ("Appetizer");
		label2.setBounds(50, 100, 150, 50);
		label2.setFont(new Font("Arial", Font.BOLD,18));
		label2.setBackground(Color.LIGHT_GRAY);
		label2.setOpaque(true);
		label2.setForeground(Color.BLACK);
		label2.setBorder(new EmptyBorder(0,10,0,0));
		
		label3 = new JLabel ("Main Course");
		label3.setBounds(300, 100, 150, 50);
		label3.setFont(new Font("Arial", Font.BOLD,18));
		label3.setBackground(Color.LIGHT_GRAY);
		label3.setOpaque(true);
		label3.setForeground(Color.BLACK);
		label3.setBorder(new EmptyBorder(0,10,0,0));
		
		label4 = new JLabel ("Dessert");
		label4.setBounds(550, 100, 150, 50);
		label4.setFont(new Font("Arial", Font.BOLD,18));
		label4.setBackground(Color.LIGHT_GRAY);
		label4.setOpaque(true);
		label4.setForeground(Color.BLACK);
		label4.setBorder(new EmptyBorder(0,10,0,0));
		
		//Appetizer menu
		checkBox1 = new JCheckBox("Bruchetta @ $8");
		checkBox1.setBounds(40, 150, 200, 50);
		checkBox1.setFont(new Font("Arial", Font.BOLD,18));
		checkBox1.setForeground(Color.DARK_GRAY);
		checkBox1.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox2 = new JCheckBox("Garlic Bread @ $5");
		checkBox2.setBounds(40, 200, 200, 50);
		checkBox2.setFont(new Font("Arial", Font.BOLD,18));
		checkBox2.setForeground(Color.DARK_GRAY);
		checkBox2.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox3 = new JCheckBox("French Fries @ $3");
		checkBox3.setBounds(40, 250, 200, 50);
		checkBox3.setFont(new Font("Arial", Font.BOLD,18));
		checkBox3.setForeground(Color.DARK_GRAY);
		checkBox3.setBorder(new EmptyBorder(0,10,0,0));
		
		
		//Main Course Menu 
		checkBox4 = new JCheckBox("fetuccine Alfredo @ $12");
		checkBox4.setBounds(250,150,250,50);
		checkBox4.setFont(new Font("Arial", Font.BOLD,18));
		checkBox4.setForeground(Color.DARK_GRAY);
		checkBox4.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox5 = new JCheckBox("Lasagna @ $15");
		checkBox5.setBounds(250,200,250,50);
		checkBox5.setFont(new Font("Arial", Font.BOLD,18));
		checkBox5.setForeground(Color.DARK_GRAY);
		checkBox5.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox6 = new JCheckBox("Grilled Salmon @ $20");
		checkBox6.setBounds(250,250,250,50);
		checkBox6.setFont(new Font("Arial", Font.BOLD,18));
		checkBox6.setForeground(Color.DARK_GRAY);
		checkBox6.setBorder(new EmptyBorder(0,10,0,0));
		
		
		//dessert menu
		checkBox7 = new JCheckBox("Creme Brulee @ $8");
		checkBox7.setBounds(500,150,250,50);
		checkBox7.setFont(new Font("Arial", Font.BOLD,18));
		checkBox7.setForeground(Color.DARK_GRAY);
		checkBox7.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox8 = new JCheckBox("caramel Flan @ $4");
		checkBox8.setBounds(500,200,250,50);
		checkBox8.setFont(new Font("Arial", Font.BOLD,18));
		checkBox8.setForeground(Color.DARK_GRAY);
		checkBox8.setBorder(new EmptyBorder(0,10,0,0));
		
		checkBox9 = new JCheckBox("Apple Pie @ $5");
		checkBox9.setBounds(500,250,250,50);
		checkBox9.setFont(new Font("Arial", Font.BOLD,18));
		checkBox9.setForeground(Color.DARK_GRAY);
		checkBox9.setBorder(new EmptyBorder(0,10,0,0));
		
		
		
		
		button = new JButton("Place your order");
		button.setBounds(250,400,300,50);
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Arial", Font.BOLD,14));
		button.setForeground(Color.black);
		
		button.addActionListener(this);
		
		
		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
		checkBox3.addItemListener(this);
		checkBox4.addItemListener(this);
		checkBox5.addItemListener(this);
		checkBox6.addItemListener(this);
		checkBox7.addItemListener(this);
		checkBox8.addItemListener(this);
		checkBox9.addItemListener(this);
		
		
		
	
		
		this.add(label);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(checkBox1);
		this.add(checkBox2);
		this.add(checkBox3);
		this.add(checkBox4);
		this.add(checkBox5);
		this.add(checkBox6);
		this.add(checkBox7);
		this.add(checkBox8);
		this.add(checkBox9);
		this.add(button);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource() == checkBox1) {
			label.setText("Bruchetta checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox2) {
			label.setText("Garlic Bread checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox3) {
			label.setText("French Fries checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox4) {
			label.setText("Fetuccine Alfredo checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox5) {
			label.setText("Lasagna checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox6) {
			label.setText("Grilled Salmon checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox7) {
			label.setText("Creme Brulee checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox8) {
			label.setText("Caramel Flan checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		else if (e.getSource() == checkBox9) {
			label.setText("Apple Pie checkbox has been "
					+ (e.getStateChange()==1? "checked":"unchecked"));
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float amount = 0;
		String msg = "Your Order Summary \n\n";
		
		if(checkBox1.isSelected()) {
			amount += 8;
			msg += "Bruchetta : $8\n";
			
		}
		if(checkBox2.isSelected()) {
			amount += 5;
			msg += "Garlic Bread : $5\n";
			
		}
		if(checkBox3.isSelected()) {
			amount += 3;
			msg += "French Fries : $3\n";
			
		}
		if(checkBox4.isSelected()) {
			amount += 12;
			msg += "Fetuccine Alfredo : $12\n";
			
		}
		if(checkBox5.isSelected()) {
			amount += 15;
			msg += "Lasagna : $15\n";
			
		}
		if(checkBox6.isSelected()) {
			amount += 20;
			msg += "Grilled Salmon : $20\n";
			
		}
		if(checkBox7.isSelected()) {
			amount += 8;
			msg += "Creme Brulee : $8\n";
			
		}
		if(checkBox8.isSelected()) {
			amount += 4;
			msg += "Caramel Flan : $4\n";
			
		}
		if(checkBox9.isSelected()) {
			amount += 5;
			msg += "Apple Pie : $5\n";
			
		}
		
		msg+= "-----------------------------\n";
		
		JOptionPane.showMessageDialog(this, msg + "total : $" + amount);
		
	}
	
	public static void main(String[] args) {
		FoodFestivalMenu FFM = new FoodFestivalMenu();
	}
	

}
