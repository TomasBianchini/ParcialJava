package Ejercicio1;

public abstract class Hosting {
	private boolean usesCdn; 
	private boolean usesVps;

	public boolean isUsesCdn() {
		return usesCdn;
	}
	public void setUsesCdn(boolean usesCdn) {
		this.usesCdn = usesCdn;
	}
	public boolean isUsesVps() {
		return usesVps;
	}
	public void setUsesVps(boolean usesVps) {
		this.usesVps = usesVps;
	} 
	public double getCost(Site s) {
		return 0; 
	}
	
}
