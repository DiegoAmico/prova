import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
 
import java.util.Vector;
 
 

 
 
// Implementazione personalizzata di parte
// dei metodi definti da AbstractTableModel
class MyTableModel  extends AbstractTableModel {
  // Variabili di istanza
  // -----------------------------------------------------------------------
  private Vector<Vector<String>> data;    // Celle della tabella "griglia"
  private Vector<String> header;          // Nomi delle colonne
  // -----------------------------------------------------------------------
  
  MyTableModel () {
    data = new Vector<Vector<String>>();
    header = new Vector<String>();
  }
  
  
 
  public int getColumnCount() {
    if(header == null) return -1;
    return header.size();
  }
  
  public int getRowCount() {
    return data.size();
  }
  
  public String getColumnName(int col) {
    if(col >= header.size()) return null;
    return header.elementAt(col);
  }
  
  // Tipo di dato che restituisce in base alla colonna
  public Class getColumnClass(int c) {
    return String.class;
  }
  
  
  
  public String getValueAt(int row, int col) {
    Vector<String> v = data.elementAt(row);
    return v.elementAt(col);
  }
  
  public void setValueAt(Object value, int row, int col) {
    Vector<String> v = data.elementAt(row);
    v.setElementAt((String)value, col);
    fireTableCellUpdated(row,col);
    
  }
  
  public void addRow(Vector<String> row) {
    insertRow(row, getRowCount());
  }
  
  public void addColumn(String colName) {
    header.add(colName);
  }
  
  public void insertRow(Vector<String> row, int r) {
    data.insertElementAt(row,r);
    fireTableRowsInserted(r, r);
  }
  
   
  
  public void newRowsAdded(TableModelEvent e) {
    fireTableChanged(e);
  }
}