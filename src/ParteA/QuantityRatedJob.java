package ParteA;

public class QuantityRatedJob extends Job{
	private double quantity;

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	} 
	@Override
	public double getOveralBudget() {
		return this.quantity * this.getWorkType().getQuantityRate() + this.getInsuranceCost();
	}

}
