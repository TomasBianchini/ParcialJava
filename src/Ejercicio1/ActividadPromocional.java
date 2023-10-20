package Ejercicio1;

public class ActividadPromocional extends Actividad{
	private double porcentajeDescuentoSocios;

	public double getPorcentajeDescuentoSocios() {
		return porcentajeDescuentoSocios;
	}

	public void setPorcentajeDescuentoSocios(double porcentajeDescuentoSocios) {
		this.porcentajeDescuentoSocios = porcentajeDescuentoSocios;
	} 
	@Override 
	public double getCostoSocios() {
		double costo = 0; 
		
		for(Asistente asi:this.getAsistentes()) { 
			if(asi.isSocioActivo()) {
				costo += (this.getValorBaseSocio()*(100-this.porcentajeDescuentoSocios)/100);
				
			}
			else {
				costo += this.getValorBaseNoSocio(); 
			}
		}
		return costo ;
	}
	
	@Override 
	public double getCosto() {
		return this.getCostoMateriales() + this.getCostoSocios(); 
		
	}
}
