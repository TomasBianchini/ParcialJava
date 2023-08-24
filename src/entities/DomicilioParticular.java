package entities;

public class DomicilioParticular extends Propiedad {

	private boolean usoComercialPermitido; 
	private int habitaciones;
	static double porcentaje; 
	public boolean isUsoComercialPermitido() {
		return usoComercialPermitido;
	}
	public void setUsoComercialPermitido(boolean usoComercialPermitido) {
		this.usoComercialPermitido = usoComercialPermitido;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	} 
	@Override
	public double getAlquilerMensual() {
		return this.getImporteBase() + this.getImporteBase() * this.habitaciones * DomicilioParticular.porcentaje; 
	}
	

}
