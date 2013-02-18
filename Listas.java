package br.ufpb.poo;

import java.util.*;

public class Listas {
	
	private GerenciaItem[] itens =  new GerenciaItem[24];
	private ArrayList<Integer> numeroAnterior = new ArrayList<Integer>();
	private int valor1 = 1;
	private int valor2 = 2;
	private int valor3 = 5;
	private int valor4 = 10;
	
	public GerenciaItem getItem(){
		boolean condicao = true;
		int n = 0;
		while(condicao){
			n = (int) (1+Math.random()*23);
			if(!(this.numeroAnterior.contains(n))){
				condicao = false;
			}
		}
		this.numeroAnterior.add(n);
		return itens[n];
	}
	
	public Listas(){
		itens[0] = new GerenciaItem("LEITE",this.valor1);
		itens[1] = new GerenciaItem("BISCOITO",this.valor1);
		itens[2] = new GerenciaItem("UVA",this.valor1);
		itens[3] = new GerenciaItem("REFRIGERANTE",this.valor1);
		itens[4] = new GerenciaItem("IOGURTE",this.valor1);
		itens[5] = new GerenciaItem("SORVETE",this.valor1);
		itens[6] = (new GerenciaItem("TOMATE",this.valor2));
		itens[7] = (new GerenciaItem("CEBOLA",this.valor2));
		itens[8] = (new GerenciaItem("CASTANHA",this.valor2));
		itens[9] = (new GerenciaItem("BATATA",this.valor2));
		itens[10] = (new GerenciaItem("FARINHA",this.valor2));
		itens[11] = (new GerenciaItem("MANTEIGA",this.valor2));
		itens[12] = (new GerenciaItem("ARROZ",this.valor3));
		itens[13] = (new GerenciaItem("FEIJAO",this.valor3));
		itens[14] = (new GerenciaItem("QUEIJO",this.valor3));
		itens[15] = (new GerenciaItem("MACARRAO",this.valor3));
		itens[16] = (new GerenciaItem("CUSCUZ",this.valor3));
		itens[17] = (new GerenciaItem("BOLACHA",this.valor3));
		itens[18] = (new GerenciaItem("BANANA",this.valor4));
		itens[19] = (new GerenciaItem("LARANJA",this.valor4));
		itens[20] = (new GerenciaItem("MACA",this.valor4));
		itens[21] = (new GerenciaItem("PESSEGO",this.valor4));
		itens[22] = (new GerenciaItem("OVO",this.valor4));
		itens[23] = (new GerenciaItem("FRANGO",this.valor4));	
	}
}
