package Ejercicio1;

public class ActividadFomentada extends Actividad{
	private double porcentajeSubsidio;
	private double valorSeguro;
	public double getPorcentajeSubsidio() {
		return porcentajeSubsidio;
	}
	public void setPorcentajeSubsidio(double porcentajeSubsidio) {
		this.porcentajeSubsidio = porcentajeSubsidio;
	}
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	@Override 
	public double getCostoSocios() {
		double costo = 0; 
		
		for(Asistente asi:this.getAsistentes()) { 
			if(asi.isSocioActivo()) {
				costo += (this.getValorBaseSocio()*(100-this.porcentajeSubsidio)/100)+this.valorSeguro;
				
			}
			else {
				costo += (this.getValorBaseNoSocio()*(100-this.porcentajeSubsidio)/100)+this.valorSeguro; 
			}
		}
		return costo ;
	}
	
	@Override 
	public double getCosto() {
		return this.getCostoMateriales() + this.getCostoSocios(); 
		
	}
	

}
