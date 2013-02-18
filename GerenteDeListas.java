package br.ufpb.poo;

import java.util.*;

public class GerenteDeListas {
	
	private ArrayList<GerenciaItem> listaDeItensCarrinho;
	private ArrayList<GerenciaItem> listaDeItensComputador;
	private Listas lista = new Listas();
	
	
	
	public GerenteDeListas(){	
		this.listaDeItensCarrinho = new ArrayList<GerenciaItem>();
	}
	
	public void addAoCarrinhoDeCompras(GerenciaItem item){
		this.listaDeItensCarrinho.add(item);
	}
		
	public int size(){	
		return this.listaDeItensCarrinho.size();		
	}
	
	public ArrayList<GerenciaItem> getListaGeradaPeloComputador(){
		return this.listaDeItensComputador;
	}
	
	public boolean compararListas(ArrayList<GerenciaItem> listaDeItensCarrinho, ArrayList<GerenciaItem> listaDeItensComputador){
		ArrayList<GerenciaItem> itens = new ArrayList<GerenciaItem>();
		if(this.listaDeItensCarrinho.size()==this.listaDeItensComputador.size()){
			for(GerenciaItem auxCarrinho : this.listaDeItensCarrinho){
				for(GerenciaItem auxLista : this.listaDeItensComputador){
					if(auxCarrinho.getItem().equals(auxLista.getItem())){
						itens.add(auxCarrinho);
						
					}
				}	
			}
			if(itens.size()==listaDeItensCarrinho.size()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
		
	public ArrayList<GerenciaItem> gerarListaAleatoria(int nivel){
		
		int quantidadeDeItens;
		if(nivel == 1){
			quantidadeDeItens = 4;
		} else if(nivel == 2){
			quantidadeDeItens = 8;
		} else {
			quantidadeDeItens = 10;
		}
		
		ArrayList<GerenciaItem> listaDeRetorno = new ArrayList<GerenciaItem>();
				
		for(int i = 0; i < quantidadeDeItens ; ++i){
			
			listaDeRetorno.add(lista.getItem());
		}
				
		return listaDeRetorno;
		
	}
	
}