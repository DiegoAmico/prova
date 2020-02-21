import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Year;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class FinestraConBottone {
	
	Container contenuto =null;
	public FinestraConBottone(){
		
		JFrame finestra = new JFrame("Esempio con listener");
	   	finestra.setBounds(500, 500, 600, 200);
	    contenuto = finestra.getContentPane();
	    contenuto.setLayout(new BoxLayout(contenuto,BoxLayout.Y_AXIS));
	    
	    JButton b1 = new JButton("Bottone 1");
	    
	    contenuto.add(b1);
	    
	    b1.addActionListener(new clicBottone());
	    
	    JTextField cognome= new JTextField();
	    
	    cognome.addKeyListener(new intercettaTasti());
	   contenuto.add(cognome);
	   
	    
	    finestra.setVisible(true);
	    finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	private class clicBottone implements ActionListener{
		
		
		
		public void actionPerformed (ActionEvent eve) {
			
			contenuto.setBackground(Color.BLACK);
			
		
	}
}
	
	
	private class intercettaTasti implements KeyListener{

		

		@Override
		public void keyPressed(KeyEvent e) 
		{}

		@Override
		public void keyReleased(KeyEvent e) {
			JTextField casellaTesto =(JTextField) e.getSource();
			String testo =casellaTesto.getText();
			casellaTesto.setText(testo.toUpperCase());
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			
			
		}
		
	}
}
