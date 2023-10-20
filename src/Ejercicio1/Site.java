package Ejercicio1;

public abstract class Site {
	private int id;
	private double outgoingtransferMb;
	private double storageUsageMB;
	private Hosting hosting ;
	
	public Hosting getHosting() {
		return hosting;
	}
	public void setHosting(Hosting hosting) {
		this.hosting = hosting;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOutgoingtransferMb() {
		return outgoingtransferMb;
	}
	public void setOutgoingtransferMb(double outgoingtransferMb) {
		this.outgoingtransferMb = outgoingtransferMb;
	}
	public double getStorageUsageMB() {
		return storageUsageMB;
	}
	public void setStorageUsageMB(double storageUsageMB) {
		this.storageUsageMB = storageUsageMB;
	} 
	public double getCost() {
		return 0;
	}
}
