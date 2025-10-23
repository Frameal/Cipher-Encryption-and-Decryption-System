package FinalCaseStudy;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

import java.awt.Toolkit;

public class VigenereCipher extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnHome,  btnPolybius, btnBifid, btnVigenere, btnCipherX, btnEncrypt, btnDecrypt, btnClear, btnExit;
	private JTextField txtEncMessage;
	private JTextField txtEncOutput;
	private JTextField txtDecMessage;
	private JTextField txtDecOutput;
	private JLabel lblKeyword2;
	private JTextField txtEncKeyword;
	private JTextField txtDecKeyword;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VigenereCipher window = new VigenereCipher();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VigenereCipher() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VigenereCipher.class.getResource("/FinalCaseStudy/AI ANGRY.png")));
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
		btnClear.setBounds(782, 603, 170, 65);
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
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);

		ImageIcon originalIcon4 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\AI WINK.png");
		Image originalImage4 = originalIcon4.getImage();
		Image scaledImage4 = originalImage4.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
		btnExit.setIcon(scaledIcon4);
						
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(new Color(70, 130, 180));
		btnExit.setFont(new Font("Verdana", Font.BOLD, 20));
		btnExit.setBounds(0, 635, 238, 78);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Vigenere Cipher");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setBounds(274, 32, 363, 49);
		getContentPane().add(lblNewLabel);
		
		JTextArea txtrOneOfThe = new JTextArea();
		txtrOneOfThe.setForeground(new Color(70, 130, 180));
		txtrOneOfThe.setEditable(false);
		txtrOneOfThe.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtrOneOfThe.setBackground(Color.WHITE);
		txtrOneOfThe.setLineWrap(true);
		txtrOneOfThe.setText("In a Caesar Cipher, each letter of the alphabet is shifted along some number of places; for example, in a Caesar cipher of shift 3, A would become D, B would become E and \r\nso on. The Vigenere cipher consists of using several Caesar ciphers in sequence with \r\ndifferent shift values.");
		txtrOneOfThe.setBounds(299, 91, 635, 77);
		getContentPane().add(txtrOneOfThe);
		
		txtEncMessage = new JTextField();
		txtEncMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncMessage.setBounds(274, 279, 254, 49);
		getContentPane().add(txtEncMessage);
		txtEncMessage.setColumns(10);
		
		JLabel lblMessage = new JLabel("PLAINTEXT:");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage.setBounds(274, 230, 216, 39);
		getContentPane().add(lblMessage);
		
		// Encrypt - Lock and Key
		btnEncrypt = new JButton("ENCRYPT");

		ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Lock.png");
		Image originalImage2 = originalIcon2.getImage();
		Image scaledImage2 = originalImage2.getScaledInstance(30, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		btnEncrypt.setIcon(scaledIcon2);
		
		btnEncrypt.setBackground(Color.WHITE);
		btnEncrypt.setForeground(new Color(70, 130, 180));
		btnEncrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEncrypt.setBounds(519, 350, 185, 65);
		getContentPane().add(btnEncrypt);
		
		JLabel lblEncryption = new JLabel("Encryption: ");
		lblEncryption.setForeground(Color.WHITE);
		lblEncryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEncryption.setBounds(274, 196, 216, 39);
		getContentPane().add(lblEncryption);
		
		JLabel lblOutput = new JLabel("CIPHERTEXT:");
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput.setBounds(696, 230, 229, 39);
		getContentPane().add(lblOutput);
		
		txtEncOutput = new JTextField();
		txtEncOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncOutput.setColumns(10);
		txtEncOutput.setBounds(696, 279, 229, 49);
		getContentPane().add(txtEncOutput);
		
		JLabel lblMessage_1 = new JLabel("CIPHERTEXT:");
		lblMessage_1.setForeground(Color.WHITE);
		lblMessage_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage_1.setBounds(274, 474, 216, 39);
		getContentPane().add(lblMessage_1);
		
		JLabel lblDecryption = new JLabel("Decryption: ");
		lblDecryption.setForeground(Color.WHITE);
		lblDecryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDecryption.setBounds(274, 426, 216, 39);
		getContentPane().add(lblDecryption);
		
		txtDecMessage = new JTextField();
		txtDecMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecMessage.setColumns(10);
		txtDecMessage.setBounds(274, 514, 254, 49);
		getContentPane().add(txtDecMessage);
		
		// Decrypt - Unlock and Key
		btnDecrypt = new JButton("DECRYPT");

		ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Key.png");
		Image originalImage1 = originalIcon1.getImage();
		Image scaledImage1 = originalImage1.getScaledInstance(30, 40, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
		btnDecrypt.setIcon(scaledIcon1);
		
		btnDecrypt.setForeground(new Color(70, 130, 180));
		btnDecrypt.setBackground(Color.WHITE);
		btnDecrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDecrypt.setBounds(519, 603, 185, 65);
		getContentPane().add(btnDecrypt);
		
		txtDecOutput = new JTextField();
		txtDecOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecOutput.setColumns(10);
		txtDecOutput.setBounds(690, 517, 254, 44);
		getContentPane().add(txtDecOutput);
		
		JLabel lblOutput_1 = new JLabel("PLAINTEXT:");
		lblOutput_1.setForeground(Color.WHITE);
		lblOutput_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput_1.setBounds(696, 474, 248, 39);
		getContentPane().add(lblOutput_1);
		
		lblKeyword2 = new JLabel("Keyword");
		lblKeyword2.setForeground(Color.WHITE);
		lblKeyword2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblKeyword2.setBounds(553, 230, 117, 39);
		getContentPane().add(lblKeyword2);
		
		txtEncKeyword = new JTextField();
		txtEncKeyword.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncKeyword.setColumns(10);
		txtEncKeyword.setBounds(553, 279, 109, 39);
		getContentPane().add(txtEncKeyword);
		
		txtDecKeyword = new JTextField();
		txtDecKeyword.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecKeyword.setColumns(10);
		txtDecKeyword.setBounds(553, 519, 109, 39);
		getContentPane().add(txtDecKeyword);
		
		JLabel lblKeyword = new JLabel("Keyword:");
		lblKeyword.setForeground(Color.WHITE);
		lblKeyword.setFont(new Font("Verdana", Font.BOLD, 16));
		lblKeyword.setBounds(553, 474, 117, 39);
		getContentPane().add(lblKeyword);
		
		// BACKGROUND
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(VigenereCipher.class.getResource("/FinalCaseStudy/Background.png")));
				
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
		} else if (e.getSource() == btnExit) {
	            dispose();
		} else if (e.getSource() == btnEncrypt) {
            String plaintext = txtEncMessage.getText();
            String keyword = txtEncKeyword.getText();
            if (!isValidInput(plaintext) || !isValidInput(keyword)) {
                JOptionPane.showMessageDialog(this, "Invalid input. Use letters only.");
                return;
            }
            txtEncOutput.setText(encrypt(plaintext, keyword));
        } else if (e.getSource() == btnDecrypt) {
            String ciphertext = txtDecMessage.getText();
            String keyword = txtDecKeyword.getText();
            if (!isValidInput(ciphertext) || !isValidInput(keyword)) {
                JOptionPane.showMessageDialog(this, "Invalid input. Use letters only.");
                return;
            }
            txtDecOutput.setText(decrypt(ciphertext, keyword));
        } else if (e.getSource() == btnClear) {
            txtEncMessage.setText("");
            txtEncKeyword.setText("");
            txtEncOutput.setText("");
            txtDecMessage.setText("");
            txtDecKeyword.setText("");
            txtDecOutput.setText("");
        }
    }

    private boolean isValidInput(String input) {
        return input != null && input.matches("[a-zA-Z]+");
    }

    private String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' + (key.charAt(keyIndex) - 'a')) % 26) + 'A');
                result.append(ch);
                keyIndex = (keyIndex + 1) % key.length();
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' + (key.charAt(keyIndex) - 'a')) % 26) + 'a');
                result.append(ch);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' - (key.charAt(keyIndex) - 'a') + 26) % 26) + 'A');
                result.append(ch);
                keyIndex = (keyIndex + 1) % key.length();
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' - (key.charAt(keyIndex) - 'a') + 26) % 26) + 'a');
                result.append(ch);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}