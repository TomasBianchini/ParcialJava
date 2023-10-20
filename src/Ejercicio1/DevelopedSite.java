package Ejercicio1;

public class DevelopedSite extends Site {
	private double hostingDiscountPercentage; 
	private double	developmentCost;
	
	public double getHostingDiscountPercentage() {
		return hostingDiscountPercentage;
	}
	public void setHostingDiscountPercentage(double hostingDiscountPercentage) {
		this.hostingDiscountPercentage = hostingDiscountPercentage;
	}
	public double getDevelopmentCost() {
		return developmentCost;
	}
	public void setDevelopmentCost(double developmentCost) {
		this.developmentCost = developmentCost;
	}
	
	@Override 
	public double getCost() { 
			
		return this.getHosting().getCost(this) * this.hostingDiscountPercentage + this.developmentCost; 
		
	}
}
