package br.ufpb.poo;

public class GerenciaItem {
	
	private String item;
	private int moedas;	
	
	public GerenciaItem() {
		this("VAZIO",0);
	}

	public GerenciaItem(String item, int moedas){
		this.item = item;
		this.moedas = moedas;
	}
	
	public String getItem(){
		return this.item;
	}
		
	public void setItem(String item) {
		this.item = item;
	}
			
	public String toString(){
		return "Item: " + this.item + "   " ;
	}
		
	public int valorDoItem(String item){
		if(item.equals("TOMATE")){
			return 5;
		} else if(item.equals("CEBOLA")){
			return 5;
		}else if(item.equals("UVA")){
			return 10;
		}else if(item.equals("BATATA")){
			return 5;
		}else if(item.equals("FARINHA")){
			return 5;
		}else if(item.equals("MANTEIGA")){
			return 5;
		}else if(item.equals("ARROZ")){
			return 2;
		}else if(item.equals("FEIJAO")){
			return 2;
		}else if(item.equals("QUEIJO")){
			return 2;
		}else if(item.equals("MACARRAO")){
			return 2;
		}else if(item.equals("BANANA")){
			return 1;
		}else if(item.equals("LARANJA")){
			return 1;
		}else if(item.equals("MACA")){
			return 1;
		}else if(item.equals("PESSEGO")){
			return 1;
		}else if(item.equals("TOMATE")){
			return 5;
		}else if(item.equals("UVA")){
			return 10;
		}else if(item.equals("BATATA")){
			return 5;
		}else if(item.equals("FARINHA")){
			return 5;
		}else if(item.equals("MANTEIGA")){
			return 5;
		}else if(item.equals("BISCOITO")){
			return 10;
		}else if(item.equals("REFRIGERANTE")){
			return 10;
		}else if(item.equals("IOGURTE")){
			return 10;
		}else if(item.equals("SORVETE")){
			return 10;
		}else if(item.equals("LEITE")){
			return 10;
		}else if(item.equals("CUSCUZ")){
			return 2;
		}else if(item.equals("BOLACHA")){
			return 2;
		}else if(item.equals("OVO")){
			return 1;
		}else if(item.equals("FRANGO")){
			return 1;
		}else if(item.equals("CASTANHA")){
			return 5;
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
	
	