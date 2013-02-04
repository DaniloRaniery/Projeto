import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.io.*;

public class TestPersistencia {
	
	@Test
	public void TesteDePersistencia(){
		Player jogador1 = new Player ("aluno");
		Player jogador2 = new Player ("aluna");
		
		assertEquals("aluno", jogador1.getNome());
		assertEquals("aluna", jogador2.getNome());
		
		List<Player> jogadores = new ArrayList<Player>();
		jogadores.add(jogador1);
		jogadores.add(jogador2);
		
		assertTrue(jogadores.size() == 2);
		
		Persistencia gravador = new Persistencia();
		
		try{
			gravador.gravaRanking(jogadores);
			System.out.println("Arquivo gravado.");
		}
		catch(IOException exc){
			fail("Arquivo não gravado.");
		}
		
		try{
			gravador.recuperaRanking();
			System.out.println("Arquivo recuperado.");
		}
		catch(IOException exc){
			fail("Arquivo não recuperado.");
		}
		
	}

}
