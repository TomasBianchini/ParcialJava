package entities;
import java.util.ArrayList; 
public class Main {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<>();
		Palabras p = new Palabras(); 
		nombres.add("juan");
		nombres.add("juaan");
		nombres.add("juana");
		nombres.add("juanaaa");
		nombres.add("juanaaa");
		nombres.add("juanaaa");
		System.out.println(p.cantLargas(nombres, 5));
	}

}
