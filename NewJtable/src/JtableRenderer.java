import java.awt.Color;
import java.awt.Component;
import java.io.IOException;

import javax.swing.JTable;



class JtableRenderer extends JTable {
	JtableRenderer() {
		super();
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



