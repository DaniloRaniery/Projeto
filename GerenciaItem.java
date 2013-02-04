
public class GerenciaItem {
	
	private Item item;
	private Moeda moedas;
	
	public GerenciaItem() {
		this(Item.VAZIO, Moeda.ZERO);
	}

	public GerenciaItem(Item item, Moeda moedas){
		this.item = item;
		this.moedas = moedas;
	}
		
	public Item getItem(){
		return this.item;
	}
		
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Moeda getMoedas(){
		return this.moedas;
	}
		
	public void setMoedas(Moeda moedas) {
		this.moedas = moedas;
	}
		
	public String toString(){
		return "Item: " + this.item + "Moedas: " + this.moedas ;
	}
	
	public int getValorDaMoeda(){
		if(moedas == Moeda.ZERO){
			return 0;	
		}
			
		else if(moedas == Moeda.UMA){
			return 1;
		}
			
		else if(moedas == Moeda.DUAS){
			return 2;
		}
		
		else if(moedas == Moeda.CINCO){
			return  5;
		}
			
		else if(moedas == Moeda.DEZ){
			return 10;
		} else{
			
			return 0;
		}
	}
	
}
	
	