package br.ufpb.poo;

import java.util.*;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		boolean iniciar = true;
		JogoFacada jogo = new JogoFacada();
		Scanner input = new Scanner(System.in);
		int level = 1, pontuacao = 108, penalidadePorConsulta = 5;
		String item = "", nomeJogador1 = "";
		
		
		while(iniciar == true){
			
			System.out.print("\n1 - Novo jogo\n2 - Instruções\n3 - Ranking\n4 - Sair \n~>");
			int escolha = input.nextInt();
		  
		    switch(escolha){
		    case 1:
		    	System.out.print("1 - Com um jogador\n2 - Com dois jogadores \n~>");
		    	int escolhaJogador = input.nextInt();
		    	
		    	switch(escolhaJogador){
		    	case 1:
		    		System.out.println("Digite seu nome: \n~>");
		    		nomeJogador1 = input.next();
		    		break;
		    	/*case 2:
		    		System.out.print("1 -Jogar com um amigo\n2 -Jogar com pc ");
		    		int quantJogador = input.nextInt();
		    		System.out.print ("Digite seu nome ");
		    		String nomeJogador01 = input.nextLine();
		    	
		    		switch(quantJogador){
		    		case 1:
		    			 System.out.print("Digite o nome jogador 2");
		    			 String nomeJogador2 = input.nextLine();
		    			break;
		    		case 2:
		    			//jogar com pc
		    			break;
		    		default:
		    			System.out.println("Opção inválida");
		    		}
		    		
		    		break;*/
		    	default:
		    		System.out.println("Opção inválida");
		    		level = 6;
		    		break;
		    	}
		    	
		    	while(level <=3){
		    		jogo.listaPorLevel(level);
		    		System.out.println("   \nO DIA DE FEIRA   \n");
		    		System.out.println("   LISTA A SER COMPRADA   ");
		    		jogo.imprimeListaGeradaPeloComputador();
		    		
		    		System.out.println("\n\n    BOAS COMPRAS!    \n");
		    	
		    		boolean continuaJogo = true;
		    		
		    		do{
		    		
		    			System.out.println("Adicionar item");
		    			System.out.print("1 - LEITE | 2 - BISCOITO | 3 - UVA | 4 - REFRIGERANTE | 5 - IOGURTE | 6 - SORVETE" +
		    					"\n7 - TOMATE | 8 - CEBOLA | 9 - CASTANHA | 10 - BATATA | 11 - FARINHA | 12 - MANTEIGA" +
		    					"\n13 - ARROZ | 14 - FEIJÃO | 15 - QUEIJO | 16 - MACARRÃO | 17 - CUSCUZ | 18 - BOLACHA" +
		    					"\n19 - BANANA | 20 - LARANJA | 21 - MAÇÃ | 22 - PESSEGO | 23 - OVO | 24 - FRANGO\n~>");
		    			int escolha2 =  input.nextInt();
		    			switch(escolha2){
		    			
		    			case 1:
		    				item = ("LEITE");
		    				break;
		    			case 2:
		    				item = ("BISCOITO");
		    				break;
		    			case 3:
		    				item = ("UVA");
		    				break;
		    			case 4:
		    				item = ("REFRIGERANTE");
		    				break;
		    			case 5:
		    				item = ("IOGURTE");
		    				break;
		    			case 6:
		    				item = ("SORVETE");
		    				break;
		    			case 7:
		    				item = ("TOMATE");
		    				break;
		    			case 8:
		    				item = ("CEBOLA");
		    				break;
		    			case 9:
		    				item = ("CASTANHA");
		    				break;
		    			case 10:
		    				item = ("BATATA");
		    				break;
		    			case 11:
		    				item = ("FARINHA");
		    				break;
		    			case 12:
		    				item = ("MANTEIGA");
		    				break;
		    			case 13:
		    				item = ("ARROZ");
		    				break;
		    			case 14:
		    				item = ("FEIJAO");
		    				break;
		    			case 15:
		    				item = ("QUEIJO");
		    				break;
		    			case 16:
		    				item = ("MACARRAO");
		    				break;
		    			case 17:
		    				item = ("CUSCUZ");
		    				break;
		    			case 18:
		    				item = ("BOLACHA");
		    				break;
		    			case 19:
		    				item = ("BANANA");
		    				break;
		    			case 20:
		    				item = ("LARANJA");
		    				break;
		    			case 21:
		    				item = ("MACA");
		    				break;
		    			case 22:
		    				item = ("PESSEGO");
		    				break;
		    			case 23:
		    				item = ("OVO");
		    				break;
		    			case 24:
		    				item = ("FRANGO");
		    				break;
		    			default:
		    				item.equals("");
		    				break;
		    			}
		    					    			
		    			jogo.addItemAoCarrinhoDeCompra(item,jogo.getGerenciaItem().valorDoItem(item));
		    			pontuacao -= jogo.getGerenciaItem().valorDoItem(item);		    			
		    			boolean continua = true;		
		    			do{
		    			System.out.println("Seu carrinho de compras: ");
		    			System.out.print("1 - Vizualizar lista\n2 - Vizualizar carrinho\n3 - Adicionar mais itens\n4 - Finalizar compras\n~>");
		    			int opContinuar = input.nextInt();
		    			switch(opContinuar){
		    			case 1:
		    				jogo.imprimeListaGeradaPeloComputador();
		    				break;
		    			case 2:
		    				jogo.imprimeCarrinhoDeCompras();
		    				pontuacao -= penalidadePorConsulta;
		    				break;
		    			case 3:
		    				continua = false;
		    				break;
		    			case 4:
		    				continua = false;
		    				continuaJogo = false;
		    				if(jogo.verificaSeAListaEhValida(jogo.getListaCarrinhoDeCompras(), jogo.getListaComputador())){
		    					jogo.esvaziaCarrinho();
		    					jogo.esvaziaListaDoComputador();
		    					level ++;
		    					
		    				}else{
		    					level = 5;
		    				}
		    				System.out.println("Resultado: " + jogo.verificaSeAListaEhValida(jogo.getListaCarrinhoDeCompras(), jogo.getListaComputador()));

		    				break;
		    			default:
		    				break;
		    				
		    			}
		    			
		    			}while(continua == true);
		    			
		    			
		    		}while(continuaJogo == true);
		    		
		    		
		    		
		    		}
		    		
		    		if(level == 5){
		    			System.out.println("Você perdeu. NOOB!");
		    		}
		    		else if(level == 4){
		    			jogo.novoJogador(nomeJogador1, pontuacao);
		    			jogo.gravaRanking();
		    			System.out.println("Ganhou. PARABÉNS!");
		    		}
		    		else{
		    			level = 1;
		    		}
		    	

		    	
		    	break;
		    case 2:
		    	//instruções o jogo
		    	break;
		    case 3:
		    	System.out.println("~> Ranking <~" );
		    	jogo.imprimeRanking();
		    	break;
		    case 4:
		    	iniciar=false;
		    	break;
		    default:
		    	System.out.println("opção inválida");
		    
		    }
		
		}
	}

}
