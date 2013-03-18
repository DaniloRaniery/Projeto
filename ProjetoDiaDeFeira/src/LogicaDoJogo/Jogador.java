package LogicaDoJogo;
import java.io.*;

public class Jogador implements Serializable, Comparable<Jogador> {

	private String nome;
	private float pontuacao;
	
	public Jogador(){
		this("Sem nome", 0);
	}
	
	public Jogador(String nome, int pontuacao){
		this.nome = nome;
		this.pontuacao = pontuacao;
	}	
		
	public String getNome() {
		return this.nome;
	}
	
	public float getPontuacao() {
		return this.pontuacao;
	}
	
	public void setPontuacao(float pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public String toString(){
		return ("\n  NOME:  " + this.nome + "           PONTUAÇÃO:  " + this.pontuacao);
	}
	
	public int compareTo(Jogador jogador){
		if(this.pontuacao < jogador.getPontuacao()){
			return 1;
		}
		else if(this.pontuacao == jogador.getPontuacao()){
			return 0;
		}
		else{
			return -1;
		}
	}
}
