import java.util.*;

public class GerenteDeListas {
	
	private ArrayList<GerenciaItem> listaDeItensCarrinho;
	private ArrayList<GerenciaItem> listaDeItensComputador;
	
	public GerenteDeListas(){	
		this.listaDeItensCarrinho = new ArrayList<GerenciaItem>();
	}
		
	public void armazenar(GerenciaItem itens){
		this.listaDeItensCarrinho.add(itens);
	}
	
	public int size(){	
		return this.listaDeItensCarrinho.size();		
	}
	
	public ArrayList<GerenciaItem> getListaGeradaPeloComputador(){
		return this.listaDeItensComputador;
	}
	
	public String getCarrinhoDeCompras(){
		if(listaDeItensCarrinho.size() != 0){
			for(GerenciaItem retorno:listaDeItensCarrinho){
				return retorno.toString();
			}
		}
		return null;
	}
	
	
}