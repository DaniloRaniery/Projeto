package LogicaDoJogo;
public class GerenciaItem {
	
	private Item item;
	private int valor;
	private int valor1 = 1, valor2 = 2, valor5 = 5, valor10 = 10;
	
	public GerenciaItem() {
		this(Item.VAZIO,0);
	}

	public GerenciaItem(Item item, int valor){
		this.item = item;
		this.valor = valor;
	}
	
	public Item getItem(){
		return this.item;
	}
			
	public String toString(){
		return "   "+ this.item+"   ";
	}
		
	public int valorDoItem(Item item){
		if(item.equals(Item.LEITE)){
			return this.valor1;
		}else if(item.equals(Item.BISCOITO)){
			return this.valor;
		}else if(item.equals(Item.UVA)){
			return this.valor1;
		}else if(item.equals(Item.REFRIGERANTE)){
			return this.valor1;
		}else if(item.equals(Item.IOGURTE)){
			return this.valor1;
		}else if(item.equals(Item.SORVETE)){
			return this.valor1;
		}else if(item.equals(Item.TOMATE)){
			return this.valor2;
		}else if(item.equals(Item.CEBOLA)){
			return this.valor2;
		}else if(item.equals(Item.CAJU)){
			return this.valor2;
		}else if(item.equals(Item.BATATA)){
			return this.valor2;
		}else if(item.equals(Item.FARINHA)){
			return this.valor2;
		}else if(item.equals(Item.MANTEIGA)){
			return this.valor2;
		}else if(item.equals(Item.ARROZ)){
			return this.valor5;
		}else if(item.equals("FEIJAO")){
			return this.valor5;
		}else if(item.equals("QUEIJO")){
			return this.valor5;
		}else if(item.equals("MACARRAO")){
			return this.valor5;
		}else if(item.equals("CUSCUZ")){
			return this.valor5;
		}else if(item.equals("BOLACHA")){
			return this.valor5;
		}else if(item.equals("BANANA")){
			return this.valor10;
		}else if(item.equals("LARANJA")){
			return this.valor10;
		}else if(item.equals("MACA")){
			return this.valor10;
		}else if(item.equals("AMEIXA")){
			return this.valor10;
		}else if(item.equals("OVO")){
			return this.valor10;
		}else if(item.equals("CHOCOLATE")){
			return this.valor10;
		}else if(item.equals("ABACATE")){
			return this.valor10;
		}else if(item.equals("ABACAXI")){
			return this.valor10;
		}else{
			return 0;
		}
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof GerenciaItem)){
			return false;
		}
		else{
			GerenciaItem gerenciaItem = (GerenciaItem) obj;
			if(this.item.equals(gerenciaItem.getItem())){
				return true;
			}
			else{
				return false;
			}
		}
	}	
}
	
	