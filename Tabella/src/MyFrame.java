import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.JTableHeader;

import java.util.Vector;
 
 
/*
 * Articolo SoloPC: JTable
 * Autore: RootkitNeo
 *
 */
 
class MyFrame extends JFrame {
  // Variabili di istanza
  // ----------------------------------------------------------------------------------
  private JTable table;                // Tabella
  private MyTableModel  model;          // Model personalizzato della tabella
  private JToolBar toolBar;            // ToolBar
  private JButton insert;       // Bottone

  
  MyFrame() {
    super("JTable Example");
    
    try {
      
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch(Exception e) {}
    
    // Toolbar e bottoni della toolbar
    toolBar = new JToolBar();
    insert = new JButton("Inserisci");
    
    
    // Aggiunta dei bottoni
    toolBar.add(insert);
    
    // Aggiunta dela toolbar
    add(toolBar, BorderLayout.EAST);
    
    // Pannello contenitore della tabella
    JPanel panel = new JPanel();
    model = new MyTableModel ();
   
    model.addColumn("Nome");
    model.addColumn("Cognome");
    model.addColumn("Età");
    model.addColumn("Comune_di_nascita");
   
    
    table = new JTable(model);
    JTableHeader t = table.getTableHeader();
    table.getTableHeader().setOpaque(false);
    table.setDefaultRenderer(Object.class, new MyTableCellRenderer());
    
    
    JScrollPane scrollPane = new JScrollPane(table);
 
    // Aggiunta scroll pane, ed aggiunta del pannello al frame
    panel.add(scrollPane);
    add(panel);
    t.setBackground(Color.yellow);
    
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    // Click sul bottone di inserimento
    insert.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        // Creo una riga vuota; ogni elemento e' una cella
        Vector<String> row = new Vector<String>();
        
        row.add("");
        row.add("");
        row.add("");
        row.add("");
        model.addRow(row);
      }
    });
    
   
    
  }
  
  
  public static void makeGUI() {
    MyFrame mf = new MyFrame();
    mf.setSize(600,600);
    mf.setVisible(true);
  }
  
  
  public static void main(String[] args) {
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          makeGUI();
        }
      });
    } catch(Exception e) {}
  }
}