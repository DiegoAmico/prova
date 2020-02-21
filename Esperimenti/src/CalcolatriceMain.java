import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcolatriceMain extends JFrame {

	private JPanel contentPane;
	private JTextField schermo;
	MetodoCalcolatrice m = new MetodoCalcolatrice();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcolatriceMain frame = new CalcolatriceMain();
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
	public CalcolatriceMain() {
		setTitle("Welcome");
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton bBottoneVirgola = new JButton(",");
		bBottoneVirgola.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottonePiù = new JButton("+");
		bBottonePiù.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		schermo = new JTextField();
		schermo.setFont(new Font("Tahoma", Font.PLAIN, 47));
		schermo.setColumns(10);

		JButton bBottoneMeno = new JButton("-");
		bBottoneMeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBottoneMeno.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				m.Sottrazione(schermo.getText());
				schermo.setText("");
			}
		});
		bBottoneMeno.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottonePer = new JButton("*");
		bBottonePer.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				m.Moltiplicazione(schermo.getText());
				schermo.setText("");
			}
		});
		bBottonePer.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone4 = new JButton("4");
		bBottone4.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("4"));
			}
		});
		bBottone4.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone5 = new JButton("5");
		bBottone5.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("5"));
			}
		});
		bBottone5.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone6 = new JButton("6");
		bBottone6.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("6"));
			}
		});
		bBottone6.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone7 = new JButton("7");
		bBottone7.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("7"));
			}
		});
		bBottone7.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone8 = new JButton("8");
		bBottone8.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("8"));
			}
		});
		bBottone8.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone9 = new JButton("9");
		bBottone9.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("9"));
			}
		});
		bBottone9.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottoneDiviso = new JButton("/");
		bBottoneDiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBottoneDiviso.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				m.Divisione(schermo.getText());
				schermo.setText("");;
			}
		});
		bBottoneDiviso.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottoneUguale = new JButton("=");
		bBottoneUguale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bBottoneUguale.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.Risultato(schermo.getText()));
			}
		});
		bBottoneUguale.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone = new JButton("0");
		bBottone.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("0"));
			}
		});
		bBottone.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone1 = new JButton("1");

		bBottone1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("1"));
			}
		});
		bBottone1.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone2 = new JButton("2");
		bBottone2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("2"));
			}
		});
		bBottone2.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton bBottone3 = new JButton("3");
		bBottone3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				schermo.setText(m.addDisplay("3"));
			}
		});
		bBottone3.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				m.Somma(schermo.getText());
				schermo.setText("");
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 22));

		JButton btnClean = new JButton("Clean");
		btnClean.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				schermo.setText("");
				m.display = "";

			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bBottone7)
							.addGap(18)
							.addComponent(bBottone8)
							.addGap(18)
							.addComponent(bBottone9)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnClean))
						.addComponent(bBottone)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bBottone1)
							.addGap(15)
							.addComponent(bBottone2)
							.addGap(18)
							.addComponent(bBottone3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bBottone4)
							.addGap(18)
							.addComponent(bBottone5)
							.addGap(18)
							.addComponent(bBottone6)))
					.addGap(79)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(bBottonePer)
									.addGap(18)
									.addComponent(button))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(bBottoneMeno)
									.addGap(18)
									.addComponent(bBottoneDiviso))))
						.addComponent(bBottoneUguale, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
					.addContainerGap(395, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(schermo)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(schermo, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(bBottone)
						.addComponent(bBottoneMeno)
						.addComponent(bBottoneDiviso))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(bBottone1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(bBottone2)
									.addComponent(bBottone3)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(bBottone4)
								.addComponent(bBottone5)
								.addComponent(bBottone6)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(bBottonePer)
								.addComponent(button))))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(bBottone7)
						.addComponent(bBottone8)
						.addComponent(bBottone9)
						.addComponent(bBottoneUguale, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClean))
					.addContainerGap(238, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
