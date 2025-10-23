package FinalCaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Home extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnPolybius, btnBifid, btnVigenere, btnCipherX;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/FinalCaseStudy/AI ANGRY.png")));
		setTitle("FINALS CASE STUDY - DATA STRUCTURE");
		getContentPane().setBackground(new Color(255, 255, 255));
		initialize();
	}

	private void initialize() {
		setBounds(100, 100, 1000, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel_2 = new JLabel("Hello!");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(81, 55, 204, 40);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("Your safety is our priority.");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setBounds(81, 124, 360, 35);
		getContentPane().add(lblNewLabel);
		
		JLabel lblQuestion = new JLabel("What would you like to do today? ");
		lblQuestion.setForeground(Color.WHITE);
		lblQuestion.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuestion.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblQuestion.setBounds(90, 253, 368, 48);
		getContentPane().add(lblQuestion);
		
		JLabel lblSelect = new JLabel("Select an option to get started.");
		lblSelect.setForeground(Color.WHITE);
		lblSelect.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblSelect.setBounds(90, 280, 368, 48);
		getContentPane().add(lblSelect);
		
		btnPolybius = new JButton("Polybius Square Cipher");
		btnPolybius.setBackground(Color.WHITE);
		btnPolybius.setForeground(new Color(70, 130, 180));
		btnPolybius.setToolTipText("");
		btnPolybius.setFont(new Font("Verdana", Font.BOLD, 17));
		btnPolybius.setBounds(81, 366, 263, 94);
		getContentPane().add(btnPolybius);
		
		btnVigenere = new JButton("Vigenere Cipher");
		btnVigenere.setBackground(Color.WHITE);
		btnVigenere.setForeground(new Color(70, 130, 180));
		btnVigenere.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVigenere.setBounds(81, 505, 263, 94);
		getContentPane().add(btnVigenere);
		
		JLabel lblEncryptionDecryption = new JLabel("Encrypt and Decrypt with us!");
		lblEncryptionDecryption.setForeground(Color.WHITE);
		lblEncryptionDecryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncryptionDecryption.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblEncryptionDecryption.setBounds(70, 155, 606, 100);
		getContentPane().add(lblEncryptionDecryption);
		
		btnBifid = new JButton("Bifid Cipher");
		btnBifid.setBackground(Color.WHITE);
		btnBifid.setForeground(new Color(70, 130, 180));
		btnBifid.setFont(new Font("Verdana", Font.BOLD, 20));
		btnBifid.setBounds(367, 365, 263, 94);
		getContentPane().add(btnBifid);
		
		btnCipherX = new JButton("CipherX");
		btnCipherX.setBackground(Color.WHITE);
		btnCipherX.setForeground(new Color(70, 130, 180));
		btnCipherX.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCipherX.setBounds(367, 505, 263, 94);
		getContentPane().add(btnCipherX);
		
		// AI HELLO
		JLabel lblAIHELLO = new JLabel("");
		lblAIHELLO.setIcon(new ImageIcon(Home.class.getResource("/FinalCaseStudy/AI HELLO.png")));
		
		lblAIHELLO.setBounds(499, 23, 630, 654);
		getContentPane().add(lblAIHELLO); 
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/FinalCaseStudy/Background.png")));
		lblNewLabel_1.setBounds(-16, 10, 980, 693);
		getContentPane().add(lblNewLabel_1);
		
		btnPolybius.addActionListener(this);
		btnBifid.addActionListener(this);
		btnVigenere.addActionListener(this);
		btnCipherX.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPolybius) {
			PolybiusCipher cc = new PolybiusCipher();
			cc.setVisible(true);
			dispose();
		} 	
		else if (e.getSource() == btnBifid) {
			BifidCipher cc = new BifidCipher();
			cc.setVisible(true);
			dispose();
		} 	
		else if (e.getSource() == btnVigenere) {
			VigenereCipher cc = new VigenereCipher();
			cc.setVisible(true);
	        dispose();
		}
		else if (e.getSource() == btnCipherX) {
			CipherX cc = new CipherX();
			cc.setVisible(true);
	        dispose();
		}
		
		
		
	}
}
