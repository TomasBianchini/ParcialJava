package entities;
import java.util.ArrayList; 

public class Guia extends Empleado{
	private String disponibilidad;
	private double valorHora;
	private ArrayList<Idioma> idiomas; 
	private ArrayList<Viaje> viajes;
	public ArrayList<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(ArrayList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	} 
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajesDelMes = new ArrayList<>();
		return viajesDelMes; 
	}
	/*Los Guías cobran los siguientes adicionales:
		○ Adicional por hora que debe multiplicarse por el total de horas
		de los viajes realizados este mes. Este valor es pactado con cada
		Guía.
		○ Adicional por idioma, cada guía puede hablar uno o más idiomas.
		Se les paga un adicional por cada idioma extra que hablan. El
		valor adicional depende del idioma.*/
	
	public double getAdicionalViajes() {
		ArrayList<Viaje> viajesMes = new ArrayList<>();
		viajesMes = this.getViajesDelMes(); 
		double horasTotales= 0;
		for(Viaje viaje :viajesMes  ) {
			horasTotales += viaje.getDuracionHs();
		}
		
		return horasTotales * this.valorHora; 
	}
	public double getAdicionalIdiomas() { 
		double adicionalIdiomas= 0;
		for(Idioma idioma : this.idiomas) {
			adicionalIdiomas += idioma.getAdicionalActual();
		}
		
		return adicionalIdiomas; 
	
	}
	
	@Override
	public double getSueldo(){
		
	return this.getSueldoBase() + this.getAdicionalIdiomas() + this.getAdicionalViajes();
	}
		
		
}
