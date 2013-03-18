package LogicaDoJogo;

import java.util.*;

public class JogoFachada {
	
	private Ranking ranking = new Ranking();
	private Jogador novoJogador;
	private ListaDoComputador listaDeItensComputador;
	private Carrinho carrinhoDeCompras = new Carrinho();
	private int level = 1;
	
	public void gravaRanking(){
		this.ranking.salvaRanking(novoJogador);
	}
	public List<Jogador> recuperarRanking(){
		return this.ranking.recuperaRanking();
	}
	
	public void novoJogador(String nome, int pontuacao){
		this.novoJogador = new Jogador(nome, pontuacao);
	}
	
	public boolean verificaSeARespostaEhValida(){
		return 	this.listaDeItensComputador.getLista().compararListas(this.listaDeItensComputador.getListaGeradaPeloComputador(), this.carrinhoDeCompras.getListaCarrinhoDeCompras());
	}
	
	public void addItemAoCarrinhoDeCompra (Item item,int moedas){
		this.carrinhoDeCompras.addAoCarrinhoDeCompras(new GerenciaItem(item , moedas));
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public void setLevel(int level){
		this.level = level;
	}
	public void mudarLevel(){
		this.listaDeItensComputador = new ListaDoComputador(this.level);
	}
		
	public ArrayList<GerenciaItem> getListaComputador(){
		return this.listaDeItensComputador.getListaGeradaPeloComputador();
	}
	
	public ArrayList<GerenciaItem> getListaCarrinhoDeCompras(){
		return this.carrinhoDeCompras.getListaCarrinhoDeCompras();
	}
	
	public ListaDoComputador getLista(){
		return this.listaDeItensComputador;
		
	}
	
	public void esvaziarListaDeItensDoComputador(){
		this.listaDeItensComputador.esvaziarLista();
	}

	public void esvaziarCarrinhoDeCompras(){
		this.carrinhoDeCompras.esvaziarLista();
	}

}
