import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TableDemo extends JFrame {
	public TableDemo() throws IOException {

		LetturaDaFile l = new LetturaDaFile();
		String[] header = { "Nome", "Cognome", "Età", "Comune_di_nascita" };
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\utente\\Desktop\\Febbraio.txt"));

		

		String[][] data = new String[25][4];

		int a = 0;
		int b = 0;
		int c = 0;

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

		MyJTable table = new MyJTable(data, header);
		JTableHeader t = table.getTableHeader();
		
		t.setBackground(Color.yellow);
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);
		

		JButton btnInserisci = new JButton("Inserisci");
		btnInserisci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String f[] = { "", "", "", "" };
				
				

			}
		});
		scrollPane.setRowHeaderView(btnInserisci);
		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class MyJTable extends JTable {
		MyJTable(String[][] data, String[] header) {
			super(data, header);
		}

		public Component prepareRenderer(javax.swing.table.TableCellRenderer renderer, int row, int col) {
			Component comp = super.prepareRenderer(renderer, row, col);
			if (row % 2 == 0) {
				comp.setBackground(Color.white);
			} else {
				comp.setBackground(Color.GRAY);
			}
			return comp;
		}
	}

	public static void main(String[] args) throws IOException {
		new TableDemo();

	}

}
