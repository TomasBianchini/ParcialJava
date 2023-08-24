package entities;

import java.util.LinkedList;

/*Las oficinas tienen servicios que se brindan junto al alquiler, cada uno de estos servicios
tienen un costo mensual que debe sumarse al importeBase para calcular el alquiler*/
public class Oficina extends Propiedad{
	private boolean pisoTecnico;
	private LinkedList<Servicio> servicios; 

	public boolean isPisoTecnico() {
		return pisoTecnico;
	}

	public void setPisoTecnico(boolean pisoTecnico) {
		this.pisoTecnico = pisoTecnico;
	} 
	public LinkedList<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(LinkedList<Servicio> servicios) {
		this.servicios = servicios;
	} 
	
	public double getMontoServicios() {
		double montoServicios=0; 
		for(Servicio ser: servicios) {
			montoServicios += ser.getCostoMensual();
		}
		return montoServicios; 
	}
	@Override
	public double getAlquilerMensual(){

		return this.getImporteBase()+ this.getMontoServicios(); 
		
	}

}
