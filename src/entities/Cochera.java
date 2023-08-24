package entities;
//Las cocheras además del importeBase tienen un cargo extra por cada vehículo que puedan
//tener. Tanto la capacidad de vehículos como el cargo extra varía para cada cochera

public class Cochera extends Propiedad {
	private int capacidadVehiculos; 
	private double cargoExtraPorVehiculo;
	
	public int getCapacidadVehiculos() {
		return capacidadVehiculos;
	}
	public void setCapacidadVehiculos(int capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}
	public double getCargoExtraPorVehiculo() {
		return cargoExtraPorVehiculo;
	}
	public void setCargoExtraPorVehiculo(double cargoExtraPorVehiculo) {
		this.cargoExtraPorVehiculo = cargoExtraPorVehiculo;
	}
	@Override 
	public double getAlquilerMensual() {
		return this.getImporteBase() + this.capacidadVehiculos * this.cargoExtraPorVehiculo; 
		 
	}

	

}
