package Ejercicio1;

public class OnDemandHosting extends Hosting  {
	private double pricePerMBTransfered; 
	private double storagePricePerMB;
	public double getPricePerMBTransfered() {
		return pricePerMBTransfered;
	}
	public void setPricePerMBTransfered(double pricePerMBTransfered) {
		this.pricePerMBTransfered = pricePerMBTransfered;
	}
	public double getStoragePricePerMB() {
		return storagePricePerMB;
	}
	public void setStoragePricePerMB(double storagePricePerMB) {
		this.storagePricePerMB = storagePricePerMB;
	} 
	@Override 
	public double getCost(Site s) {
		double cost = 0; 

		cost = s.getStorageUsageMB() * this.getStoragePricePerMB();
		if(this.isUsesCdn()) {
			cost = s.getOutgoingtransferMb() * this.getPricePerMBTransfered() *2; 
		}else {
			cost = s.getOutgoingtransferMb() * this.getPricePerMBTransfered();
		}
		if(this.isUsesVps()) {
			cost = cost *1.4; 
		 }
		return cost; 
}
}




