import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GerenteDeListas itensEscolhidosPeloUsuario = null;
		Item item = null;
		Moeda moedas = null;
		boolean continuaJogo = true;
		do{
		System.out.println("Adicionar item");
		System.out.println(" 1 - BANANA\n2 -MACA\n3 - LARANJA\n4 - PESSEGO\n5 -ARROZ\n6 - FEIJAO\n7 - QUEIJO;");
		int escolha =  input.nextInt();
		switch(escolha){
		
		case 1:
			item = Item.BANANA;
			moedas = Moeda.DUAS;
			break;
		case 2:
			item = Item.MACA;
			moedas = Moeda.UMA;
			break;
		case 3:
			item = Item.LARANJA;
			moedas = Moeda.DUAS;
			break;
		case 4:
			item = Item.PESSEGO;
			moedas = Moeda.UMA;
			break;
		case 5:
			item = Item.ARROZ;
			moedas = Moeda.CINCO;
			break;
		case 6:
			item = Item.FEIJAO;
			moedas = Moeda.CINCO;
			break;
		case 7:
			item = Item.QUEIJO;
			moedas = Moeda.DEZ;
		default:
			item = Item.VAZIO;
			moedas = Moeda.ZERO;
			break;

		}
		
		GerenciaItem novoItem = new GerenciaItem (item,moedas);
		itensEscolhidosPeloUsuario.armazenar(novoItem);
		
		System.out.println("Seu carrinho de compras: ");
		System.out.println("1 - Consultar lista 2 - Adicionar mais itens 3 - Finalizar compras");
		int opContinuar = input.nextInt();
		
		switch(opContinuar){
		case 1:
			//TO DO
			break;
		case 2:
			continuaJogo = true;
			break;
		case 3:
			continuaJogo = false;
			break;
		default:
			System.out.println();
			
			
		}
		}while(continuaJogo == true);
	}

}
