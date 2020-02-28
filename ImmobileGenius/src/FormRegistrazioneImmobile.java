import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FormRegistrazioneImmobile extends JFrame {

	private JPanel contentPane;
	 private JTextField txtNome;
	 private JTextField txtPassword;
	private JTextField txtEmail;
	private JTextField txtRuolo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormRegistrazioneImmobile frame = new FormRegistrazioneImmobile();
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
	public FormRegistrazioneImmobile() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblRegistrazione = new JLabel("REGISTRAZIONE");
		lblRegistrazione.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrazione.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		
		// Labels
		JLabel lblNome = new JLabel("Nome");
		
		JLabel lblPassword = new JLabel("Password");
		
        JLabel lblEmail = new JLabel("Email");
		
		JLabel lblRuolo= new JLabel("Ruolo");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtPassword= new JTextField();
		txtPassword.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtRuolo = new JTextField();
		txtRuolo.setColumns(10);
		
		JButton btnRegistrami = new JButton("Registrami");
		
		btnRegistrami.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					Class.forName("org.postgresql.Driver");

					Connection con = DriverManager.getConnection("jdbc:postgresql:postgres", "postgres", "diegoAmico");

					String user = txtNome.getText();
					String pass = txtPassword.getText();
					String email = txtEmail.getText();
					String role = txtRuolo.getText();
					
					if(user.isEmpty() || pass.isEmpty() ||  email.isEmpty()||  role.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Prego,Compili tutti i dati");
					
					}
					else {
						String insert = "insert into utenti (Username,Password,Email,Ruolo)"
							      + " values("
							      + "'"+user+"',"
							      + "'"+pass+"',"
							      + "'"+email+"',"
							      + "'"+role+"'"
							      + ")";
					
					Statement stmt = con.createStatement();

					
                      stmt.executeUpdate(insert);
                      JOptionPane.showMessageDialog(null, "Registrazione effettuata");
                      setVisible(false);
						
					};
				
					
				}
				catch (SQLException t) {
						t.printStackTrace();
					} catch (ClassNotFoundException t) {
						t.printStackTrace();

					}
				 
			}
		});
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(88)
							.addComponent(lblRegistrazione, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome)
								.addComponent(lblPassword)
								.addComponent(lblEmail)
								.addComponent(lblRuolo))
							.addGap(72)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtNome)
								.addComponent(txtPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
								.addComponent(txtEmail, Alignment.LEADING)
								.addComponent(txtRuolo)
								.addComponent(btnRegistrami, Alignment.LEADING))))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRegistrazione, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNome)
							.addGap(33)
							.addComponent(lblPassword))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblRuolo)
						.addComponent(txtRuolo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
					.addComponent(btnRegistrami)
					.addGap(112))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
