package Ejercicio1;

public class HostedSite extends Site {
	private double maxSupportHs; 
	private double minimunCost;


	public double getMaxSupportHs() {
		return maxSupportHs;
	}
	public void setMaxSupportHs(double maxSupportHs) {
		this.maxSupportHs = maxSupportHs;
	}
	public double getMinimunCost() {
		return minimunCost;
	}
	public void setMinimunCost(double minimunCost) {
		this.minimunCost = minimunCost;
	} 
	
	@Override 
	public double getCost() { 
		if(this.getHosting().getCost(this) < this.minimunCost ) {
			return this.minimunCost; 
		}else {
			return this.getHosting().getCost(this);
		}
	}
}
