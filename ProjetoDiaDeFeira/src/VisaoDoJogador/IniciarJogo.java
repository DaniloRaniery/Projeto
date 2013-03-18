package VisaoDoJogador;

import javax.swing.*;

import LogicaDoJogo.Item;
import LogicaDoJogo.JogoFachada;


public class IniciarJogo {
	
	private int pontuacao = 200, penalidadePorConsulta = 5, parar = 5, levelFinal = 3, levelInicial = 1;
	private Item item = Item.VAZIO;
	private OpcoesDoJogo menu = new OpcoesDoJogo();
	private Tela frame = new Tela();
	private Tela frameVencedor = new Tela();
	private Tela framePerdedor = new Tela();
	private Tela frameCarrinho = new Tela();
	private Tela frameLista = new Tela();
	
	
	
	public IniciarJogo(JogoFachada jogo, String nomeJogador){
		
		this.frame.desenhaTela("./imagens/itens.jpg");	
		
		if(jogo.getLevel()>this.levelInicial){
			jogo.setLevel(this.levelInicial);
			jogo.esvaziarCarrinhoDeCompras();
		}
		
		while(jogo.getLevel() <=3){
			jogo.mudarLevel();
		 
			JOptionPane.showMessageDialog(null,"> >   DIA DE FEIRA   < <  \n" +" > LISTA A SER COMPRADA\n\n"+jogo.getListaComputador() + "\n\n > BOAS COMPRAS!    \n", "DIA DE FEIRA",JOptionPane.QUESTION_MESSAGE);
			    	
			boolean continuaJogo = true;
		
			do{
				this.item = this.menu.adicionarItem();		
				
				jogo.addItemAoCarrinhoDeCompra(this.item,jogo.getLista().getLista().getGerenteDeItens().valorDoItem(this.item));
				this.pontuacao -= jogo.getLista().getLista().getGerenteDeItens().valorDoItem(this.item);		    			
				
				boolean continua = true;		
				do{
					int opContinuar;
					try{
						String opcao = JOptionPane.showInputDialog("1 - VIZUALIZAR LISTA\n2 - VIZUALIZAR CARRINHO\n3 - ADICIONAR MAIS ITENS AO CARRINHO \n4 - FINALIZAR COMPRAS");
						opContinuar = Integer.parseInt(opcao);
					}
					catch(NumberFormatException exc){
						opContinuar = 0;
					}
					switch(opContinuar){
						case 1:
							this.frame.getFrame().setVisible(false);
							this.frameLista.desenhaTela("./imagens/lista.jpg");
							JOptionPane.showMessageDialog(null,jogo.getListaComputador());
							this.frameLista.getFrame().setVisible(false);
							this.frame.getFrame().setVisible(true);
							this.pontuacao -= this.penalidadePorConsulta;
							break;
						case 2:
							this.frame.getFrame().setVisible(false);
							this.frameCarrinho.desenhaTela("./imagens/carrinho.jpg");
							JOptionPane.showMessageDialog(null,jogo.getListaCarrinhoDeCompras());
							this.frameCarrinho.getFrame().setVisible(false);
							this.pontuacao -= this.penalidadePorConsulta;
							this.frame.getFrame().setVisible(true);
							
							break;
						case 3:
							continua = false;
							break;
						case 4:
							continua = false;
							continuaJogo = false;
							if(jogo.verificaSeARespostaEhValida()){
								jogo.esvaziarCarrinhoDeCompras();
								jogo.esvaziarListaDeItensDoComputador();
							}
							else{
								jogo.setLevel(5);
							}
							break;
						default:
							break;
					}			
				}while(continua);
			}while(continuaJogo);
		
			if(jogo.getLevel() == this.parar){
				this.frame.getFrame().setVisible(false);
				this.framePerdedor.desenhaTela("./imagens/vocePerdeu.jpg");	
				JOptionPane.showMessageDialog(null,"VOCÊ PERDEU.\n NOOB!");
				this.framePerdedor.getFrame().setVisible(false);
				
			}
			else if(jogo.getLevel() == this.levelFinal){
				this.frame.getFrame().setVisible(false);
				this.frameVencedor.desenhaTela("./imagens/voceGanhou.jpg");	
				jogo.novoJogador(nomeJogador, this.pontuacao);
				jogo.gravaRanking();
				JOptionPane.showMessageDialog(null,"GANHOU!!!");
				this.frameVencedor.getFrame().setVisible(false);
				jogo.setLevel(this.parar);
			}
			else if((jogo.getLevel() >= this.levelInicial) || (jogo.getLevel() <this.levelFinal)) {
				jogo.setLevel(jogo.getLevel()+1);
			}
			else{
				jogo.setLevel(this.levelInicial);
			} 	
		}
	}
}
