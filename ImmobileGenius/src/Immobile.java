import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Immobile {
	
	
	 JButton b1 = new JButton("Bottone 1");
	
	 
	 public  void setTastoblue() {
		
				
		
		    b1.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseEntered(MouseEvent e) {
		    		b1.setBackground(Color.blue);
		    		
		    		
		    	}
		    });
		    
		   
	}

}
