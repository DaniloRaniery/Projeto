package LogicaDoJogo;
import java.util.ArrayList;

public class Carrinho {
	
	private Lista lista = new Lista();

	public Carrinho(){	
		this.lista = new Lista();
	}
	
	public void esvaziarLista(){
		this.lista.esvaziarLista();
	}
	
	public void addAoCarrinhoDeCompras(GerenciaItem item){
		this.lista.getLista().add(item);
	}
	
	public ArrayList<GerenciaItem> getListaCarrinhoDeCompras(){
		return this.lista.getLista();
	}
}
