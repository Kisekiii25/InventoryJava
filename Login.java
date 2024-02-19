import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;


import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {	
		setResizable(false);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image/jolliSmile.png"));
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(110, 95,  java.awt.Image.SCALE_SMOOTH);
		img = new ImageIcon(newimg);
		lblImg.setIcon(img);
		lblImg.setBounds(186, 0, 131, 114);
		getContentPane().add(lblImg);
		
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/image/Bg.png"));
		Image image1 = img1.getImage();
		Image newimg1 = image1.getScaledInstance(610, 395,  java.awt.Image.SCALE_SMOOTH);
		img1 = new ImageIcon(newimg1);
		
		
		JLabel lblNewLabel = new JLabel("Jollikevs mwehehe");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		lblNewLabel.setBounds(146, 108, 236, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(64, 64, 64), 3));
		textField.setBounds(130, 166, 256, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBorder(new LineBorder(new Color(64, 64, 64), 3));
		passwordField.setBounds(130, 224, 256, 32);
		contentPane.add(passwordField);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().isEmpty() && passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill out the Fields","Missing!",JOptionPane.WARNING_MESSAGE); 
				}else if(passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill in the password!","Missing Password!",JOptionPane.WARNING_MESSAGE);
					
				}else if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill in the user!","Missing User!",JOptionPane.WARNING_MESSAGE); 
				}else {
					
					
			        String username = textField.getText();
			        String password = String.valueOf(passwordField.getPassword());
			        					
			        try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jollikevs", "root", "12345");
				        String query = "SELECT * FROM user WHERE user = ? AND password = ?";

	                    PreparedStatement st = connection.prepareStatement(query);
			            st.setString(1, username);
			            st.setString(2, password);
			            ResultSet rs = st.executeQuery();
			            
			            if(rs.next()){
			                System sis = new System();
			                sis.show();
			                Login.this.dispose();
			                
			            }else{
			                // error message
			                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
			            }
			            
			        } catch (SQLException ex) {
		                JOptionPane.showMessageDialog(null, ex.getMessage());

			        }
					
				}
			}
		});
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.setBackground(Color.RED);
		panel.setBounds(130, 267, 77, 21);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Log In");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 57, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(130, 207, 131, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("User");
		lblNewLabel_2_1.setBounds(130, 150, 131, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblImg1 = new JLabel("");
		lblImg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg1.setIcon(img1);
		lblImg1.setBounds(4, 0, 506, 324);
		getContentPane().add(lblImg1);
		
		JPanel register = new JPanel();
		register.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				Register frame = new Register();
				frame.show();
				Login.this.dispose();
			}
		});
		register.setLayout(null);
		register.setBackground(Color.RED);
		register.setBounds(217, 267, 77, 21);
		contentPane.add(register);
		
		JLabel lblNewLabel_1_1 = new JLabel("Register");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 0, 57, 21);
		register.add(lblNewLabel_1_1);
		
	}
}
