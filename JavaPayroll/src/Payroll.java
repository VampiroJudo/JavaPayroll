import javax.swing.JOptionPane;


public class Payroll {

	public static void main(String[] args) {
		
		// get user input
		String employeeName = getInput("Please enter your full name: ");
		String hoursWorkedString = getInput("Please enter the hours worked this week: ");
		String hourlyRateString = getInput("Please enter your hourly rate in decimal format: ");
		String fedTaxRateString = getInput("Please enter your Federal Income Tax withholding rate: ");
		String stateTaxRate = getInput("Please enter your State Tax withholding rate: ");
	
		
		Double hoursWorked = double
	}
	
	public static String getInput(String message){
		String input = JOptionPane.showInputDialog(message);
		return input;
	}

}
