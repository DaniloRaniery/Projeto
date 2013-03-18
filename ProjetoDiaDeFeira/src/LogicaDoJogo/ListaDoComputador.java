package LogicaDoJogo;
import java.util.ArrayList;

public class ListaDoComputador{

	private Lista lista = new Lista();
			
	public ListaDoComputador(int level){
		
		int quantidadeDeItens;
		if(level == 1){
			quantidadeDeItens = 4;
		} else if(level == 2){
			quantidadeDeItens = 8;
		} else if (level == 3){
			quantidadeDeItens = 10;
		}
		else{
			quantidadeDeItens = 0;

		}
		for(int i = 0; i < quantidadeDeItens ; i++){
			this.lista.getLista().add(lista.getItem());
		}	
	}
		
	public ArrayList<GerenciaItem> getListaGeradaPeloComputador(){
		return this.lista.getLista();
	}
	
	public void esvaziarLista(){
		this.lista.esvaziarLista();
	}
	
	public Lista getLista(){
		return this.lista;
	}
	

}
