package br.ufpb.poo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;


public class JogoFacadaTest {

	JogoFacada jogo = new JogoFacada();
		
	@Test
	public void test() {
		ArrayList<GerenciaItem> gerenciaItem = new ArrayList<GerenciaItem>();
		
		
		jogo.novoJogador("Teste", 2);
		assertEquals(jogo.getJogador().getNome(), "Teste");
		
		assertEquals( jogo.getGerenciaItem(), new GerenciaItem());
		
		jogo.addItemAoCarrinhoDeCompra("BANANA", 1);
		
		jogo.listaPorLevel(1);
		assertFalse(jogo.getListaCarrinhoDeCompras().equals(jogo.getListaComputador()));
		
		assertTrue(jogo.getListaComputador().size() == 4);
		
		gerenciaItem.add(new GerenciaItem ("BANANA",1));

		assertTrue (jogo.verificaSeAListaEhValida(jogo.getListaCarrinhoDeCompras(),gerenciaItem ));
	}

}
