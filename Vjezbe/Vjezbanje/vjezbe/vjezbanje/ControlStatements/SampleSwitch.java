package vjezbe.vjezbanje.ControlStatements;

public class SampleSwitch {

	public SampleSwitch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * The switch statement works like this: The value of the expression is compared with each of the values in the case statements. 
		 * If a match is found, the code sequence following that case statement is executed. 
		 * If none of the constants matches the value of the expression, then the default statement is executed. 
		 * However, the default statement is optional. 
		 * If no case matches and no default is present, then no further action is taken.
		 * The break statement is used inside the switch to terminate a statement sequence. 
		 * When a break statement is encountered, execution branches to the first line of code that follows the entire switch statement. 
		 * This has the effect of “jumping out” of the switch.
		*/
		
		for (int i = 0; i<6; i++)
			switch(i) {
			case 0:
				System.out.println("i is a zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			case 3:
				System.out.println("i is three.");
				break;
			default:
				System.out.println("i is greather than 3.");
			}
		
		System.out.println("");
				
		/**
		 * As you can see, each time through the loop, the statements associated with the case constant that matches i are executed. 
		 * All others are bypassed. After i is greater than 3, no case statements match, so the default statement is executed.
		 * The break statement is optional. 
		 * If you omit the break, execution will continue on into the next case. 
		 * It is sometimes desirable to have multiple cases without break statements between them.
		 */
		// example
		System.out.println("");
		
				for (int i = 0; i<6; i++)
					switch(i) {
					case 0:
						System.out.println("i is a zero. " + i);
						//break;
					case 1:
						System.out.println("i is one. " + i);
						//break;
					case 2:
						System.out.println("i is two. " + i);
						//break;
					case 3:
						System.out.println("i is three.  " + i);
						//break;
					case 4:
						System.out.println("i is four.  " + i);
						//break;
					case 5:
						System.out.println("i is five.  " + i);
						//break;
					default:
						System.out.println("i is greather than 5. " + i);
					
			}

	}

}
