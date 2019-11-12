   /**
 * 
 */
package vjezbe.vjezbanje.ControlStatements;

/**
 * @author emahr
 *
 */
public class IfElse {

	/**
	 * 
	 */
	public IfElse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 4; // April
		String season;
		
		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "Winter";
		else
			season = "Bogus month";
		System.out.println("April is in the " + season + ".");	
		
		/**Remember, only one statement can appear directly after the if or the else. 
		If you want to include more statements, you’ll need to create a block, as in this fragment
		Some programmers find it convenient to include the curly braces when using the if, even when there is only one statement in each clause. 
		This makes it easy to add another statement at a later date, and you don’t have to worry about forgetting the braces. 
		In fact, forgetting to define a block when one is needed is a common cause of errors.
		*/
		String monthName = null;
		// will throw a NullPointerException if you try to access it before initializing it, or giving it some value, which means, 
		// the String 'monthName' has not yet been allocated space in memory. In other words, 'monthName' is not present in memory.
		
		month = 8; // August
		if (month == 12 || month == 1 || month == 2) {
			season = "Winter";
			}
		else if (month == 3 || month == 4 || month == 5) {
			season = "Spring";
			}
		else if (month == 6 || month == 7 || month == 8) {
			season = "Summer";
			monthName ="August";
			}
		else if (month == 9 || month == 10 || month == 11) {
			season = "Winter";
			}
		else {
			season = "Bogus month";
		}
		System.out.println(monthName + " is in the " + season + ".");

	}
	


}
