package Ejercicio1;

public class FixedPriceHosting extends Hosting {
	private double fixedPrice;

	public double getFixedPrice() {
		return fixedPrice;
	}

	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	} 
	@Override 
	public double getCost(Site s) {
		if (this.isUsesVps()) {
			return this.fixedPrice *1.4; 
		}else {
			return this.fixedPrice; 
		}
		
	}
	

}
