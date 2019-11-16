/**
 * 
 */
package vjezbe.vjezbanje.ControlStatements;

/**
 * @author emahr
 *
 */
public class StringSwitch {

	/**
	 * 
	 */
	public StringSwitch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String in switch
		String str = "two";
		
		switch(str) {
		case "one":
			System.out.println("one");
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
			break;			
		}

	}

}
