import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@SuppressWarnings("serial")
public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField nickname;
	private JTextField user;
	private JPasswordField password;
	private JPasswordField confirmPassword;

	
	
	/**
	 * Create the frame.
	 */
	public Register() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 34, 39));
		panel.setBounds(0, 0, 715, 402);
		contentPane.add(panel);
		panel.setLayout(null);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image/paper.png"));
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(800, 600,  java.awt.Image.SCALE_SMOOTH);
		img = new ImageIcon(newimg);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				Login log = new Login();
				log.show();
				Register.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBackground(new Color(244, 164, 72));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(new Color(244, 164, 96));
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1.setBackground(new Color(244, 164, 96));
		panel_1_1.setBounds(613, 353, 92, 38);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Back");
		lblNewLabel_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(0, 0, 92, 38);
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.setBackground(new Color(255, 250, 205));

				if(nickname.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill out the Nickname field!");

				}else if(user.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please fill out the User field!");

				}else if(password.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill out the Password field!");

				}else if(confirmPassword.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill out the Confirm password field!");

				}else {
					
					if(confirmPassword.getText().equals(password.getText())) {
						try {
		                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jollikevs", "root", "12345");
		                    String query = "INSERT INTO user values('"
		                    + nickname.getText()
		                    + "','" + user.getText()
		                    + "','" + password.getText()
		                    +"')";
		                    		                    
		                    Statement sta = connection.createStatement();
		                    sta.executeUpdate(query);
		                    
		                    JOptionPane.showMessageDialog(null, "Account created!\nPlese take note of this or Screen-shot your account\n\nuser : " + user.getText() + "\npassword : " + password.getText());
		                    
		                    nickname.setText("");
		                    user.setText("");
		                    password.setText("");
		                    confirmPassword.setText("");
		                    
						}catch(Exception ws) {
							JOptionPane.showMessageDialog(null, "Something Wrong!\nPossible Reason : \n\nNickname or User is already use.\nNickname or User is must be unique.");

						}   
					}else {
	                    JOptionPane.showMessageDialog(null, "Passwords do NOT match!\nPlease try again.");

					}					
				}			
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(255, 255, 224));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(255, 255, 240));

			}
		});
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(99, 329, 154, 38);
		panel.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Create account");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(23, 0, 110, 38);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Register");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 29));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 9, 232, 67);
		panel.add(lblNewLabel_1);
		
		nickname = new JTextField();
		nickname.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		nickname.setBorder(new LineBorder(new Color(0, 0, 51), 2));
		nickname.setBounds(99, 147, 232, 23);
		panel.add(nickname);
		nickname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nickname");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(97, 131, 234, 14);
		panel.add(lblNewLabel_2);
		
		user = new JTextField();
		user.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		user.setColumns(10);
		user.setBorder(new LineBorder(new Color(0, 0, 51), 2));
		user.setBounds(99, 197, 232, 23);
		panel.add(user);
		
		JLabel lblNewLabel_2_1 = new JLabel("User name");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBounds(97, 181, 234, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Password");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setBounds(97, 231, 234, 14);
		panel.add(lblNewLabel_2_2);
		
		password = new JPasswordField();
		password.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		password.setBorder(new LineBorder(new Color(0, 0, 51), 2));
		password.setBounds(99, 246, 232, 23);
		panel.add(password);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Confirm Password");
		lblNewLabel_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_2_1.setBounds(97, 280, 234, 14);
		panel.add(lblNewLabel_2_2_1);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		confirmPassword.setBorder(new LineBorder(new Color(0, 0, 51), 2));
		confirmPassword.setBounds(99, 295, 232, 23);
		panel.add(confirmPassword);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(0, 0, 715, 402);
		panel.add(lblImg);
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setIcon(img);
		
		JLabel lblImg2 = new JLabel("");
		lblImg2.setBounds(355, 0, 360, 391);
		panel.add(lblImg2);
		lblImg2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/image/jolliSmile.png"));
		Image image2 = img2.getImage();
		Image newimg2 = image2.getScaledInstance(180, 160,  java.awt.Image.SCALE_SMOOTH);
		lblImg2.setIcon(img2);
		img2 = new ImageIcon(newimg2);
		
		
	}
}

