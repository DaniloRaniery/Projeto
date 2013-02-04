import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import java.io.*;

public class TestFacada {
	
	JogoFacada jogo = new JogoFacada();
	Persistencia gravador = new Persistencia();
	
	@Test
	public void testGravaRanking() {
		
		jogo.gravaRanking(new Player("aluno"));
		List<Player> players = new ArrayList<>();
		try{
			players = gravador.recuperaRanking();
		}
		catch(IOException exc){
			players = new ArrayList<>();
		}
		for (Player aux : players){
			System.out.println("Jogador:"+aux.getNome());
		}
		
	}

}
