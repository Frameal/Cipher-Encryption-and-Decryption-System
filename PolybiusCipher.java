package FinalCaseStudy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class PolybiusCipher extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnHome,  btnPolybius, btnBifid, btnVigenere, btnCipherX, btnEncrypt, btnDecrypt, btnExit, btnClear;
	private JTextField txtEncMessage;
	private JTextField txtEncOutput;
	private JTextField txtDecMessage;
	private JTextField txtDecOutput;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PolybiusCipher window = new PolybiusCipher();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PolybiusCipher() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PolybiusCipher.class.getResource("/FinalCaseStudy/AI ANGRY.png")));
		getContentPane().setBackground(Color.WHITE);
		initialize();
	}

	private void initialize() {
		setTitle("FINALS CASE STUDY - DATA STRUCTURE");
		setBounds(100, 100, 1000, 750);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(70, 130, 180));
		btnClear.setFont(new Font("Verdana", Font.BOLD, 15));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(792, 605, 170, 65);
		getContentPane().add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 5, (Color) new Color(70, 130, 180)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 244, 713);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnHome = new JButton("HOME");
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
	
		ImageIcon originalIcon3 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\AI COOL.png");
		Image originalImage3 = originalIcon3.getImage();
		Image scaledImage3 = originalImage3.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
		btnHome.setIcon(scaledIcon3);
		
		btnHome.setBackground(Color.WHITE);
		btnHome.setForeground(new Color(70, 130, 180));
		btnHome.setFont(new Font("Verdana", Font.BOLD, 20));
		btnHome.setBounds(0, 0, 238, 78);
		panel.add(btnHome);
		
		btnPolybius = new JButton("Polybius Cipher");
		btnPolybius.setForeground(new Color(70, 130, 180));
		btnPolybius.setBackground(Color.WHITE);
		btnPolybius.setFont(new Font("Verdana", Font.BOLD, 20));
		btnPolybius.setBounds(0, 75, 238, 78);
		panel.add(btnPolybius);
		
		btnBifid = new JButton("Bifid Cipher");
		btnBifid.setForeground(new Color(70, 130, 180));
		btnBifid.setBackground(Color.WHITE);
		btnBifid.setFont(new Font("Verdana", Font.BOLD, 20));
		btnBifid.setBounds(0, 151, 238, 78);
		panel.add(btnBifid);
		
		btnVigenere = new JButton("Vigenere Cipher");
		btnVigenere.setForeground(new Color(70, 130, 180));
		btnVigenere.setBackground(Color.WHITE);
		btnVigenere.setFont(new Font("Verdana", Font.BOLD, 20));
		btnVigenere.setBounds(0, 225, 238, 78);
		panel.add(btnVigenere);
		
		btnCipherX = new JButton("CipherX");
		btnCipherX.setForeground(new Color(70, 130, 180));
		btnCipherX.setBackground(Color.WHITE);
		btnCipherX.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCipherX.setBounds(0, 301, 238, 78);
		panel.add(btnCipherX);
		
		btnExit = new JButton("EXIT");
		ImageIcon originalIcon5 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\AI WINK.png");
		
		Image originalImage5 = originalIcon5.getImage();
		Image scaledImage5 = originalImage5.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
		btnExit.setIcon(scaledIcon5);
		
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);

		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(new Color(70, 130, 180));
		btnExit.setFont(new Font("Verdana", Font.BOLD, 20));
		btnExit.setBounds(0, 635, 238, 78);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Polybius Cipher");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setBounds(274, 32, 363, 49);
		getContentPane().add(lblNewLabel);
		
		JTextArea txtPolybiusCipher = new JTextArea();
		txtPolybiusCipher.setForeground(new Color(70, 130, 180));
		txtPolybiusCipher.setLineWrap(true);
		txtPolybiusCipher.setEditable(false);
		txtPolybiusCipher.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtPolybiusCipher.setBackground(Color.WHITE);
		txtPolybiusCipher.setText("A table that allows someone to translate letters into numbers. To give a small level of encryption, this table can be randomized and shared with the recipient. In order to fit \r\nthe 26 letters of the alphabet into the 25 spots created by the table, the letters i and j \r\nare usually combined.");
		txtPolybiusCipher.setBounds(298, 105, 632, 76);
		getContentPane().add(txtPolybiusCipher);
		
		txtEncMessage = new JTextField();
		txtEncMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncMessage.setBounds(274, 287, 293, 49);
		getContentPane().add(txtEncMessage);
		txtEncMessage.setColumns(10);
		
		JLabel lblMessage = new JLabel("PLAINTEXT:");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage.setBounds(274, 238, 216, 39);
		getContentPane().add(lblMessage);
		
		// Encrypt - Lock
		btnEncrypt = new JButton("ENCRYPT");

		ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Lock.png");
		Image originalImage2 = originalIcon2.getImage();
		Image scaledImage2 = originalImage2.getScaledInstance(30, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		btnEncrypt.setIcon(scaledIcon2);
		
		btnEncrypt.setBackground(Color.WHITE);
		btnEncrypt.setForeground(new Color(70, 130, 180));
		btnEncrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEncrypt.setBounds(499, 362, 170, 63);
		getContentPane().add(btnEncrypt);
		
		JLabel lblEncryption = new JLabel("Encryption: ");
		lblEncryption.setForeground(Color.WHITE);
		lblEncryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEncryption.setBounds(274, 205, 216, 39);
		getContentPane().add(lblEncryption);
		
		JLabel lblOutput = new JLabel("CIPHERTEXT:");
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput.setBounds(625, 238, 317, 39);
		getContentPane().add(lblOutput);
		
		txtEncOutput = new JTextField();
		txtEncOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncOutput.setColumns(10);
		txtEncOutput.setBounds(625, 287, 293, 49);
		getContentPane().add(txtEncOutput);
		
		JLabel lblMessage_1 = new JLabel("CIPHERTEXT:");
		lblMessage_1.setForeground(Color.WHITE);
		lblMessage_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage_1.setBounds(274, 478, 216, 39);
		getContentPane().add(lblMessage_1);
		
		JLabel lblDecryption = new JLabel("Decryption: ");
		lblDecryption.setForeground(Color.WHITE);
		lblDecryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDecryption.setBounds(274, 445, 216, 39);
		getContentPane().add(lblDecryption);
		
		txtDecMessage = new JTextField();
		txtDecMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecMessage.setColumns(10);
		txtDecMessage.setBounds(274, 527, 293, 49);
		getContentPane().add(txtDecMessage);
		
		// Decrypt - Key
		btnDecrypt = new JButton("DECRYPT");
		
		ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Key.png");
		Image originalImage1 = originalIcon1.getImage();
		Image scaledImage1 = originalImage1.getScaledInstance(30, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
		btnDecrypt.setIcon(scaledIcon1);
		
		btnDecrypt.setBackground(Color.WHITE);
		btnDecrypt.setForeground(new Color(70, 130, 180));
		btnDecrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDecrypt.setBounds(499, 605, 170, 65);
		getContentPane().add(btnDecrypt);
		
		txtDecOutput = new JTextField();
		txtDecOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecOutput.setColumns(10);
		txtDecOutput.setBounds(625, 527, 293, 49);
		getContentPane().add(txtDecOutput);
		
		JLabel lblOutput_1 = new JLabel("PLAINTEXT:");
		lblOutput_1.setForeground(Color.WHITE);
		lblOutput_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput_1.setBounds(625, 478, 333, 39);
		getContentPane().add(lblOutput_1);
		
		// BACKGROUND
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(PolybiusCipher.class.getResource("/FinalCaseStudy/Background.png")));
		
		lblBackground.setBounds(154, -102, 874, 922);
		getContentPane().add(lblBackground);
	
		btnHome.addActionListener(this);
		btnPolybius.addActionListener(this);
		btnBifid.addActionListener(this);
		btnVigenere.addActionListener(this);
		btnCipherX.addActionListener(this);
		btnEncrypt.addActionListener(this);
		btnDecrypt.addActionListener(this);
		btnExit.addActionListener(this);
		btnClear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnHome) {
			Home h = new Home();
			h.setVisible(true);
			dispose();
		} else if (e.getSource() == btnPolybius) {
			PolybiusCipher cc = new PolybiusCipher();
			cc.setVisible(true);
			dispose();
		} else if (e.getSource() == btnBifid) {
			BifidCipher cc = new BifidCipher();
			cc.setVisible(true);
			dispose();
		} else if (e.getSource() == btnVigenere) {
			VigenereCipher cc = new VigenereCipher();
			cc.setVisible(true);
	        dispose();
		} else if (e.getSource() == btnCipherX) {
			CipherX cc = new CipherX();
			cc.setVisible(true);
	        dispose();
		} else if (e.getSource() == btnEncrypt) {
            String plaintext = txtEncMessage.getText();
            if (plaintext.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a plaintext message to encrypt.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String ciphertext = encrypt(plaintext);
            txtEncOutput.setText(ciphertext);
        } else if (e.getSource() == btnDecrypt) {
            String ciphertext = txtDecMessage.getText();
            if (ciphertext.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a ciphertext to decrypt.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String plaintext = decrypt(ciphertext);
            txtDecOutput.setText(plaintext);
        } else if (e.getSource() == btnExit) {
            dispose();
        } else if (e.getSource() == btnClear) {
        	txtEncMessage.setText("");
        	txtEncOutput.setText("");
        	txtDecMessage.setText("");
        	txtDecOutput.setText("");
        }
    }

	private String encrypt(String text) {
	    if (!text.matches("[a-zA-Z]+")) {
	        JOptionPane.showMessageDialog(this, "Invalid input. Please enter letters only (A-Z).", "Error", JOptionPane.ERROR_MESSAGE);
	        return "";
	    }

	    StringBuilder result = new StringBuilder();
	    text = text.toUpperCase().replace("J", "I");

	    for (int i = 0; i < text.length(); i++) {
	        char c = text.charAt(i);
	        for (int row = 0; row < POLYBIUS_SQUARE.length; row++) {
	            for (int col = 0; col < POLYBIUS_SQUARE[row].length; col++) {
	                if (POLYBIUS_SQUARE[row][col] == c) {
	                    result.append(row + 1).append(col + 1).append(" ");
	                }
	            }
	        }
	    }
	    return result.toString().trim();
	}

	private String decrypt(String text) {
	    if (!text.matches("([1-5]{2}\\s*)+")) {
	        JOptionPane.showMessageDialog(this, "Invalid input. Please enter pairs of numbers (e.g., 11 23 45).", "Error", JOptionPane.ERROR_MESSAGE);
	        return "";
	    }

	    StringBuilder result = new StringBuilder();
	    text = text.trim();
	    String[] parts = text.split("\\s+");

	    for (String pair : parts) {
	        if (pair.length() == 2) {
	            int row = pair.charAt(0) - '1';
	            int col = pair.charAt(1) - '1';
	            if (row >= 0 && row < POLYBIUS_SQUARE.length && col >= 0 && col < POLYBIUS_SQUARE[row].length) {
	                result.append(POLYBIUS_SQUARE[row][col]);
	            }
	        } else {
	            result.append(pair);
	        }
	    }
	    return result.toString();
	}


    private static final char[][] POLYBIUS_SQUARE = {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'}
    };
 
}
