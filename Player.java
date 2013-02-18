package br.ufpb.poo;

import java.io.*;

public class Player implements Serializable, Comparable<Player> {

	private String nome;
	private float pontuacao;
	
	public Player(){
		this("Sem nome", 0);
	}
	
	public Player(String nome, int pontuacao){
		this.nome = nome;
		this.pontuacao = pontuacao;
	}
	
		
	public String getNome() {
		return nome;
	}
	
	public float getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(float pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public String toString(){
		return ("\n  NOME: " + this.nome + " PONTUAÇÃO: " + this.pontuacao);
	}
	
	public int compareTo(Player player){
		if(this.pontuacao < player.getPontuacao()){
			return 1;
		}
		else if(this.pontuacao == player.getPontuacao()){
			return 0;
		}
		else{
			return -1;
		}
	}
}
