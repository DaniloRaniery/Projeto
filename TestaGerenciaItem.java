import static org.junit.Assert.*;
import org.junit.*;
public class TestaGerenciaItem {
	
	@Test
	public void testa(){
		GerenciaItem item = new GerenciaItem(Item.BANANA, Moeda.DUAS);
		assertEquals(item.getItem(),Item.BANANA);
		item.setItem(Item.ARROZ);
		assertEquals(item.getItem(),Item.ARROZ);
		
		GerenciaItem item2 = new GerenciaItem();
		assertEquals(item2.getItem(),Item.VAZIO);
		assertEquals(item2.getMoedas(),Moeda.ZERO);
		item2.setMoedas(Moeda.DEZ);
		assertEquals(item2.getMoedas(),Moeda.DEZ);
		 
		
	}

}
