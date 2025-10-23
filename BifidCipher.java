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

public class BifidCipher extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnHome,  btnPolybius, btnBifid, btnVigenere, btnCipherX, btnEncrypt, btnDecrypt, btnClear, btnExit;
	private JTextField txtEncMessage;
	private JTextField txtEncOutput;
	private JTextField txtDecMessage;
	private JTextField txtDecOutput;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BifidCipher window = new BifidCipher();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BifidCipher() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BifidCipher.class.getResource("/FinalCaseStudy/AI ANGRY.png")));
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
		btnClear.setBounds(787, 605, 170, 65);
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
		ImageIcon originalIcon4 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\AI WINK.png");
	
		Image originalImage4 = originalIcon4.getImage();
		Image scaledImage4 = originalImage4.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
		btnExit.setIcon(scaledIcon4);
		
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setForeground(new Color(70, 130, 180));
		btnExit.setFont(new Font("Verdana", Font.BOLD, 20));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(0, 635, 238, 78);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Bifid Cipher");
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
		txtrOneOfThe.setText("The Bifid Cipher uses a Polybius Square to encipher a message in a way that makes it fairly difficult to decipher without knowing the secret. This is because each letter in \r\nthe ciphertext message is dependent upon two letters from the plaintext message. \r\nAs a result, frequency analysis of letters becomes much more difficult.");
		txtrOneOfThe.setBounds(296, 91, 626, 77);
		getContentPane().add(txtrOneOfThe);
		
		txtEncMessage = new JTextField();
		txtEncMessage.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncMessage.setBounds(274, 286, 293, 49);
		getContentPane().add(txtEncMessage);
		txtEncMessage.setColumns(10);
		
		JLabel lblMessage = new JLabel("PLAINTEXT:");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Verdana", Font.BOLD, 16));
		lblMessage.setBounds(274, 237, 216, 39);
		getContentPane().add(lblMessage);
		
		// Encrypt - Lock
		btnEncrypt = new JButton("ENCRYPT");
		
		ImageIcon originalIcon2 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\LockAndKey.png");
		Image originalImage2 = originalIcon2.getImage();
		Image scaledImage2 = originalImage2.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		btnEncrypt.setIcon(scaledIcon2);
				
		btnEncrypt.setBackground(Color.WHITE);
		btnEncrypt.setForeground(new Color(70, 130, 180));
		btnEncrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEncrypt.setBounds(507, 362, 170, 63);
		getContentPane().add(btnEncrypt);
		
		JLabel lblEncryption = new JLabel("Encryption: ");
		lblEncryption.setForeground(Color.WHITE);
		lblEncryption.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEncryption.setBounds(274, 203, 216, 39);
		getContentPane().add(lblEncryption);
		
		JLabel lblOutput = new JLabel("CIPHERTEXT:");
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput.setBounds(624, 237, 317, 39);
		getContentPane().add(lblOutput);
		
		txtEncOutput = new JTextField();
		txtEncOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtEncOutput.setColumns(10);
		txtEncOutput.setBounds(630, 286, 293, 49);
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
		txtDecMessage.setBounds(274, 519, 293, 49);
		getContentPane().add(txtDecMessage);
		
		// Decrypt - Key
		btnDecrypt = new JButton("DECRYPT");
		
		ImageIcon originalIcon1 = new ImageIcon("C:\\Users\\jerec\\Downloads\\Pictures\\Unlock.png");
		Image originalImage1 = originalIcon1.getImage();
		Image scaledImage1 = originalImage1.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
		btnDecrypt.setIcon(scaledIcon1);
				
		btnDecrypt.setBackground(Color.WHITE);
		btnDecrypt.setForeground(new Color(70, 130, 180));
		btnDecrypt.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDecrypt.setBounds(507, 605, 170, 65);
		getContentPane().add(btnDecrypt);
		
		txtDecOutput = new JTextField();
		txtDecOutput.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtDecOutput.setColumns(10);
		txtDecOutput.setBounds(630, 519, 293, 49);
		getContentPane().add(txtDecOutput);
		
		JLabel lblOutput_1 = new JLabel("PLAINTEXT:");
		lblOutput_1.setForeground(Color.WHITE);
		lblOutput_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOutput_1.setBounds(624, 474, 333, 39);
		getContentPane().add(lblOutput_1);
		

		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(BifidCipher.class.getResource("/FinalCaseStudy/Background.png")));
			
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
            if (!isValidInput(plaintext)) {
                JOptionPane.showMessageDialog(this, "Invalid input. Only letters A-Z (J replaced with I) are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String ciphertext = encrypt(plaintext);
            txtEncOutput.setText(ciphertext);

        } else if (e.getSource() == btnDecrypt) {
            String ciphertext = txtDecMessage.getText();
            if (ciphertext.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a ciphertext to decrypt.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } if (!isValidInput(ciphertext)) {
                JOptionPane.showMessageDialog(this, "Invalid input. Only letters A-Z (J replaced with I) are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
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
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase().replace("J", "I");
        StringBuilder rows = new StringBuilder();
        StringBuilder cols = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                for (int row = 0; row < BIFID_SQUARE.length; row++) {
                    for (int col = 0; col < BIFID_SQUARE[row].length; col++) {
                        if (BIFID_SQUARE[row][col] == c) {
                            rows.append(row + 1);
                            cols.append(col + 1);
                        }
                    }
                }
            }
        }

        String combined = rows.toString() + cols.toString();
        for (int i = 0; i < combined.length(); i += 2) {
            int row = Character.getNumericValue(combined.charAt(i)) - 1;
            int col = Character.getNumericValue(combined.charAt(i + 1)) - 1;
            result.append(BIFID_SQUARE[row][col]);
        }

        return result.toString();
    }

    private String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase().replace("J", "I");
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                for (int row = 0; row < BIFID_SQUARE.length; row++) {
                    for (int col = 0; col < BIFID_SQUARE[row].length; col++) {
                        if (BIFID_SQUARE[row][col] == c) {
                            numbers.append(row + 1).append(col + 1);
                        }
                    }
                }
            }
        }

        int mid = numbers.length() / 2;
        String rows = numbers.substring(0, mid);
        String cols = numbers.substring(mid);

        for (int i = 0; i < rows.length(); i++) {
            int row = Character.getNumericValue(rows.charAt(i)) - 1;
            int col = Character.getNumericValue(cols.charAt(i)) - 1;
            result.append(BIFID_SQUARE[row][col]);
        }

        return result.toString();
    }
    
    private boolean isValidInput(String text) {
        return text.matches("[A-Za-z ]*");
    }

    private static final char[][] BIFID_SQUARE = {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'}
    };
}