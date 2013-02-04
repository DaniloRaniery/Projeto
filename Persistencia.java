import java.util.*;
import java.io.*;
	
public class Persistencia {
	
	public List<Player> recuperaRanking () throws IOException {
		ObjectInputStream aux = null;
		try{
			aux = new ObjectInputStream(new FileInputStream("ranking.txt"));
			return (List<Player>)aux.readObject();
		}catch(FileNotFoundException exc){
			throw new IOException("Arquivo não encontrado",exc);
		}catch(ClassNotFoundException exc){
			throw new IOException("Classe não encontrada",exc);
		}catch(IOException exc){
			throw exc;
		}finally{
			if(aux != null){
				aux.close();
			}
		}
	}
	public void gravaRanking(Collection<Player> players)throws IOException{
		ObjectOutputStream aux = null;
		try{
			aux = new ObjectOutputStream(new FileOutputStream(new File("ranking.txt")));
			aux.writeObject(players);
		}catch(FileNotFoundException exc){
			throw new IOException("Arquivo não encontrado", exc);
		}catch(IOException exc){
			System.err.println();
			throw exc;
		}finally{
			if(aux != null){
				aux.close();
			}
		}
}


}
