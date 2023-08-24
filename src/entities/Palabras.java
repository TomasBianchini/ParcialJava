package entities;
import java.util.ArrayList; 
public class Palabras {
	/*Dada la siguiente definición de un método que recibe, una lista de nombres y un número. 
	 * Codifique el mismo para que devuelva la cantidad de palabras
	que tienen más letras que el número ingresado.*/
	public int cantLargas(ArrayList<String> listaNombres, int tamanio) {
		int cantPalabras = 0; 
		for(String nombre: listaNombres) {
			if(nombre.length() >= tamanio) cantPalabras += 1;
		}
		return cantPalabras; 
	}
}
