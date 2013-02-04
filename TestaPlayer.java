import static org.junit.Assert.*;
import org.junit.*;
public class TestaPlayer {
	
	//Felipe
	
	@Test
	public void testa(){
		 Player player= new Player();
		 assertEquals(player.getNome(),"PC");
		 player.setPontuacao(1000);
		 assertTrue(player.getPontuacao()==1000);
		 
		
	}

}
