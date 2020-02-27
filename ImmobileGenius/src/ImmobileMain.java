import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.PreparableStatement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ImmobileMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImmobileMain frame = new ImmobileMain();
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
	public ImmobileMain() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Labels
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Sylfaen", Font.PLAIN, 17));

		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 17));

		// Caselle di testo
		txtUsername = new JTextField();
		txtUsername.setColumns(10);

		txtPassWord = new JTextField();
		txtPassWord.setColumns(10);

		// Bottone
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
				// connessione al database
				try {
					Class.forName("org.postgresql.Driver");

					Connection con = DriverManager.getConnection("jdbc:postgresql:postgres", "postgres", "diegoAmico");

					String user = txtUsername.getText();
					String pass = txtPassWord.getText();

					// codice per collegarsi alla tabella utenti
					String query = "select   *   from utenti where Username=? and Password=? ";

				
					PreparedStatement stmt = con.prepareStatement(query);

					stmt.setString(1, user);
					stmt.setString(2, pass);

					ResultSet Show = stmt.executeQuery();

					// Condizione per passare al secondo Jframe
					
					if (Show.next()) {

						JOptionPane.showMessageDialog(null, "Welcome");

						SecondoImmobileJframe se = new SecondoImmobileJframe(Show.getString("Email"));

						se.setVisible(true);
					} 
					else {
						
						JOptionPane.showMessageDialog(null, "Username or Password not correct");
					}

				} catch (SQLException a) {
					a.printStackTrace();
				} catch (ClassNotFoundException a) {
					a.printStackTrace();

				}

			}
		});
		
		//Settaggi del tasto login
		btnLogin.setBackground(SystemColor.info);
		btnLogin.setFont(new Font("Sylfaen", Font.PLAIN, 15));

		// Layout
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPassWord, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
						.addContainerGap(30, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING,
						gl_contentPane.createSequentialGroup().addGap(160)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(179, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap(55, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
						.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(70).addComponent(btnLogin).addContainerGap()));
		contentPane.setLayout(gl_contentPane);

	}
}
