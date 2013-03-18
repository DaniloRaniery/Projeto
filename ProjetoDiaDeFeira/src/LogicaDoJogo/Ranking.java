package LogicaDoJogo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ranking {
	
	private Persistencia persistencia = new Persistencia();
	private List<Jogador> jogadores;
	
	public void salvaRanking(Jogador novoJogador){
				
		try{
			this.jogadores = this.persistencia.recuperaRanking();
		}
		catch(IOException exc){
			this.jogadores = new ArrayList<Jogador>();
			this.jogadores.add(novoJogador);
		}
		
		if( this.jogadores.size() <5){
			this.jogadores.add(novoJogador);
		}
		else{
			for (Jogador aux : this.jogadores){
				if (aux.getPontuacao() < novoJogador.getPontuacao()){
					this.jogadores.add(novoJogador);
					break;
				}
			}		
		}
		Collections.sort((List)(this.jogadores)); 
		
		try{
			List<Jogador> listaParaGravar = new ArrayList<Jogador>();
			for(Jogador aux: this.jogadores){
				if (listaParaGravar.size()<5){
					listaParaGravar.add(aux);
				}
			}
			this.persistencia.gravaRanking(listaParaGravar);
		}
		catch(IOException exc){
			this.jogadores = new ArrayList<Jogador>();
		}
	}
	
	public List<Jogador> recuperaRanking(){
				
		try{
			this.jogadores = this.persistencia.recuperaRanking();
		}
		catch(IOException exc){
			this.jogadores = new ArrayList<Jogador>();
		}
		return this.jogadores;
	}
}
