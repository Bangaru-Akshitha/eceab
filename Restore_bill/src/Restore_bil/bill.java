package Restore_bil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(155, 11, 112, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 57, 65, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 108, 81, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Tea-Rs10", "coffee-Rs15"}));
		c1.setBounds(97, 63, 96, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(101, 111, 92, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			private int bill;

			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
			    String qnty=t1.getText();
			    int q=Integer. parseInt(qnty);
			    int bill=0;
			   if(item.equals("Tea-Rs10"))
			   {
				   bill=q*10;
				   JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
			   }
			   else if (item.equals("coffee-Rs15"))
			   {
				  bill=q*15;
				  JOptionPane.showMessageDialog(btnNewButton,"hello \n Selected item:"+item+"\n Quantity:"+q+"\n your bill:"+bill);
				  
			   }
			   
				   }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(58, 162, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
