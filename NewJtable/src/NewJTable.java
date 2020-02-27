import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class NewJTable extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JTextField txtComune_di_nascita;
	private JTextField txtEtà;
	private JtableRenderer table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJTable frame = new NewJTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public NewJTable() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtNome = new JTextField();
		txtNome.setColumns(10);

		txtCognome = new JTextField();
		txtCognome.setColumns(10);

		txtComune_di_nascita = new JTextField();
		txtComune_di_nascita.setColumns(10);

		// BOTTONE
		JButton btnInserisci = new JButton("Inserisci");
		JButton btnRimuovi= new JButton("Rimuovi");
		
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String a[] = { txtNome.getText(), txtCognome.getText(), txtEtà.getText(),
						txtComune_di_nascita.getText(), };

				DefaultTableModel dtm = (DefaultTableModel) table.getModel();

				dtm.addRow(a);

			}
			
			
		});

		txtEtà = new JTextField();
		txtEtà.setColumns(10);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblEta = new JLabel("Et\u00E0");
		lblEta.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblComuneDiNascita = new JLabel("Comune di nascita");
		lblComuneDiNascita.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNome)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCognome)
								.addComponent(txtCognome, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtEtà, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEta))
							.addGap(103)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblComuneDiNascita, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtComune_di_nascita, Alignment.TRAILING))
							.addGap(24)
							.addComponent(btnInserisci)
							.addGap(26))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
							.addGap(45))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEta)
						.addComponent(lblCognome)
						.addComponent(lblComuneDiNascita)
						.addComponent(lblNome))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEtà, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCognome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtComune_di_nascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInserisci)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);

		table = new JtableRenderer();

		JTableHeader th = table.getTableHeader();
		th.setBackground(Color.yellow);
		Object[][] data = new String[25][4];
		int a = 0;
		int b = 0;
		int c = 0;
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\Febbraio.txt"));
		while (b < 25) {
			String re = reader.readLine();

			String parti[] = re.split(",");
			for (String str : parti) {

				data[b][c] = str;
				c++;
				if (c == 4) {
					break;
				}
			}
			b++;
			c = 0;
		}

		table.setModel(new DefaultTableModel(data, new String[] { "Nome", "Cognome", "Età", "Comune_Di_Nascita" }));

		table.setPreferredSize(new Dimension(100, 800));
		table.setEditingColumn(4);

		scrollPane.setViewportView(table);
		;

		contentPane.setLayout(gl_contentPane);
	}
}
