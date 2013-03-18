package VisaoDoJogador;
import javax.swing.*;

public class Tela {

	private JFrame frame = new JFrame();
	
	public void desenhaTela(String foto){
		
		this.frame.getContentPane().add(new JLabel(new ImageIcon(foto)));  
		this.frame.setVisible(true);
	    this.frame.setSize(1000,800);
	    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    this.frame.setLocationRelativeTo(null); 
	}
	
	public JFrame getFrame(){
		return this.frame;
	}
}
