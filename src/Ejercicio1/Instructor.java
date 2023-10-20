package Ejercicio1;

import java.util.LinkedList;

public class Instructor {
	private int id; 
	private String nombre; 
	private  String apellido;
	private double porcentajeComision;
	private LinkedList<Actividad> actividades; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPorcentajeComision() {
		return porcentajeComision;
	}
	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	public LinkedList<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(LinkedList<Actividad> actividades) {
		this.actividades = actividades;
	} 
	
	private double getComision() { 
		double comision = 0; 
		
		for(Actividad act: actividades) { 
			comision += act.getCosto();
		}
		return comision*porcentajeComision; 
	}
}
