import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;
 

 
class MyTableCellRenderer extends JLabel implements TableCellRenderer {
  
	
	
  MyTableCellRenderer() {
    setOpaque(true);
  }
 
  
  public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected,boolean hasFocus,int row,int column) {
    if((row % 2) == 0) setBackground(Color.LIGHT_GRAY);
    else setBackground(Color.WHITE);
    
    
    
    setVerticalAlignment(CENTER);
    setHorizontalAlignment(CENTER);
    
    
  


  
    
    return this;
  }
}