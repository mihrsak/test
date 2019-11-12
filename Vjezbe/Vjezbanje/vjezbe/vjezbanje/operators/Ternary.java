package vjezbe.vjezbanje.operators;

public class Ternary {

	public Ternary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//expression1 ? expression2 : expression3
		
		//expression1 can be any expression that evaluates to a boolean value. 
		//If expression1 is true, then expression2 is evaluated; otherwise, expression3 is evaluated. 
		//The result of the ? operation is that of the expression evaluated. 
		//Both expression2 and expression3 are required to return the same (or compatible) type, which can’t be void.
		
		int i, k;
		
		i = 10;
		k = i < 0 ? -i : i; // get apsolute value of i
		System.out.print("Absolute value of ");
		System.out.println(i + " is " + k);
		
		i = -10;
		k = i < 0 ? -i : i; // get apsolute value of i
		System.out.print("Absolute value of ");
		System.out.println(i + " is " + k);
		

	}

}
