package ParteB;
import java.util.LinkedList; 
public class Main {

	public double getReimbursement(LinkedList<Expenditure> expenditures,double reimbursementPorcentage) {
		double reimbursament = 0; 
		for(Expenditure expenditure: expenditures) {
			if(expenditure.isReimbursable()) {
				reimbursament += expenditure.getAmount();
			}
		}

		return reimbursament * reimbursementPorcentage; 
	}

}
