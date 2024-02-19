
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class System extends JFrame {

	
	private Home jHome;
	private Order jOrder;

	private JPanel contentPane;
	Login Log;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {			
					System frame = new System();
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
	
	public System() {
		
	
		
		//================================================= MainSystem ====================================================================
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1105, 560);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 57, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//================================================= Components ====================================================================
		JPanel AtPanel = new JPanel();
		AtPanel.setBorder(new LineBorder(Color.WHITE, 3));
		AtPanel.setBackground(new Color(187, 57, 70));
		AtPanel.setBounds(237, 11, 842, 499);
		contentPane.add(AtPanel);
		AtPanel.setLayout(null);
		
		jHome = new Home();
		jOrder = new Order();
		
		PanelsClicked(jHome);

		AtPanel.add(jHome);
		AtPanel.add(jOrder);


		/* 
		PStudents = new PStudents();
		PSetting = new PSetting();
		PHistory = new PHistory();
		
		AtPanel.add(PAddStudent);
		AtPanel.add(PStudents);
		AtPanel.add(PHistory);
		AtPanel.add(PSetting);
		
		//================================================= Load the DataBases ====================================================================
		PStudents.refreshTable_Of_Preschool();
		PStudents.refreshTable_Of_Elementary();
		PStudents.refreshTable_Of_Jhs();
		PStudents.refreshTable_Of_Shs();
		PHistory.refreshTable_Of_History();
	//	PAddStudent.preschoolCount();
		*/
		JPanel sideBar = new JPanel();
		sideBar.setBounds(0, 0, 227, 521);
		sideBar.setBackground(new Color(255, 64, 92));
		contentPane.add(sideBar);
		sideBar.setLayout(null);
		//================================================= HOME ====================================================================
		JPanel Home = new JPanel();
		Home.addMouseListener(new PanelButtonMouseAdapter(Home) {
			public void mouseClicked(MouseEvent e) {
				PanelsClicked(jHome);
			}
			
		});
		Home.setLayout(null);
		Home.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		Home.setBackground(new Color(255, 64, 92));
		Home.setBounds(0, 184, 227, 56);
		sideBar.add(Home);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 20));
		lblHome.setBounds(63, 5, 154, 40);
		Home.add(lblHome);
		
		//================================================= AddStudents ====================================================================
		JPanel EnrollStudents = new JPanel();
		EnrollStudents.addMouseListener(new PanelButtonMouseAdapter(EnrollStudents) {
			public void mouseClicked(MouseEvent e) {
				PanelsClicked(jOrder);
			}
		});
		EnrollStudents.setLayout(null);
		EnrollStudents.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		EnrollStudents.setBackground(new Color(255, 64, 92));
		EnrollStudents.setBounds(0, 241, 227, 56);
		sideBar.add(EnrollStudents);
		
		JLabel lblEnrollStudents = new JLabel("Order");
		lblEnrollStudents.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnrollStudents.setForeground(Color.WHITE);
		lblEnrollStudents.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEnrollStudents.setBounds(63, 5, 154, 40);
		EnrollStudents.add(lblEnrollStudents);
		
		//================================================= Students ====================================================================
		JPanel Students = new JPanel();
		Students.addMouseListener(new PanelButtonMouseAdapter(Students) {
			public void mouseClicked(MouseEvent e) {
			//	PanelsClicked(PStudents);
			}
		});
		Students.setLayout(null);
		Students.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		Students.setBackground(new Color(255, 64, 92));
		Students.setBounds(0, 297, 227, 56);
		sideBar.add(Students);
		
		JLabel lblStudents = new JLabel("Stock");
		lblStudents.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudents.setForeground(Color.WHITE);
		lblStudents.setFont(new Font("Dialog", Font.BOLD, 20));
		lblStudents.setBounds(63, 5, 154, 40);
		Students.add(lblStudents);
		
		//================================================= History ====================================================================
		JPanel History = new JPanel();
		History.addMouseListener(new PanelButtonMouseAdapter(History) {
			public void mouseClicked(MouseEvent e) {
			//	PanelsClicked(PHistory);
			}
		});
		History.setLayout(null);
		History.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		History.setBackground(new Color(255, 64, 92));
		History.setBounds(0, 353, 227, 56);
		sideBar.add(History);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setHorizontalAlignment(SwingConstants.LEFT);
		lblHistory.setForeground(Color.WHITE);
		lblHistory.setFont(new Font("Dialog", Font.BOLD, 20));
		lblHistory.setBounds(63, 5, 154, 40);
		History.add(lblHistory);
		
		//================================================= Setting ====================================================================
		JPanel Setting = new JPanel();
		Setting.addMouseListener(new PanelButtonMouseAdapter(Setting) {
			public void mouseClicked(MouseEvent e) {
			//	PanelsClicked(PSetting);
			}
		});
		Setting.setLayout(null);
		Setting.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		Setting.setBackground(new Color(255, 64, 92));
		Setting.setBounds(0, 409, 227, 56);
		sideBar.add(Setting);
		
		JLabel lblSetting = new JLabel("Add Items (Admin only)");
		lblSetting.setHorizontalAlignment(SwingConstants.LEFT);
		lblSetting.setForeground(Color.WHITE);
		lblSetting.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSetting.setBounds(63, 5, 154, 40);
		Setting.add(lblSetting);
		
		//================================================= LogOut ====================================================================
		JPanel Logout = new JPanel();
		Logout.addMouseListener(new PanelButtonMouseAdapter(Logout) {
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure want to Log-out?")==0) {				
				Log = new Login();
			//	history();
				Log.setVisible(true);
				System.this.dispose();
				}
			}
		});
		Logout.setLayout(null);
		Logout.setBorder(new CompoundBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)), null));
		Logout.setBackground(new Color(255, 64, 92));
		Logout.setBounds(0, 465, 227, 56);
		sideBar.add(Logout);
		
		JLabel lblLogOut = new JLabel("Log-out");
		lblLogOut.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogOut.setForeground(Color.WHITE);
		lblLogOut.setFont(new Font("Dialog", Font.BOLD, 20));
		lblLogOut.setBounds(63, 5, 154, 40);
		Logout.add(lblLogOut);
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 125, 26);
		sideBar.add(lblNewLabel);
		
	
		
		JLabel lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image/JolliPeace.png"));
		Image image = img.getImage();
		Image newimg = image.getScaledInstance(115+60, 160,  java.awt.Image.SCALE_SMOOTH);
		img = new ImageIcon(newimg);
		lblImg.setIcon(img);
		lblImg.setBounds(0, 26, 227, 138);
		sideBar.add(lblImg);
		
	}

	//================================================= MouseAdapter ====================================================================
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(184, 56, 69));
		}
		
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(255, 64, 92));
		}
		
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(183, 0, 4));
		}
		
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(255, 64, 92));
		}
	}
	
	//================================================= Panels When Clicked ====================================================================
	public void PanelsClicked(JPanel panel) {
		jHome.setVisible(false);
		jOrder.setVisible(false);
	//	PStudents.setVisible(false);
	//	PSetting.setVisible(false);
	//	PHistory.setVisible(false);
		panel.setVisible(true);
	}
}
	