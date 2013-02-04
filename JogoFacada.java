import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class JogoFacada {
	
	private Persistencia persistencia = new Persistencia();
	private Player novoJogador;
	
	
	public void gravaRanking(Player novoJogador){
		List<Player> players;
		
		try{
			players = persistencia.recuperaRanking();
		}
		catch(IOException exc){
			players = new ArrayList<>();
		}
		
		for (Player aux : players){
			if (aux.getPontuacao() < novoJogador.getPontuacao()){
				players.remove(players.size());
				players.add(novoJogador);
				Collections.sort((List)(players));
			}
		}
		try{
			this.persistencia.gravaRanking(players);
		}
		catch(IOException exc){
			players = new ArrayList<>();
		}
	}
	
	public String imprimeRanking(){
		return persistencia.toString();
	}
	
	public void novoJogador(String nome){
		novoJogador = new Player(nome);
		
	}
	
	public GerenteDeListas listaGeradaComputador(GerenteDeListas listaItensComp){
		
		//TODO
		return listaItensComp;
	}
	
	public GerenteDeListas 	listaGeradaJogador(GerenteDeListas listaItensJogador){
		//TODO
		//comparar a lista do jogador com a lista do arquivo 
		
		return listaItensJogador;
	}
	
	
	
	
	
	

}
