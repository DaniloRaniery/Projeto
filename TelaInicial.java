import javax.swing.*;

public class TelaInicial {
	public static void main(String[] args) {
		boolean iniciar=true;
		while(iniciar ==true){
			String escolha=JOptionPane.showInputDialog("\n1 - Novo jogo\n2 -Instruções\n3 -Ranking\n4 -Sair");
		    int escolhaint=Integer.parseInt(escolha);
		    switch(escolhaint){
		    case 1:
		    	String escolhaJogador=JOptionPane.showInputDialog("1 - Com um jogador\n2 -Com dois jogadores ");
		    	int escolhaJogadorInt=Integer.parseInt(escolhaJogador);
		    	switch(escolhaJogadorInt){
		    	case 1:
		    		String nomeJogador1= JOptionPane.showInputDialog("digite o nome");
		    		break;
		    	case 2:
		    		int quantJogador=Integer.parseInt(JOptionPane.showInputDialog("1 -Jogar com um amigo\n2 -Jogar com pc "));
		    		String nomeJogador01= JOptionPane.showInputDialog("digite seu nome ");
		    		switch(quantJogador){
		    		case 1:
		    			String nomeJogador2=JOptionPane.showInputDialog("digite o nome jogador 2");
		    			break;
		    		case 2:
		    			//jogar com pc
		    			break;
		    		default:
		    			JOptionPane.showMessageDialog(null,"opção inválida");
		    		}
		    		
		    		break;
		    	default:
		    		JOptionPane.showMessageDialog(null,"opção inválida");
		    		break;
		    	}
		    	
		    	JOptionPane.showMessageDialog(null,"jogo iniciado!");
		    	
		    	break;
		    case 2:
		    	//instruções o jogo
		    	break;
		    case 3:
		    	//ranking
		    	break;
		    case 4:
		    	iniciar=false;
		    	break;
		    default:
		    	JOptionPane.showMessageDialog(null,"opção inválida");
		    
		    }
		
		}
	}

}
