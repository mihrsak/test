package vjezbe.vjezbanje.ControlStatements;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		do {
			System.out.println("tick " + n);
			n--;
		}   while (n > 0);
		// more efficiently
		do {
			System.out.println("tick " + n);
		} while (--n > 0);
	}

}
