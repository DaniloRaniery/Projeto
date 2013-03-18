package LogicaDoJogo;
import java.util.*;

public class Lista {
	
	private GerenciaItem[] itens =  new GerenciaItem[26];
	private GerenciaItem gerenciaItem = new GerenciaItem();
	private ArrayList<Integer> numeroAnterior = new ArrayList<Integer>();
	private ArrayList<GerenciaItem> lista = new ArrayList<GerenciaItem> ();
	
	public GerenciaItem getItem(){
		boolean condicao = true;
		int n = 0;
		while(condicao){
			n = (int) (1+Math.random()*23);
			if(!(this.numeroAnterior.contains(n))){
				condicao = false;
			}
		}
		this.numeroAnterior.add(n);
		return this.itens[n];
	}
	
	public Lista(){
		this.itens[0] = new GerenciaItem(Item.LEITE,this.gerenciaItem.valorDoItem(Item.LEITE));
		this.itens[1] = new GerenciaItem(Item.BISCOITO,this.gerenciaItem.valorDoItem(Item.BISCOITO));
		this.itens[2] = new GerenciaItem(Item.UVA,this.gerenciaItem.valorDoItem(Item.UVA));
		this.itens[3] = new GerenciaItem(Item.REFRIGERANTE,this.gerenciaItem.valorDoItem(Item.REFRIGERANTE));
		this.itens[4] = new GerenciaItem(Item.IOGURTE,this.gerenciaItem.valorDoItem(Item.IOGURTE));
		this.itens[5] = new GerenciaItem(Item.SORVETE,this.gerenciaItem.valorDoItem(Item.SORVETE));
		this.itens[6] = new GerenciaItem(Item.TOMATE,this.gerenciaItem.valorDoItem(Item.TOMATE));
		this.itens[7] = new GerenciaItem(Item.CEBOLA,this.gerenciaItem.valorDoItem(Item.CEBOLA));
		this.itens[8] = new GerenciaItem(Item.CAJU,this.gerenciaItem.valorDoItem(Item.CAJU));
		this.itens[9] = new GerenciaItem(Item.BATATA,this.gerenciaItem.valorDoItem(Item.BATATA));
		this.itens[10] = new GerenciaItem(Item.FARINHA,this.gerenciaItem.valorDoItem(Item.FARINHA));
		this.itens[11] = new GerenciaItem(Item.MANTEIGA,this.gerenciaItem.valorDoItem(Item.MANTEIGA));
		this.itens[12] = new GerenciaItem(Item.ARROZ,this.gerenciaItem.valorDoItem(Item.ARROZ));
		this.itens[13] = new GerenciaItem(Item.FEIJÃO,this.gerenciaItem.valorDoItem(Item.FEIJÃO));
		this.itens[14] = new GerenciaItem(Item.QUEIJO,this.gerenciaItem.valorDoItem(Item.QUEIJO));
		this.itens[15] = new GerenciaItem(Item.MACARRÃO,this.gerenciaItem.valorDoItem(Item.MACARRÃO));
		this.itens[16] = new GerenciaItem(Item.CUSCUZ,this.gerenciaItem.valorDoItem(Item.CUSCUZ));
		this.itens[17] = new GerenciaItem(Item.BOLACHA,this.gerenciaItem.valorDoItem(Item.BOLACHA));
		this.itens[18] = new GerenciaItem(Item.BANANA,this.gerenciaItem.valorDoItem(Item.BANANA));
		this.itens[19] = new GerenciaItem(Item.LARANJA,this.gerenciaItem.valorDoItem(Item.LARANJA));
		this.itens[20] = new GerenciaItem(Item.MAÇÃ,this.gerenciaItem.valorDoItem(Item.MAÇÃ));
		this.itens[21] = new GerenciaItem(Item.AMEIXA,this.gerenciaItem.valorDoItem(Item.AMEIXA));
		this.itens[22] = new GerenciaItem(Item.OVO,this.gerenciaItem.valorDoItem(Item.OVO));
		this.itens[23] = new GerenciaItem(Item.CHOCOLATE,this.gerenciaItem.valorDoItem(Item.CHOCOLATE));	
		this.itens[24] = new GerenciaItem(Item.ABACATE, this.gerenciaItem.valorDoItem(Item.ABACATE));
		this.itens[25] = new GerenciaItem(Item.ABACAXI, this.gerenciaItem.valorDoItem(Item.ABACAXI));
	}
	
	public void esvaziarLista(){
		this.lista = new ArrayList<GerenciaItem>();
	}
	
	public ArrayList<GerenciaItem> getLista(){
		return this.lista;
	}
	
	public GerenciaItem getGerenteDeItens(){
		return this.gerenciaItem;
	}
				
	public boolean compararListas(ArrayList<GerenciaItem> listaDeItensCarrinho, ArrayList<GerenciaItem> listaDeItensComputador){
		ArrayList<GerenciaItem> itens = new ArrayList<GerenciaItem>();
		if(listaDeItensCarrinho.size()==listaDeItensComputador.size()){
			for(GerenciaItem auxCarrinho : listaDeItensCarrinho){
				for(GerenciaItem auxLista : listaDeItensComputador){
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
}
