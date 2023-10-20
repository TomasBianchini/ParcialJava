package Ejercicio1;
import java.util.LinkedList; 
public class Actividad {
	private int id; 
	private String nombre; 
	private String descripcion; 
	private double valorBaseSocio; 
	private double valorBaseNoSocio;
	private LinkedList<Asistente> asistentes; 
	private LinkedList<Material> materiales; 
	
	public LinkedList<Asistente> getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(LinkedList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}
	public LinkedList<Material> getMateriales() {
		return materiales;
	}
	public void setMateriales(LinkedList<Material> materiales) {
		this.materiales = materiales;
	}
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getValorBaseSocio() {
		return valorBaseSocio;
	}
	public void setValorBaseSocio(double valorBaseSocio) {
		this.valorBaseSocio = valorBaseSocio;
	}
	public double getValorBaseNoSocio() {
		return valorBaseNoSocio;
	}
	public void setValorBaseNoSocio(double valorBaseNoSocio) {
		this.valorBaseNoSocio = valorBaseNoSocio;
	}
	public double getCostoSocios() {
		double costo = 0; 
		
		for(Asistente asi:asistentes) { 
			if(asi.isSocioActivo()) {
				costo += this.valorBaseSocio;
			}
			else {
				costo += this.valorBaseNoSocio; 
			}
		}
		return costo ;
	}
	
	public double getCostoMateriales() {
		double costo = 0; 	
		for(Material mat: materiales) {
			costo += mat.getValor(); 
		}
		return costo;
	}
		
	
	public double getCosto() {
		return this.getCostoMateriales()+this.getCostoSocios(); 
	}
	
	
}
