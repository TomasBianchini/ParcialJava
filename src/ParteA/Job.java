package ParteA;

public class Job {
	private int id;  
	private String name; 
	private String description;
	private double stimatedHours;
	private double insuranceCost;
	private WorkType workType; 
	

	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getStimatedHours() {
		return stimatedHours;
	}
	public void setStimatedHours(double stimatedHours) {
		this.stimatedHours = stimatedHours;
	}
	public double getInsuranceCost() {
		return insuranceCost;
	}
	public void setInsuranceCost(double insuranceCost) {
		this.insuranceCost = insuranceCost;
	} 
	
	public double getOveralBudget() {
		return this.insuranceCost; 
	}

}
