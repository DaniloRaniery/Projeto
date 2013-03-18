package VisaoDoJogador;

import javax.swing.*;

import LogicaDoJogo.JogoFachada;


public class MenuPrincipal{
	
	public static void main(String[] args) {
		
		boolean iniciar = true;
		JogoFachada jogo = new JogoFachada();
		String nomeJogador = "";
		IniciarJogo playGame;
		Tela frameInstrucoes = new Tela();
		Tela frameTelaInicial = new Tela();
		
		frameTelaInicial.desenhaTela("./imagens/TelaInicial.jpg");
	
		while(iniciar){
			try{
				String escolha = JOptionPane.showInputDialog("\n1 - NOVO JOGO\n2 - INSTRUÇÕES\n3 - RANKING\n4 - SAIR ");
				int auxiliar = Integer.parseInt(escolha);
					
				switch(auxiliar){
		    		case 1:
		    			nomeJogador = JOptionPane.showInputDialog("DIGITE O NOME DO JOGADOR: ");
		    			playGame = new IniciarJogo(jogo, nomeJogador);	
		    			break;
		    		case 2:
		    			frameTelaInicial.getFrame().setVisible(false);
		    			frameInstrucoes.desenhaTela("./imagens/instruções.jpg");
		    			JOptionPane.showMessageDialog(null,"");
		    			frameInstrucoes.getFrame().setVisible(false);
		    			frameTelaInicial.desenhaTela("./imagens/TelaInicial.jpg");
		    			break;
		    		case 3:
		    			if(jogo.recuperarRanking().size()==0){
		    				JOptionPane.showMessageDialog(null,"                  ~> RANKING <~\n "+"RANKING VAZIO");
		    			}
		    			else{
		    				JOptionPane.showMessageDialog(null,"                  ~> RANKING <~\n "+jogo.recuperarRanking());
		    			}
		    			break;
		    		case 4:
		    			System.exit(0);
		    			break;
		    		default:
		    			JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
				}
			}
			catch(NumberFormatException exc){
				//Só para não quebrar a execução do programa.
			}
		}
	}
}
