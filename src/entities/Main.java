package entities;
import java.util.ArrayList; 

public class Main {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<>();
		Alumno alumno = new Alumno();
		notas.add(8.0);
		notas.add(7.99);
		notas.add(4.0);
		notas.add(2.0);
		notas.add(8.0);
		System.out.println(alumno.getEstado(notas)); 
		

	}

}
