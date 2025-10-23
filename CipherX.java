package FinalCaseStudy;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class CipherX extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnHome,  btnPolybius, btnBifid, btnVigenere, btnCipherX, btnEncrypt, btnDecrypt, btnClear, btnExit;
	private JTextField txtEncMessage;
	private JTextField txtEncOutput;
	private JTextField txtDecMessage;
	private JTextField txtDecOutput;
	private JLabel lblShiftValue;
	private JTextField txtEncShift;
	private JTextField txtDecShift;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CipherX window = new CipherX();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CipherX() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CipherX.class.getResource("/FinalCaseStudy/AI ANGRY.png")));
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
		btnClear.setBounds(782, 596, 170, 65);
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
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JLabel lblCipherX = new JLabel("CipherX");
		lblCipherX.setForeground(Color.WHITE);
		lblCipherX.setFont(new Font("Verdana", Font.BOLD, 30));
		lblCipherX.setBounds(274, 32, 363, 49);
		getContentPane().add(lblCipherX);
		
		JTextArea txtrOneOfThe = new JTextArea();
		txtrOneOfThe.setForeground(new Color(70, 130, 180));
		txtrOneOfThe.setEditable(false);
		txtrOneOfThe.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtrOneOfThe.setBackground(Color.WHITE);
		txtrOneOfThe.setLineWrap(true);
		txtrOneOfThe.setText("A cipher with a multi-layer transformation that’s intriguing and tough to crack, kahit itanong mo sa doctor. A modern, edgy name reflecting our cipher’s x separator that uses some characteristics of other ciphers.");
		txtrOneOfThe.setBounds(307, 91, 645, 77);
		getContentPane().add(txtrOneOfThe);
		
		txtEncMessage = new JTextField();
		txtEncMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncMessage.setForeground(new Color(0, 0, 0));
		txtEncMessage.setBounds(274, 279, 254, 49);
		getContentPane().add(txtEncMessage);
		txtEncMessage.setColumns(10);
		
		JLabel lblMessage = new JLabel("PLAINTEXT:");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage.setBounds(274, 225, 216, 39);
		getContentPane().add(lblMessage);
		
		// Encrypt - Lock and Key
		btnEncrypt = new JButton("ENCRYPT");

		ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\LockAndKey.png");
		Image originalImage2 = originalIcon2.getImage();
		Image scaledImage2 = originalImage2.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		btnEncrypt.setIcon(scaledIcon2);
		
		btnEncrypt.setForeground(new Color(70, 130, 180));
		btnEncrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEncrypt.setBounds(512, 351, 185, 65);
		getContentPane().add(btnEncrypt);
		
		JLabel lblEncryption = new JLabel("Encryption: ");
		lblEncryption.setForeground(Color.WHITE);
		lblEncryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEncryption.setBounds(274, 191, 216, 39);
		getContentPane().add(lblEncryption);
		
		JLabel lblOutput = new JLabel("CIPHERTEXT:");
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput.setBounds(696, 225, 229, 39);
		getContentPane().add(lblOutput);
		
		txtEncOutput = new JTextField();
		txtEncOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncOutput.setForeground(new Color(0, 0, 0));
		txtEncOutput.setColumns(10);
		txtEncOutput.setBounds(696, 279, 248, 49);
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
		txtDecMessage.setForeground(new Color(0, 0, 0));
		txtDecMessage.setColumns(10);
		txtDecMessage.setBounds(274, 519, 267, 49);
		getContentPane().add(txtDecMessage);
		
		// Decrypt - Unlock and Key
		btnDecrypt = new JButton("DECRYPT");

		ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Unlock.png");
		Image originalImage1 = originalIcon1.getImage();
		Image scaledImage1 = originalImage1.getScaledInstance(60, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
		btnDecrypt.setIcon(scaledIcon1);
		
		btnDecrypt.setForeground(new Color(70, 130, 180));
		btnDecrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDecrypt.setBounds(512, 596, 202, 65);
		getContentPane().add(btnDecrypt);
		
		txtDecOutput = new JTextField();
		txtDecOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecOutput.setForeground(new Color(0, 0, 0));
		txtDecOutput.setColumns(10);
		txtDecOutput.setBounds(699, 519, 245, 49);
		getContentPane().add(txtDecOutput);
		
		JLabel lblOutput_1 = new JLabel("PLAINTEXT:");
		lblOutput_1.setForeground(Color.WHITE);
		lblOutput_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput_1.setBounds(696, 474, 248, 39);
		getContentPane().add(lblOutput_1);
		
		lblShiftValue = new JLabel("Shift value");
		lblShiftValue.setForeground(Color.WHITE);
		lblShiftValue.setFont(new Font("Verdana", Font.BOLD, 16));
		lblShiftValue.setBounds(553, 225, 117, 39);
		getContentPane().add(lblShiftValue);
		
		txtEncShift = new JTextField();
		txtEncShift.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncShift.setForeground(new Color(0, 0, 0));
		txtEncShift.setColumns(10);
		txtEncShift.setBounds(551, 279, 109, 39);
		getContentPane().add(txtEncShift);
		
		txtDecShift = new JTextField();
		txtDecShift.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecShift.setForeground(new Color(0, 0, 0));
		txtDecShift.setColumns(10);
		txtDecShift.setBounds(561, 519, 109, 39);
		getContentPane().add(txtDecShift);
		
		JLabel lblKeyword = new JLabel("Shift value:");
		lblKeyword.setForeground(Color.WHITE);
		lblKeyword.setFont(new Font("Verdana", Font.BOLD, 16));
		lblKeyword.setBounds(553, 474, 117, 39);
		getContentPane().add(lblKeyword);
		
		// BACKGROUND
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(CipherX.class.getResource("/FinalCaseStudy/Background.png")));
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
		} else if (e.getSource() == btnClear) {
            txtEncMessage.setText("");
            txtEncShift.setText("");
            txtEncOutput.setText("");
            txtDecMessage.setText("");
            txtDecShift.setText("");
            txtDecOutput.setText("");
		} else if (e.getSource() == btnEncrypt) {
            try {
                String plaintext = txtEncMessage.getText().toUpperCase().replaceAll("[^A-Z]", "");
                int shift = Integer.parseInt(txtEncShift.getText());
                if (!isValidInput(plaintext)) {
                    JOptionPane.showMessageDialog(this, "Invalid input. Letters only.");
                    return;
                } if (plaintext.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter a plaintext message to encrypt.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; }
                txtEncOutput.setText(encrypt(plaintext, shift));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid numeric shift.");
            } 
        } else if (e.getSource() == btnDecrypt) {
            try {
                String ciphertext = txtDecMessage.getText();
                int shift = Integer.parseInt(txtDecShift.getText());
                if (ciphertext.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter a ciphertext message to dencrypt.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; }
                txtDecOutput.setText(decrypt(ciphertext, shift));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid numeric shift.");
            }
        }
    }

    private boolean isValidInput(String input) {
        return input != null && input.matches("[a-zA-Z]+");
    }

    private String encrypt(String text, int key) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            char shiftedChar = (char) ('A' + (c - 'A' + key) % 26);
            int number = shiftedChar - 'A' + 1;
            sb.append(number).append('x');
        }
        
        sb.setLength(sb.length() - 1);
        return sb.reverse().toString();
    }

    private String decrypt(String encryptedText, int key) {
        String reversed = new StringBuilder(encryptedText).reverse().toString();
        String[] numbers = reversed.split("x");
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            int position = Integer.parseInt(number);
            char letter = (char) ('A' + (position - 1 - key + 26) % 26);
            sb.append(letter);
        }
        return sb.toString();
    }
}

