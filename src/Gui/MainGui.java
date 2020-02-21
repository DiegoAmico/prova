package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class MainGui {
	
	// metodo per inserire una pausa
	static void pausa(int secondi)
	{
		try {
			Thread.sleep(1000*secondi);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	
	
	

	public static void main(String[] args) {

		//Cornice o perimetro della nostra finestra
		JFrame finestra = new JFrame("Prima finestra Swing");
		
		finestra.setBounds(500, 500, 600, 300);
		
		Container contenuto = finestra.getContentPane();
		
		contenuto.setLayout(new BoxLayout(contenuto,BoxLayout.X_AXIS));
		
		// Una JLabel è un'etichetta
		JLabel label1 =new JLabel("Primo applicati");
		JLabel label2 =new JLabel("Secondo applicati");
		JLabel label3 =new JLabel("Terzo applicati");
		JLabel label4 =new JLabel("Quarto applicativo");
		JLabel label5 =new JLabel("Quinto applicativo");
		JLabel label6 =new JLabel("Sesto applicativo");
		
		//Pannelli o contenitori
		JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		JPanel sep = new JPanel();
		
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		sep.setLayout(new BoxLayout(sep, BoxLayout.Y_AXIS));
		
		contenuto.add(sx);
		contenuto.add(sep);
		contenuto.add(dx);
		
		
		sep.add(new JButton("Bottone 1"));
		sep.add(new JButton("Bottone 2"));
		sep.add(new JButton("Bottone 3"));
		
		
		finestra.add(label1);
		finestra.add(label2);
		finestra.setVisible(true);
		
		//Con setOpaque rendiamo lo sfondo da trasparente(default) a opaco ,e quindi modificabile.
		label1.setOpaque(true);
		label1.setForeground(Color.white);
		label1.setBackground(Color.BLUE);
		sx.add(label1);
					
		
		//Secondo appli
		label2.setOpaque(true);
		label2.setForeground(Color.BLUE);
		label2.setBackground(Color.pink);
		sx.add(label2);
		
		//Terzo appli
		label3.setOpaque(true);
		label3.setForeground(Color.BLUE);
		label3.setBackground(Color.GREEN);
		sx.add(label3);
					
		
		//Quarto applicativo
		label4.setOpaque(true);
		label4.setForeground(Color.BLACK);
		label4.setBackground(Color.LIGHT_GRAY);
		dx.add(label4);
		
		//Quinto applicativo
		label5.setOpaque(true);
		label5.setForeground(Color.cyan);
		label5.setBackground(Color.MAGENTA);
		dx.add(label5);
					
		
		//Sesto applicativo
		label6.setOpaque(true);
		label6.setForeground(Color.ORANGE);
		label6.setBackground(Color.BLACK);
		dx.add(label6);
		
		
		
		
		// superficie visibile
		contenuto.setBackground(Color.cyan);
		
		
		
		
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
