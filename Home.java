import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image/jolliSmile.png"));
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(150, 130,  java.awt.Image.SCALE_SMOOTH);
		img = new ImageIcon(newimg);
		
		setBorder(new LineBorder(Color.WHITE, 3));
		setBackground(new Color(255, 64, 92));
		setBounds(0, 0, 842, 499);	
		setLayout(null);
	
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(10, 11, 247, 130);
		add(lblImg);
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setIcon(img);
		
		JLabel lblNewLabel = new JLabel("Welcome to Jollibee!");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(227, 31, 513, 53);
		add(lblNewLabel);
		
		JLabel lblOfLaspinasCity = new JLabel("Jollikevs is your happiness.");
		lblOfLaspinasCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfLaspinasCity.setForeground(new Color(27, 27, 27));
		lblOfLaspinasCity.setFont(new Font("Arial", Font.BOLD, 13));
		lblOfLaspinasCity.setBounds(237, 65, 503, 19);
		add(lblOfLaspinasCity);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(255, 255, 255)));
		panel.setBackground(new Color(255, 64, 92));
		panel.setBounds(22, 147, 810, 341);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/image/Jollibee Mix & Match Combos.jpg"));
		Image image2 = img2.getImage();
		Image newimg2 = image2.getScaledInstance(650, 330,  java.awt.Image.SCALE_SMOOTH);
		img2 = new ImageIcon(newimg2);
		lblNewLabel_2.setIcon(img2);
		lblNewLabel_2.setBounds(0, 11, 810, 330);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Mix na match pa! ugh sarap.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(246, 128, 517, 20);
		add(lblNewLabel_3);
		
	}
}