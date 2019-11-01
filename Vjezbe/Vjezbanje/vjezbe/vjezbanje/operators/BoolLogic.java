package vjezbe.vjezbanje.operators;

public class BoolLogic {

	public BoolLogic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean a = true;
			boolean b = false;
			boolean c = a | b;
			boolean d = a & b;
			boolean e = a ^ b;
			boolean x = (!a & b);
			boolean y = (a & !b);
			boolean f = (!a & b) | (a & !b);
			boolean g = !a;
			
			System.out.println("               a = " + a);
			System.out.println("               b = " + b);
			System.out.println("             a|b = " + c);
			System.out.println("             a&b = " + d);
			System.out.println("             a^b = " + e);
			System.out.println("            !a&b = " + x);
			System.out.println("            a&!b = " + y);
			System.out.println(" (!a&b) | (a&!b) = " + f);
			System.out.println("              !a = " + g);
	}

}
