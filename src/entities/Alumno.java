package entities;

import java.util.ArrayList;

public class Alumno {
	
	public String getEstado(ArrayList<Double> notas) {
		String estado = " "; 
		double acumulador = 0, promedio = 0; 
		for(double nota : notas) {
			acumulador += nota; 
		}
		promedio = acumulador / notas.size(); 
		if(promedio < 6) {
			estado = "NA" ;
		}else if (promedio >= 6 && promedio <= 8){
			estado = "A" ;
		}else if (promedio > 8) {
			estado = "A+" ;
		}
		
		return estado ;
	}
}
