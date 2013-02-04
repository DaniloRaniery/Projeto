import java.io.*;

public class Player implements Serializable {
	/**
	 * classe com variaveis nome,pontuação e metodos gets e sets
	 */
	
	private String nome;
	private float pontuacao;
	
	/**
	 * Construtor
	 */
	public Player(){
		this("Sem nome");
	}
	
	/**
	 * 
	 * Costrutor
	 */
	public Player(String nome){
		this.nome=nome;
		this.pontuacao = 0;
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

}
