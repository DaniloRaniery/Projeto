package br.ufpb.poo;

import java.util.*;
import java.io.*;

public class JogoFacada {
	
	private Persistencia persistencia = new Persistencia();
	private Player novoJogador;
	private GerenteDeListas gerenciaListas = new GerenteDeListas();
	private GerenciaItem gerenciaItem = new GerenciaItem();
	private GerenciaItem novoItem = new GerenciaItem();
	private ArrayList<GerenciaItem> listaDeItensComputador = new ArrayList<GerenciaItem>();
	private ArrayList<GerenciaItem> carrinhoDeCompras = new ArrayList<GerenciaItem>();
	
	
	public GerenciaItem getGerenciaItem(){
		return this.gerenciaItem;
	}
	
	public GerenciaItem getNovoItem(){
		return this.novoItem;
	}
	
	public void gravaRanking(){
		List<Player> players;
		
		try{
			players = this.persistencia.recuperaRanking();
		}
		catch(IOException exc){
			players = new ArrayList<Player>();
			players.add(this.novoJogador);
		}
		
		if( players.size() <5){
			players.add(this.novoJogador);
		}
		else{
			for (Player aux : players){
				if (aux.getPontuacao() < this.novoJogador.getPontuacao()){
					players.add(this.novoJogador);
					Collections.sort((List)(players)); 
					break;
				}
			}
		}
		try{
			List<Player> listaParaGravar = new ArrayList<Player>();
			for(Player aux: players){
				if (listaParaGravar.size()<5){
					listaParaGravar.add(aux);
				}
			}
			this.persistencia.gravaRanking(listaParaGravar);
		}
		catch(IOException exc){
			players = new ArrayList<Player>();
		}
	}
	
	public void imprimeRanking(){
		List<Player> players;
		
		try{
			players = this.persistencia.recuperaRanking();
		}
		catch(IOException exc){
			players = new ArrayList<Player>();
		}
		if(players.size()==0){
			System.out.println ("Ranking vazio");
		}
		else{
			for(Player aux : players){
			 System.out.println(aux.toString());
			}
		}
	}
	
	public void novoJogador(String nome, int pontuacao){
		this.novoJogador = new Player(nome, pontuacao);
	}
	public Player getJogador(){
		return this.novoJogador;
	}
	
	public boolean verificaSeAListaEhValida(ArrayList<GerenciaItem> listaCarrinho, ArrayList<GerenciaItem> listaComputador){
		return 	this.gerenciaListas.compararListas(listaCarrinho, listaComputador);

	}
	
	public ArrayList<GerenciaItem> listaGeradaPeloComputador(int level){
		return this.gerenciaListas.gerarListaAleatoria(level);
	
	}
	
	public void imprimeCarrinhoDeCompras(){
		if(this.carrinhoDeCompras.size() != 0){
			for(GerenciaItem retorno:this.carrinhoDeCompras){
				System.out.println(retorno.toString());
			}
		}
	}
	
	public void imprimeListaGeradaPeloComputador(){
		if(this.listaDeItensComputador.size() != 0){
			for(GerenciaItem retorno:this.listaDeItensComputador){
				System.out.println(retorno.toString());
			}
		}
	}
	
	public void addItemAoCarrinhoDeCompra (String item,int moedas){
		this.carrinhoDeCompras.add(new GerenciaItem( item , moedas));
	}
	
	public void listaPorLevel(int level){
		this.listaDeItensComputador = this.gerenciaListas.gerarListaAleatoria(level);
	}
	
	public ArrayList<GerenciaItem> getListaComputador(){
		return this.listaDeItensComputador;
	}
	
	public ArrayList<GerenciaItem> getListaCarrinhoDeCompras(){
		return this.carrinhoDeCompras;
	}
	
	public void esvaziaCarrinho(){
		this.carrinhoDeCompras = new ArrayList<GerenciaItem>();
	}
	
	public void esvaziaListaDoComputador(){
		this.listaDeItensComputador = new ArrayList<GerenciaItem>();
	}
}
