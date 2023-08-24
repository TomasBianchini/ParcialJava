package entities;
import java.util.ArrayList; 
public class Mecanico extends Empleado{
	private double valorKm;
	private ArrayList<Vehiculo> vehiculos;
	public double getValorKm() {
		return valorKm;
	}
	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	} 
	/*Los Mecánicos cobran un adicional por los km recorridos en el mes
	por los vehículos que repara. Cada vehículo es reparado por un
	único mecánico. A fin de mes se calcula el total de km recorridos
	por todos los vehículos que repara el mecánico y se lo multiplica por el valorKM pactado*/
	public double getKmTotales() {
		double kms = 0; 
		for(Vehiculo vehiculo: vehiculos) {
			ArrayList<Viaje> viajesDelMes = vehiculo.getViajesDelMes(); 
			for(Viaje viaje : viajesDelMes) {
				kms += viaje.getKms();
			}
		}
		return kms;
	}
	@Override 
	public double getSueldo() {
		return this.getSueldoBase() + this.getKmTotales() * this.valorKm; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
