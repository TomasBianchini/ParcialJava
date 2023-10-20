package ParteA;

public class HourlyRatedJob extends Job {
	private  Contratist contratist;

	public Contratist getContratist() {
		return contratist;
	}

	public void setContratist(Contratist contratist) {
		this.contratist = contratist;
	} 
   @Override 
   public double getOveralBudget() {
	   return this.getStimatedHours() * this.contratist.getHourlyRate() + this.getInsuranceCost(); 
   }
}
