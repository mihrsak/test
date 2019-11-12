package vjezbe.vjezbanje.operators;

public class OpEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 1;
			int b = 2;
			int c = 3;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			
			a += 5;
			b *= 4;
			System.out.println("(a * b) = " + a * b);
			c += a * b;
			System.out.println("(c += a * b) = " + c);
			c %= 6;
			System.out.println("(a += 5) = " + a);
			System.out.println("(b *= 4) = " + b);
			System.out.println("(c %= 6) = " + c + ", (6*8 = 48, ostatak 3)");


	}

}
