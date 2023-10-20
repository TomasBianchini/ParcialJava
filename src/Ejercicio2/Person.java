package Ejercicio2;
import java.util.LinkedList; 
public class Person {
	private LinkedList<Activity> activities ;

	public LinkedList<Activity> getActivities() {
		return activities;
	}

	public void setActivities(LinkedList<Activity> activities) {
		this.activities = activities;
	}
	public double getBilling(double socialConcernDiscountPercentage) {
		double billing = 0; 
		for(Activity activity : activities) {
			if(activity.isOfSocialConcern()) {
				billing += activity.getCost() * socialConcernDiscountPercentage ;
			}else {
				billing += activity.getCost(); 
			}
		}
		return billing; 
		
	}


}
