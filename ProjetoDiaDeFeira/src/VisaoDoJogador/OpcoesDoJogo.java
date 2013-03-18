package VisaoDoJogador;

import javax.swing.*;

import LogicaDoJogo.Item;

public class OpcoesDoJogo {
	
	public int escolherItem(){
		try{
			String item = JOptionPane.showInputDialog("ADICIONAR ITEM ");
			int itemConvertido = Integer.parseInt(item);
			return itemConvertido;
		}
		catch(NumberFormatException exc){
			return escolherItem();
		}
	}
	
	public Item adicionarItem(){
		int escolha2 = escolherItem();
				
		switch(escolha2){
	
			case 1:
				return Item.LEITE;
			case 2:
				return Item.BISCOITO;
			case 3:
				return Item.UVA;
			case 4:
				return Item.REFRIGERANTE;
			case 5:
				return Item.IOGURTE;
			case 6:
				return Item.SORVETE;
			case 7:
				return Item.TOMATE;
			case 8:
				return Item.CEBOLA;
			case 9:
				return Item.CAJU;
			case 10:
				return Item.BATATA;
			case 11:
				return Item.FARINHA;
			case 12:
				return Item.MANTEIGA;
			case 13:
				return Item.ARROZ;
			case 14:
				return Item.FEIJÃO;
			case 15:
				return Item.QUEIJO;
			case 16:
				return Item.MACARRÃO;
			case 17:
				return Item.CUSCUZ;
			case 18:
				return Item.BOLACHA;
			case 19:
				return Item.BANANA;
			case 20:
				return Item.LARANJA;
			case 21:
				return Item.MAÇÃ;
			case 22:
				return Item.AMEIXA;
			case 23:
				return Item.OVO;
			case 24:
				return Item.CHOCOLATE;
			case 25:
				return Item.ABACATE;
			case 26:
				return Item.ABACAXI;
			default:
				return Item.VAZIO;
		}
	}
	
	

}
