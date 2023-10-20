package ParteA;

public class FixedPriceJob extends Job {
	private double agreedBudget;

	public double getAgreedBudget() {
		return agreedBudget;
	}

	public void setAgreedBudget(double agreedBudget) {
		this.agreedBudget = agreedBudget;
	} 
	@Override 
	public double getOveralBudget() {
		return this.agreedBudget +this.getInsuranceCost(); 
	}
	

}
