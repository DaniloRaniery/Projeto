package LogicaDoJogo;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TestaFachada {
	

	@Test
	public void test() {
		Ranking ranking = new Ranking();
		JogoFachada jogo = new JogoFachada();
		GerenciaItem gerenciaItem = new GerenciaItem();
		ArrayList<GerenciaItem> itens = new ArrayList<GerenciaItem>();
		Jogador jogador = new Jogador();
		
		
		
		jogo.addItemAoCarrinhoDeCompra(Item.ABACATE, gerenciaItem.valorDoItem(Item.ABACATE));
		jogo.addItemAoCarrinhoDeCompra(Item.CHOCOLATE, gerenciaItem.valorDoItem(Item.CHOCOLATE));
		
		assertTrue(jogo.getListaCarrinhoDeCompras().get(0).getItem().equals(Item.ABACATE));
		assertTrue(jogo.getListaCarrinhoDeCompras().get(1).getItem().equals(Item.CHOCOLATE));
		assertFalse(jogo.getListaCarrinhoDeCompras().get(0).getItem().equals(Item.ARROZ));
		
		assertTrue(jogo.getListaCarrinhoDeCompras().size()==2);

		itens.add(new GerenciaItem(Item.ABACATE,gerenciaItem.valorDoItem(Item.ABACATE)));
		itens.add(new GerenciaItem(Item.CHOCOLATE,gerenciaItem.valorDoItem(Item.CHOCOLATE)));
		
		assertTrue(jogo.getListaCarrinhoDeCompras().equals(itens));
		
		itens.remove(itens.get(0));
		
		assertTrue(itens.size()==1);
		
		assertFalse(jogo.getListaCarrinhoDeCompras().equals(itens));
		
		jogo.esvaziarCarrinhoDeCompras();
		
		assertTrue(jogo.getListaCarrinhoDeCompras().size()==0);
		
		
		jogo.getListaCarrinhoDeCompras();
		
		assertTrue(jogo.getListaCarrinhoDeCompras().size()==0);
		
		assertTrue(jogo.getLevel()==1);
		
		jogo.setLevel(2);
		
		assertTrue(jogo.getLevel()==2);
		
		jogo.novoJogador("José", 0);
		assert(jogador.getNome().equals("José"));
		assert(jogador.getPontuacao()==150);
		
		ranking.salvaRanking(new Jogador("José", 0));
		
		assertTrue(ranking.recuperaRanking().get(0).getPontuacao()== 0);
		assertEquals(ranking.recuperaRanking().get(0).getNome(),("José"));
		
		assertFalse(ranking.recuperaRanking().get(0).getPontuacao()==100);
		
		
	}
}