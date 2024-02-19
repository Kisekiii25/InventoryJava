import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Order extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("deprecation")
	public Order() {

		setBorder(new LineBorder(Color.WHITE, 3));
		setBackground(new Color(255, 64, 92));
		setBounds(0, 0, 842, 499);	
		setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 64, 92));
		panel.setBounds(241, 171, 353, 138);
		add(panel);
		panel.setLayout(null);
		
		JLabel beng = new JLabel("");
		beng.setHorizontalAlignment(SwingConstants.LEFT);
		beng.setFont(new Font("Tahoma", Font.BOLD, 20));
		beng.setBounds(93, 11, 234, 39);
		add(beng);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.hide();
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBorder(new LineBorder(new Color(0, 102, 255), 2));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.hide();
				panel_1_2.show();
				beng.setText("Dine in order");
			}
		});
		panel_1.setBounds(10, 66, 151, 39);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Dine in");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 131, 17);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBorder(new LineBorder(new Color(0, 102, 255), 2));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBorder(null);

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.hide();
				panel_1_2.show();
				beng.setText("Take out order");

			}
		});
		panel_1_1.setBounds(192, 66, 151, 39);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Take out");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 11, 131, 17);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Dine in or Take out?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 11, 293, 46);
		panel.add(lblNewLabel);
		
		panel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_2.setBorder(new LineBorder(new Color(0, 102, 255), 2));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_2.setBorder(null);

			}
			public void mouseClicked(MouseEvent e) {
				panel.show();
				panel_1_2.hide();
				beng.setText("");
			}
		});
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 11, 73, 39);
		add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Return");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 11, 53, 17);
		panel_1_2.add(lblNewLabel_1_2);
		
		
		
	}
}
